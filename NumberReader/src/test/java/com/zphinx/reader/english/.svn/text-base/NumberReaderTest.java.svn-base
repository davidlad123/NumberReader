/**
 * 
 */
package com.zphinx.reader.english;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zphinx.reader.exception.NumberReaderException;

/**
 * Test class for the NumberReader object
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
public class NumberReaderTest {

	/**
	 * An instance of tbe number reader
	 */
	private transient NumberReader reader;

	/**
	 * A random number generator
	 */
	private transient Random rand;
	/**
	 * A java.util.logging logger
	 */

	private final static Logger LOGGER = Logger.getLogger("com.zphinx.reader.english.NumberReaderTest");

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		reader = new NumberReader(new ChainOfResponsibilityTranslator());
		rand = new Random();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (reader != null) {
			reader = null;
		}
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 */
	@Test
	public final void testTranslate() {

		final int[] nums = new int[] { 10, 100, 1000, 10000, 100000, 1000000, 10000000, 999999999 };

		for (int k = 0; k < nums.length; k++) {

			try {

				final long lon = rand.nextInt(nums[k]);
				final String son = reader.translate(String.valueOf(lon));
				LOGGER.fine(lon + "\n\r" + son + "\n\r");
				assertNotNull(son, "The translated string should not be null!");
			} catch (Exception e) {
				LOGGER.fine("Error: " + e.getMessage());
			}

		}

	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 * 
	 * @throws NumberReaderException
	 */
	@Test(expected = NumberReaderException.class)
	public final void testTranslateExceptionLessOne() throws NumberReaderException {
		reader.translate("");
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 * 
	 * @throws NumberReaderException
	 */
	@Test(expected = NumberReaderException.class)
	public final void testTranslateException() throws NumberReaderException {
		reader.translate("@67#");
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 * 
	 * @throws NumberReaderException
	 */
	@Test
	public final void testTranslateBigNumber() throws NumberReaderException {
		final String sti = reader.translate("35664647474747484943");
		LOGGER.log(Level.INFO, "The translation for 35664647474747484943 is: " + sti);
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 * 
	 * @throws NumberReaderException
	 */
	@Test(expected = NumberReaderException.class)
	public final void testTranslateBigNumberException() throws NumberReaderException {
		final String sti = reader.translate("3566464747474748494335664647474747484943356646474747474849437484943");
		LOGGER.log(Level.INFO, "The translation for 3566464747474748494335664647474747484943356646474747474849437484943 is: " + sti);
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 * 
	 * @throws NumberReaderException
	 */
	@Test
	public final void testTranslateSignedNumber() throws NumberReaderException {
		final String sti = reader.translate("-3");
		assertNotNull(sti, "The translated string should not be null!");
		// "The word version of minus three!",
		assertEquals("Minus Three", sti);
		LOGGER.log(Level.INFO, "The translation for -3 is: " + sti);
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 * 
	 * @throws NumberReaderException
	 */
	@Test
	public final void testTranslateSignedNumberPlus() throws NumberReaderException {
		String sto = reader.translate("+3");
		assertNotNull(sto, "The translated string should not be null!");
		// "The word version of positive three!",
		assertEquals("Three", sto);
		LOGGER.log(Level.INFO, "The translation for +3 is: " + sto);

	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 * 
	 * @throws NumberReaderException
	 */
	@Test
	public final void testTranslateLeadingZero() throws NumberReaderException {
		String sto = reader.translate("0000000000000000000000003");
		assertNotNull(sto, "Translated string cannot be null...");
		// "This should read 3",
		assertEquals("Three", sto);
		LOGGER.log(Level.INFO, "The translation for 0000000000000000000000003 is: " + sto);

	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 * 
	 * @throws NumberReaderException
	 */
	@Test
	public final void testTranslateLargeNumber() throws NumberReaderException {
		testAnyNumber("0456219354874843282320003");
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 * 
	 * @throws NumberReaderException
	 */
	@Test
	public final void testFunnyNumberNumber() throws NumberReaderException {
		testAnyNumber("10001");
		testAnyNumber("100001");
		testAnyNumber("1000001");
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 * 
	 * @throws NumberReaderException
	 */
	@Test
	public final void testTranslateCommaEnd() throws NumberReaderException {

		testAnyNumber("10000");
	}

	private final void testAnyNumber(String num) throws NumberReaderException {

		final String sto = reader.translate(num);
		assertNotNull(sto, "Translated string cannot be null...");
		LOGGER.log(Level.INFO, "The translation for " + num + " is: " + sto);
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 * 
	 * @throws NumberReaderException
	 */
	@Test(expected = NumberReaderException.class)
	public final void testTranslateExceptionDecimal() throws NumberReaderException {
		reader.translate("743.67");
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#translate(String)}.
	 * 
	 * @throws NumberReaderException
	 */
	@Test
	public final void testTranslateComma() throws NumberReaderException {
		final String sto = reader.translate("74,367");
		assertNotNull("The translation for 74,367 is: " + sto + "...tested commas in numbers");
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#main(String)}.
	 */
	@Test
	public final void testMain() {

		final int[] nums = new int[] { 10, 100, 1000, 10000, 100000, 1000000, 10000000, 999999999 };

		for (int k = 0; k < nums.length; k++) {

			try {

				long lon = rand.nextInt(nums[k]);
				String[] sArr = { String.valueOf(lon) };
				LOGGER.fine(lon + "\n\r");
				NumberReader.main(sArr);

			} catch (Exception e) {
				fail("Error!! from testing main");
			}

		}

	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#main(String)}.
	 */
	@Test
	public final void testMainException() {
		try {
			String[] sArr = { "@Y67#" };
			NumberReader.main(sArr);

		} catch (Exception e) {
			assertNotNull("We expected to thorw an error from main()!", e);
		}
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.NumberReader#main(String)}.
	 */
	@Test
	public final void testMainNoInput() {

		try {
			String[] sArr = {};
			NumberReader.main(sArr);
			assertTrue("Successfully executed main with 0 length array!", true);

		} catch (Exception e) {
			fail("Error!!");
		}

	}

}
