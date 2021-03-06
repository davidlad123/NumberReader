/**
 * NumberFilter.java
 * Created: 12 Jul 2012 17:05:12
 * @author David Ladapo
 * Copyright (&copy;) 2011  Zphinx Software Solutions
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * License for more details.
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
package com.zphinx.reader.english.translator;

import com.zphinx.reader.exception.NumberReaderException;
import com.zphinx.reader.messages.Messages;

/**
 * 
 * A class used to filter characters in numbers during translation
 * 
 * @author David Ladapo
 * @version $Id: NumberFilter.java 220 2012-07-14 23:47:59Z rogue $
 *          <p>
 *          Created: 12 Jul 2012 17:05:12<br/>
 *          Copyright (&copy;) 2011 Zphinx Software Solutions
 *          </p>
 */
public final class NumberFilter {

	/**
	 * Default Constructor for singleton instance
	 */
	private NumberFilter() {

	}

	/**
	 * <p>
	 * Filters the input for un acceptable characters removing "," and throws an
	 * exception if it encounters a decimal point.
	 * </p>
	 * <p>
	 * It then validates the residual String for numeric characters and throws
	 * an exception if it finds one within the given String.
	 * <p>
	 * 
	 * @param number
	 *            The string representation of the inputed number
	 * @return A filtered and validated version of the input
	 * @throws A
	 *             numberReaderException if an error occurs
	 */
	public static char[] validateAndFilter(final String number) throws NumberReaderException {
		char[] charArray = number.toCharArray();
		final StringBuilder out = new StringBuilder();
		// filtering input string
		for (char input : charArray) {
			final String stringVal = String.valueOf(input);
			filterCharacter(out, stringVal);

		}
		charArray = parseNumeric(out);
		validateCharacters(charArray);
		return charArray;
	}

	/**
	 * Filters the incoming number for its signed indicator
	 * 
	 * @param number
	 *            The input number passed to this method whose english
	 *            representation will be passed back to the caller
	 * @param sBuilder
	 *            The StringBuilder which may contain verbal representations of
	 *            this number's sign indicator
	 * @return A filtered String ready for usage
	 */
	public static String filterSignIndicator(final String number, final StringBuilder sBuilder) {
		String numToUse = "";
		if (number != null && number.length() > 0) {
			final String firstChar = number.substring(0, 1);

			if (firstChar.equals(TranslatorConstants.STRING_MINUS)) {
				sBuilder.append(TranslatorConstants.MINUS);
				numToUse = number.substring(1, number.length());
			} else if (firstChar.equals(TranslatorConstants.STRING_PLUS)) {
				numToUse = number.substring(1, number.length());
			} else {
				numToUse = number;
			}
		}
		return numToUse;
	}

	/**
	 * Filters an input character.
	 * 
	 * @param out
	 *            The stringBuilder to persist the filtered contents
	 * @param stringVal
	 *            The string value of the character to filter
	 * @throws NumberReaderException
	 *             If the character cannot be filtered
	 */
	private static void filterCharacter(final StringBuilder out, final String stringVal) throws NumberReaderException {
		try {
			// filters String and removes "," and "."
			if (!stringVal.equals(TranslatorConstants.STRING_COMMA)) {
				if (stringVal.equals(TranslatorConstants.STRING_POINT)) {
					throw new NumberReaderException(Messages.getString(TranslatorConstants.DECIMAL_NOT));
				}
				// check validity

				final int valid = Integer.parseInt(stringVal);
				out.append(valid);
			}
		} catch (NumberFormatException e) {
			throw new NumberReaderException(e);

		}

	}

	/**
	 * Validates the length of the characters in the character array.
	 * 
	 * @param charArray
	 *            The array of chars to validate
	 * 
	 * @throws NumberReaderException
	 *             If an error occurs
	 */
	private static void validateCharacters(final char[] charArray) throws NumberReaderException {
		// validations
		if (charArray.length == 0) {
			throw new NumberReaderException(Messages.getString(TranslatorConstants.ENTER_64));
		}
		if (charArray.length > TranslatorConstants.NUMBER_64) {
			throw new NumberReaderException(Messages.getString(TranslatorConstants.GREATER_64));
		}

	}

	/**
	 * <p>
	 * Parse the contents of the String builder for numeric attributes, this
	 * removes irrelevant numeric characters e.g 0
	 * </p>
	 * 
	 * @param out
	 *            The StringBuilder containing the filtered numbers
	 * @return An array of chars used within this application
	 * @throws NumberReaderException
	 *             Throws a NumberReaderException if an error occurs
	 */
	private static char[] parseNumeric(final StringBuilder out) throws NumberReaderException {
		out.trimToSize();

		// run a number parse filter
		char outChar;
		int checker;
		for (int i = 0; i < out.length(); i++) {
			outChar = out.charAt(i);
			checker = Integer.parseInt(String.valueOf(outChar));
			if (checker > 0) {
				out.delete(0, i);
				break;
			}
		}
		final String outString = out.toString();
		return outString.toCharArray();
	}

}
