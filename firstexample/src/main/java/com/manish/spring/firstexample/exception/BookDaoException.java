/**
 * 
 */
package com.manish.spring.firstexample.exception;

/**
 * @author rajesh
 *
 */
public class BookDaoException extends Exception {

	/**
	 * Serial versions
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * default constructor
	 */
	public BookDaoException() {
	}

	/**
	 * @param message
	 */
	public BookDaoException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public BookDaoException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public BookDaoException(String message, Throwable cause) {
		super(message, cause);
	}
}
