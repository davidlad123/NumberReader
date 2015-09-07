/**
 * @author David Ladapo (davidl@zphinx.com)
 * @version  1.0
 * 
 * Copyright &copy;Zphinx Software Solutions
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
package com.zphinx.reader.english.enums;

/**
 * <p>
 * An enum used to represent the verbal descriptor for a colossal number in the
 * english language.
 * </p>
 * 
 * <p>
 * It handles colossal numbers as strings, and the string representations
 * specifically for numbers 100 upwards.
 * </p>
 * <p>
 * This enum defines an index for each gazillion number based on the logic of
 * sets of 3 zeros("000") e.g a million has 6 zeros which is 2 sets of
 * "000".Other numbers apart from hundred honour this indexing with hundred been
 * assigned an index of <code>0</code>.
 * </p>
 * <p>
 * More verbal translations can be added as needed with this implementation
 * going up to vigintillion i.e 10exp63
 * </p>
 * 
 * @author David Ladapo
 * @version $Id: GazillionNumbers.java 219 2012-07-13 22:03:40Z rogue $
 * 
 *          <p>
 *          Created: Dec 13, 2010 11:22:19 PM<br>
 *          Copyright &copy;Zphinx Software Solutions
 *          </p>
 */
public enum GazillionNumbers {

	/** Numbers in hundreds assigned with an index of 0. */
	HUNDRED(0, "Hundred"),

	/**
	 * Numbers in thousands with an index assigned to the group of trailing
	 * zeros
	 */
	THOUSAND(1, "Thousand"),
	/**
	 * Numbers in Millions with an index assigned to the group of trailing zeros
	 */
	MILLION(2, "Million"),
	/**
	 * Numbers in Billions with an index assigned to the group of trailing zeros
	 */
	BILLION(3, "Billion"),
	/**
	 * Numbers in Trillions with an index assigned to the group of trailing
	 * zeros
	 */
	TRILLION(4, "Trillion"),
	/**
	 * Numbers in Quadrillions with an index assigned to the group of trailing
	 * zeros
	 */
	QUADRILLION(5, "Quadrillion"),
	/**
	 * Numbers in Quintillions with an index assigned to the group of trailing
	 * zeros
	 */
	QUINTILLION(6, "Quintillion"),
	/**
	 * Numbers in Sextillions with an index assigned to the group of trailing
	 * zeros
	 */
	SEXTILLION(7, "Sextillion"),
	/**
	 * Numbers in Septillions with an index assigned to the group of trailing
	 * zeros
	 */
	SEPTILLION(8, "Septillion"),
	/**
	 * Numbers in Octillions with an index assigned to the group of trailing
	 * zeros
	 */
	OCTILLION(9, "Octillion"),
	/**
	 * Numbers in Nonillions with an index assigned to the group of trailing
	 * zeros
	 */
	NONILLION(10, "Nonillion"),
	/**
	 * Numbers in Decillions with an index assigned to the group of trailing
	 * zeros
	 */
	DECILLION(11, "Decillion"),
	/**
	 * Numbers in Undecillions with an index assigned to the group of trailing
	 * zeros
	 */
	UNDECILLION(12, "Undecillion"),
	/**
	 * Numbers in Duodecillions with an index assigned to the group of trailing
	 * zeros
	 */
	DUODECILLION(13, "Duodecillion"),
	/**
	 * Numbers in Tredecillions with an index assigned to the group of trailing
	 * zeros
	 */
	TREDECILLION(14, "Tredecillion"),
	/**
	 * Numbers in Quattuordecillions with an index assigned to the group of
	 * trailing zeros
	 */
	QUATTUORDECILLION(15, "Quattuordecillion"),
	/**
	 * Numbers in Quindecillions with an index assigned to the group of trailing
	 * zeros
	 */
	QUINDECILLION(16, "Quindecillion"),
	/**
	 * Numbers in Sexdecillions with an index assigned to the group of trailing
	 * zeros
	 */
	SEXDECILLION(17, "Sexdecillion"),
	/**
	 * Numbers in Septendecillions with an index assigned to the group of
	 * trailing zeros
	 */
	SEPTENDECILLION(18, "Septendecillion"),
	/**
	 * Numbers in Octodecillions with an index assigned to the group of trailing
	 * zeros
	 */
	OCTODECILLION(19, "Octodecillion"),
	/**
	 * Numbers in Novemdecillions with an index assigned to the group of
	 * trailing zeros
	 */
	NOVEMDECILLION(20, "Novemdecillion"),
	/**
	 * Numbers in Vigintillions with an index assigned to the group of trailing
	 * zeros
	 */
	VIGINTILLION(21, "Vigintillion");

	/**
	 * The number this enum represents
	 */
	private String number;

	/**
	 * An index which is representative of the 10x3 power of the said enum
	 */
	private int index;

	/**
	 * Default constructor
	 * 
	 * @param index
	 *            An int which represents the 000 th value of the said number
	 * @param number
	 *            The number this enum represents
	 * 
	 */
	private GazillionNumbers(final int index, final String number) {
		this.index = index;
		this.number = number;
	}

	/**
	 * Gets the number this enum represents
	 * 
	 * @return The number this enum represents
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Gets the index this enum represents
	 * 
	 * @return The index this enum represents
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Finds the word representation of this int or a blank string if the index
	 * of the said string is not represented.
	 * 
	 * @param index
	 *            The int whose word value we want
	 * @return The string value of the int passed to this method or a blank
	 *         string if the index is not represented.
	 */
	public static String findNumber(final int index) {
		String out = "";
		for (GazillionNumbers gazNum : values()) {
			if (index == gazNum.getIndex()) {
				out = gazNum.getNumber();
				break;
			}
		}
		return out;
	}

}
