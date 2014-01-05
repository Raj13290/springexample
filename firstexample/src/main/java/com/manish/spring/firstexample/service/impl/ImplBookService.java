/**
 * 
 */
package com.manish.spring.firstexample.service.impl;

import java.util.List;

import com.manish.spring.firstexample.dao.BookDao;
import com.manish.spring.firstexample.entity.Author;
import com.manish.spring.firstexample.entity.Book;
import com.manish.spring.firstexample.exception.BookDaoException;
import com.manish.spring.firstexample.exception.DaoException;
import com.manish.spring.firstexample.exception.ServiceException;
import com.manish.spring.firstexample.service.BookService;

/**
 * @author rajesh
 *
 */
public class ImplBookService implements BookService{
	
	private BookDao bookDao;

	public List<Book> getBooks() throws BookDaoException {
		List<Book> books=null;
		try {
			books=bookDao.getAllBooks();
		} catch (DaoException e) {
			try {
				throw new ServiceException();
			} catch (ServiceException e1) {
				e1.printStackTrace();
			}
		}
		return books;
	}

	public List<Author> getBookAuthors(Book book) throws BookDaoException {
		return null;
	}

	public List<Book> getAuthorBooks(Author author) throws BookDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean saveBook(Book book) throws BookDaoException {
		try {
			bookDao.saveBook(book);
		} catch (DaoException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteBook(Book book) throws BookDaoException {
		// TODO Auto-generated method stub
		return false;
	}

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	

}
