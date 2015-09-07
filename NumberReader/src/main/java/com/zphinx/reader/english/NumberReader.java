/**
 * NumberReader.java
 * @author David Ladapo (davidl@zphinx.com)
 * @version  1.0
 * 
 * Copyright &copy;Zphinx Software Solutions
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  License for more details.
 *
 * THERE IS NO WARRANTY FOR THIS SOFTWARE, TO THE EXTENT PERMITTED BY
 * APPLICABLE LAW.  EXCEPT WHEN OTHERWISE STATED IN WRITING BY ZPHINX SOFTWARE SOLUTIONS 
 * AND/OR OTHER PARTIES WHO PROVIDE THIS SOFTWARE "AS IS" WITHOUT WARRANTY
 * OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.  THE ENTIRE RISK AS TO THE QUALITY AND PERFORMANCE OF THE PROGRAM
 * IS WITH YOU.  SHOULD THE PROGRAM PROVE DEFECTIVE, YOU ASSUME THE COST OF
 * ALL NECESSARY SERVICING, REPAIR OR CORRECTION.
 *
 * IN NO EVENT UNLESS REQUIRED BY APPLICABLE LAW OR AGREED TO IN WRITING
 * WILL ANY COPYRIGHT HOLDER, OR ANY OTHER PARTY WHO MODIFIES AND/OR CONVEYS
 * THE PROGRAM AS PERMITTED ABOVE, BE LIABLE TO YOU FOR DAMAGES, INCLUDING ANY
 * GENERAL, SPECIAL, INCIDENTAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE
 * USE OR INABILITY TO USE THE PROGRAM (INCLUDING BUT NOT LIMITED TO LOSS OF
 * DATA OR DATA BEING RENDERED INACCURATE OR LOSSES SUSTAINED BY YOU OR THIRD
 * PARTIES OR A FAILURE OF THE PROGRAM TO OPERATE WITH ANY OTHER PROGRAMS),
 * EVEN IF SUCH HOLDER OR OTHER PARTY HAS BEEN ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGES.
 *
 * For further information, please go to http://www.zphinx.co.uk/
 *
 **/

package com.zphinx.reader.english;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.zphinx.reader.core.Translator;
import com.zphinx.reader.english.translator.AbstractNumberReader;
import com.zphinx.reader.english.translator.NumberFilter;
import com.zphinx.reader.exception.NumberReaderException;
import com.zphinx.reader.messages.Messages;

/**
 * NumberReader is the main class used by this package. It reads and inputs and
 * interpretes it to its english pronounciation.
 * 
 * @author David Ladapo
 * @version $Id: NumberReader.java 214 2012-07-13 01:26:10Z rogue $
 *          <p>
 *          Created: Dec 14, 2010 12:25:02 AM<br>
 *          Copyright &copy;Zphinx Software Solutions
 *          </p>
 **/
public class NumberReader extends AbstractNumberReader<Translator<PrimaryNumberBuilder>> {

	/**
	 * A constant representing the key <code>enter_number</code
	 */
	private static final String ENTER_NUMBER = "enter_number";

	/**
	 * A java.util.logging logger
	 */

	private static final Logger LOGGER = Logger.getLogger(NumberReader.class.getName());

	/**
	 * Default Constructor which takes a translator instance
	 * 
	 * @param translator
	 *            The translator associated with this object
	 */
	public NumberReader(Translator<PrimaryNumberBuilder> translator) {
		super(translator);

	}

	/**
	 * Command line input method for this class. Simply type java
	 * com.zphinx.reader.english.NumberReader [number] from the classpath and
	 * the english translation will be printed on the console.
	 * 
	 * @param args
	 *            The argument passed at invocation.
	 */
	public static void main(final String[] args) {
		if (args.length < 1) {
			printToConsole(Messages.getString(ENTER_NUMBER));
		} else {
			try {
				final NumberReader reader = new NumberReader(new ChainOfResponsibilityTranslator());
				final String trans = reader.translate(args[0]);
				LOGGER.log(Level.INFO, trans);
			}

			catch (NumberReaderException e) {
				printToConsole("Error: " + e.getMessage());
			}

		}
	}

	/**
	 * Prints a message to the user
	 * 
	 * @param message
	 *            The message to print
	 */
	private static void printToConsole(final String message) {

		LOGGER.log(Level.SEVERE, message);

	}

	/**
	 * Translates the given input to an english word version
	 * 
	 * @param number
	 *            The input number passed to this method whose english
	 *            representation will be passed back to the caller
	 * @return A string representing the english representation of this number
	 * @throws NumberReaderException
	 *             Throw a NumberReaderException if an error occurs
	 */
	public final String translate(final String number) throws NumberReaderException {

		final StringBuilder sBuilder = new StringBuilder();

		try {

			final String numToUse = NumberFilter.filterSignIndicator(number, sBuilder);
			final char[] charArray = NumberFilter.validateAndFilter(numToUse);
			processCOR(sBuilder, charArray);

		} catch (Exception e) {
			throw new NumberReaderException(e);
		}
		return trimWords(sBuilder);
	}

	/**
	 * Invokes the chain of responsibility translator and populates the
	 * StringBuilder with a human readable string
	 * 
	 * @param sBuilder
	 *            The StringBuilder which contains the words generated
	 * @param charArray
	 *            The array of input characters
	 * @throws NumberReaderException
	 *             Throw a NumberReaderException if an error occurs
	 */
	private void processCOR(final StringBuilder sBuilder, final char[] charArray) throws NumberReaderException {
		final String[] chunked = chunkNumbers(charArray);
		int index;
		String partialOutput;
		for (int i = 0; i < chunked.length; i++) {
			index = (chunked.length - 1) - i;
			partialOutput = getTranslator().translateNumber(chunked[i]);
			sBuilder.append(partialOutput);
			partialOutput = partialOutput.trim();
			if ((index > 0) && (partialOutput.length() > 0)) {
				sBuilder.append(getTranslator().trailingWord(index));
			}
		}
	}

}
