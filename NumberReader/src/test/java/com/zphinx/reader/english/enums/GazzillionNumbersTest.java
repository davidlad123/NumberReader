/**
 * 
 */
package com.zphinx.reader.english.enums;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.zphinx.reader.english.enums.GazillionNumbers;

/**
 * Test class for the GazzilionNumbers test
 * 
 * @author David Ladapo
 * @version $1.0
 * 
 *          <p>
 *          Created: Dec 15, 2010 6:50:57 PM<br>
 *          Copyright &copy;Zphinx Software Solutions
 *          </p>
 *          *
 */
public class GazzillionNumbersTest {

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.enums.GazillionNumbers#getNumber()}.
	 */
	@Test
	public final void testGetNumber() {
assertEquals("Hundred",GazillionNumbers.HUNDRED.getNumber());
	}

}
