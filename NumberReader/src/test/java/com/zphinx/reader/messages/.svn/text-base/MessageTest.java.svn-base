/**
 * MessageTest.java
 * Created: 26 Jan 2011 18:56:29
 * @author David Ladapo
 * Copyright (&copy;) 2011  Zphinx Software Solutions
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
package com.zphinx.reader.messages;

import static org.junit.Assert.assertEquals;

import java.util.MissingResourceException;

import org.junit.Test;

import com.zphinx.reader.messages.Messages;

/**
 *
 * @author David Ladapo
 * Created: 26 Jan 2011 18:56:29
 * @version 1.0
 * Copyright (&copy;) 2011  Zphinx Software Solutions
 */
public class MessageTest {

	/**
	 * Test method for {@link com.zphinx.reader.messages.Messages#getString(java.lang.String)}.
	 */
	@Test
	public final void testGetString() {
		String s = Messages.getString("enter_number");
		assertEquals("Please enter a number!",s);
		
	}
	

	/**
	 * Test method for {@link com.zphinx.reader.messages.Messages#getString(java.lang.String)}.
	 */
	@Test
	public final void testGetStringException() throws MissingResourceException {
		String s = Messages.getString("tada!!");
		assertEquals("!tada!!!",s);
	}


}
