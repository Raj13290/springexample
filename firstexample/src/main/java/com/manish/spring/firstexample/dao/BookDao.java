/**
 * 
 */
package com.manish.spring.firstexample.dao;

import java.util.List;

import com.manish.spring.firstexample.entity.Author;
import com.manish.spring.firstexample.entity.Book;
import com.manish.spring.firstexample.exception.DaoException;

/**
 * @author manish
 *
 */
public interface BookDao {
	
	public List<Book> getAllBooks() throws DaoException;
	public List<Author> getAllAuthors()throws DaoException;
	public void saveBook(Book book)throws DaoException;
	public boolean deleteBook(Book book)throws DaoException;
	public List<Author> getAuthors(Book book)throws DaoException;

}
