/**
 * NumberBuilder.java
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
package com.zphinx.reader.core;

import com.zphinx.reader.exception.NumberReaderException;

/**
 * <p>
 * An interface which defines the primary signature of a builder object used to
 * build up verbal translations of numbers in any language.
 * </p>
 * <p>
 * Current implementations are used to build verbal representations of numbers
 * in the english language.
 * </p>
 * 
 * @author David Ladapo
 * @version $Id: NumberBuilder.java 219 2012-07-13 22:03:40Z rogue $
 * 
 *          <p>
 *          Created: Jul 10, 2012 06:48:34 PM<br>
 *          Copyright &copy;Zphinx Software Solutions
 *          </p>
 */
public interface NumberBuilder {

	/**
	 * Translates a given number based on a predefined grouping available for
	 * that number. The index is used as a flag to determine which grouping is
	 * associated with the number to be translated and can be used as a flag to
	 * call an appropriate method.
	 * 
	 * @param index
	 *            An int used to identify the grouping associated with the
	 *            inputed number
	 * @param number
	 *            The grouped number which is to be translated e.g ..123 can be
	 *            grouped as hundreds
	 * @return Return the verbal translation for the said number
	 * @throws NumberReaderException
	 *             If an error occurs
	 */
	String translateNumberGroup(int index, String number) throws NumberReaderException;

}