/**
 * 
 */
package com.manish.spring.firstexample.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.manish.spring.firstexample.dao.BookDao;
import com.manish.spring.firstexample.entity.Author;
import com.manish.spring.firstexample.entity.Book;
import com.manish.spring.firstexample.exception.DaoException;

/**
 * @author rajesh
 *
 */
public class ImplBookDao implements BookDao {

	private HibernateTemplate template;
	
	public List<Book> getAllBooks(){
		return template.loadAll(Book.class);
	}
	public List<Author> getAllAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveBook(Book book) {
		try{
		template.save(book);
		}catch(Exception e){
			try {
				throw new DaoException("Having exception while saving book object");
			} catch (DaoException e1) {
				e1.printStackTrace();
			}
		}
		return ;
	}

	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Author> getAuthors(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	
}
