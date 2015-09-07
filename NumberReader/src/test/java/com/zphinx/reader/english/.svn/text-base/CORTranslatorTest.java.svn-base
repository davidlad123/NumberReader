/**
 * 
 */
package com.zphinx.reader.english;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zphinx.reader.exception.NumberReaderException;

/**
 * Test class for the ChainOfResponsibilityTranslator object
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

public class CORTranslatorTest {

	/**
*
**/
	ChainOfResponsibilityTranslator cor = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cor = new ChainOfResponsibilityTranslator();
		assertNotNull(cor);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		cor = null;
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.ChainOfResponsibilityTranslator#ChainOfResponsibilityTranslator()}
	 * .
	 */
	@Test
	public final void testChainOfResponsibilityTranslator() throws NumberReaderException {
		assertNotNull(cor);

	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.ChainOfResponsibilityTranslator#getNumberBuilder()}
	 * .
	 */
	@Test
	public final void testGetNumberBuilder() throws NumberReaderException {
		PrimaryNumberBuilder pnb = cor.getNumberBuilder();
		assertNotNull(pnb);
		assertEquals("PrimaryNumberBuilder", pnb.getClass().getSimpleName());
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.ChainOfResponsibilityTranslator#translateNumber(java.lang.String)}
	 * .
	 */
	@Test
	public final void testTranslateNumberBlank() throws NumberReaderException {
		assertEquals(0, cor.translateNumber("136533").trim().length());
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.ChainOfResponsibilityTranslator#trailingWord(int)}
	 * .
	 */
	@Test
	public final void testTrailingWord() {
		assertEquals("Trillion,", cor.trailingWord(4).trim());
	}

}
