package com.zphinx.reader.exception;

import org.junit.Test;

import com.zphinx.reader.exception.NumberReaderException;

/**
 * Test class for the NumberReaderException class
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
public class NumberReaderExceptionTest {

	/**
	 * Test method for
	 * {@link com.zphinx.reader.exception.NumberReaderException#NumberReaderException()}
	 * .
	 */
	@Test(expected = NumberReaderException.class)
	public final void testNumberReaderException() throws NumberReaderException {
		throw new NumberReaderException();
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.exception.NumberReaderException#NumberReaderException(java.lang.String)}
	 * .
	 */
	@Test(expected = NumberReaderException.class)
	public final void testNumberReaderExceptionString()
			throws NumberReaderException {
		throw new NumberReaderException("Error");
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.exception.NumberReaderException#NumberReaderException(java.lang.Throwable)}
	 * .
	 */
	@Test(expected = NumberReaderException.class)
	public final void testNumberReaderExceptionThrowable()
			throws NumberReaderException {
		throw new NumberReaderException(new IllegalAccessException(
				"Access Prohibited!"));
	}

	/**
	 * Test method for
	 * {@link com.zphinx.reader.exception.NumberReaderException#NumberReaderException(java.lang.String, java.lang.Throwable)}
	 * .
	 */
	@Test(expected = NumberReaderException.class)
	public final void testNumberReaderExceptionStringThrowable()
			throws NumberReaderException {
		throw new NumberReaderException("error", new IllegalAccessException(
				"Access Prohibited!"));
	}

}
