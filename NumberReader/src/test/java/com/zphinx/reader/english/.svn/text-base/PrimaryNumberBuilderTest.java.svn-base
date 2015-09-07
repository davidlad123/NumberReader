/**
 * 
 */
package com.zphinx.reader.english;

import org.junit.Before;
import org.junit.Test;

import com.zphinx.reader.english.PrimaryNumberBuilder;
import com.zphinx.reader.exception.NumberReaderException;

/**
 * @author David Ladapo
 *
 */
public class PrimaryNumberBuilderTest {

	PrimaryNumberBuilder pnb;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		pnb = new PrimaryNumberBuilder();
	}

	

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.ChainOfResponsibilityTranslator#translateHundreds(java.lang.String)}
	 * .
	 */
	@Test(expected=NumberReaderException.class)
	public final void testTranslateHundredsExceptionMore() throws NumberReaderException{

		pnb.translateHundreds("635635");

	}
		/**
	 * Test method for
	 * {@link com.zphinx.reader.english.ChainOfResponsibilityTranslator#translateHundreds(java.lang.String)}
	 * .
	 */
	@Test(expected=NumberReaderException.class)
	public final void testTranslateHundredsExceptionLess() throws NumberReaderException{
		pnb.translateHundreds("6");
	}

	
		/**
	 * Test method for
	 * {@link com.zphinx.reader.english.ChainOfResponsibilityTranslator#translateHundreds(java.lang.String)}
	 * .
	 */
	@Test(expected=NumberReaderException.class)
	public final void testTranslateHundredsExceptionNF() throws NumberReaderException{
		pnb.translateHundreds("sdg");
	}


	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.ChainOfResponsibilityTranslator#translateTens(java.lang.String)}
	 * .
	 */
	@Test(expected=NumberReaderException.class)
	public final void testTranslateTensExceptionMore() throws NumberReaderException{
		pnb.translateTens("254");
	}
	
	
	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.ChainOfResponsibilityTranslator#translateTens(java.lang.String)}
	 * .
	 */
	@Test(expected=NumberReaderException.class)
	public final void testTranslateTensExceptionLess() throws NumberReaderException{
		pnb.translateTens("2");
	}



	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.ChainOfResponsibilityTranslator#translateTens(java.lang.String)}
	 * .
	 */
	@Test(expected=NumberReaderException.class)
	public final void testTranslateTensExceptionNF() throws NumberReaderException{
		pnb.translateTens("wr");
	}	
	

	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.ChainOfResponsibilityTranslator#translateUnits(java.lang.String)}
	 * .
	 */
	@Test(expected=NumberReaderException.class)
	public final void testTranslateUnitsException() throws NumberReaderException{
		pnb.translateUnits("23");
	}
	
	
	
	
	/**
	 * Test method for
	 * {@link com.zphinx.reader.english.ChainOfResponsibilityTranslator#translateUnits(java.lang.String)}
	 * .
	 */
@Test(expected=NumberReaderException.class)
	public final void testTranslateUnitsExceptionNF() throws NumberReaderException{
		pnb.translateUnits("A");
	}


}
