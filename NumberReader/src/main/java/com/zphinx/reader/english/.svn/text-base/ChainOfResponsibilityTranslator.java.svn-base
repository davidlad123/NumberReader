/**
 * ChainOfResponsibilityTranslator.java
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
 */
package com.zphinx.reader.english;

import com.zphinx.reader.core.Translator;
import com.zphinx.reader.exception.NumberReaderException;

/**
 * 
 * <p>
 * The chain of responsibility translator serves as a default translator which
 * uses the chain of responsibility design pattern to determine what kind of
 * number it is dealing with.
 * </p>
 * <p>
 * It provides base methods for dealing with units,tens and hundreds as they
 * form what can be called primary counters.
 * </p>
 * 
 * @author David Ladapo
 * @version $Id: ChainOfResponsibilityTranslator.java 212 2012-07-12 21:21:52Z
 *          rogue $
 * 
 *          <p>
 *          Created: Dec 15, 2010 6:50:57 PM<br>
 *          Copyright &copy;Zphinx Software Solutions
 *          </p>
 * 
 */
public class ChainOfResponsibilityTranslator implements Translator<PrimaryNumberBuilder> {

	/**
	 * A builder used to build primary numbers
	 */
	private final transient PrimaryNumberBuilder builder;

	/**
	 * Default constructor which uses a number builder as an helper class
	 */
	public ChainOfResponsibilityTranslator() {
		super();
		builder = getNumberBuilder();
	}

	/**
	 * Takes a Number from 1-999 and translates it into english words.
	 * 
	 * @param num
	 *            The String representation of the number to translate.
	 * @return The translated number expressed as english words.
	 * @throws NumberReaderException
	 *             Throws a NumberReaderException if an error occurs
	 */
	public String translateNumber(final String num) throws NumberReaderException {
		final int len = num.length();
		final String trans = num.trim();
		return builder.translateNumberGroup(len, trans);
	}

	/**
	 * Gets a trailing word to append to a set of numbers eg
	 * <code>Million</code>. This method can be extended by adding more numbers
	 * eg billion or trillion as the system already can handle it.
	 * 
	 * @param index
	 *            The index of the array which is passed to this method
	 * @return A word used as the leading word for a group of numbers
	 */
	public String trailingWord(final int index) {
		return builder.trailingWord(index);
	}

	/**
	 * Returns an instance of the PrimaryNumberBuilder associated with this
	 * object.
	 * 
	 * @return An instance of a PrimaryNumberBuilder
	 * @see com.zphinx.reader.core.Translator#getNumberBuilder()
	 */
	public final PrimaryNumberBuilder getNumberBuilder() {

		return new PrimaryNumberBuilder();
	}

}
