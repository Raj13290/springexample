/**
 * Exception class for dao layer
 */
package com.manish.spring.firstexample.exception;

/**
 * @author M1021395
 *
 */
public class DaoException extends Exception {

	/**
	 * serial version
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * default constructor
	 */
	public DaoException() {
	}

	/**
	 * @param arg0
	 */
	public DaoException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public DaoException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public DaoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
