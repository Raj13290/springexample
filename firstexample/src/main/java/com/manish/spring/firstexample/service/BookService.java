/**
 * 
 */
package com.manish.spring.firstexample.service;

import java.util.List;

import com.manish.spring.firstexample.entity.Author;
import com.manish.spring.firstexample.entity.Book;
import com.manish.spring.firstexample.exception.BookDaoException;

/**
 * @author rajesh
 *
 */
public interface BookService {
	
	public List<Book> getBooks() throws BookDaoException;
	public List<Author> getBookAuthors(Book book) throws BookDaoException;
	public List<Book> getAuthorBooks(Author author) throws BookDaoException;
	public boolean saveBook(Book book) throws BookDaoException;
	public boolean deleteBook(Book book) throws BookDaoException;

}
