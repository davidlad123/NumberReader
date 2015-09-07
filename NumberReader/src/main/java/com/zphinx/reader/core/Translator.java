/**
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
package com.zphinx.reader.core;

import com.zphinx.reader.exception.NumberReaderException;

/**
 * 
 * Translator serves as a base signature for classes which need to translate
 * numbers into their language equivalents. It defines methods which are
 * significant in the number translation to verbal equivalent process.
 * 
 * @author David Ladapo
 * @version $Id: Translator.java 215 2012-07-13 08:57:34Z rogue $
 * 
 *          <p>
 *          Created: Dec 15, 2010 6:50:57 PM<br>
 *          Copyright &copy;Zphinx Software Solutions
 *          </p>
 * */
public interface Translator<T extends NumberBuilder> {

	/**
	 * Translate a given number to its language equivalent
	 * 
	 * @param num
	 *            The number which requires translation
	 * @return A String representing the translated number
	 * @throws NumberReaderException
	 *             Throws a NumberReaderException if an error occurs
	 */
	String translateNumber(String num) throws NumberReaderException;

	/**
	 * Gets a word to use as a suffix. eg. In the eglish language numbers are
	 * suffixed by words like "Million","Billion",Trillion etc.
	 * 
	 * @param index
	 *            The index of the word used as a suffix
	 * @return A word to use as a suffix
	 */
	String trailingWord(int index);

	/**
	 * Gets the builder instance associated with this object, which is used to
	 * build up strings which are displayed as part of the translated number.
	 * 
	 * @return An instance of an AbstractNumberBuilder which is used by the
	 *         translator to process its instructions
	 */
	T getNumberBuilder();
}
