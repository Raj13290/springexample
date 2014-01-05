/**
 * 
 */
package com.manish.spring.firstexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manish.spring.firstexample.entity.Book;
import com.manish.spring.firstexample.exception.BookDaoException;
import com.manish.spring.firstexample.service.BookService;

/**
 * @author rajesh
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private BookService service;

	@RequestMapping("/addNewBook")
	public String getAddBookPage(Model model){
		model.addAttribute("book", new Book());
		return "addNewBook";
	}
	
	@RequestMapping("/saveNewBook")
	public String saveNewBook(@ModelAttribute Book book){
		try {
			service.saveBook(book);
		} catch (BookDaoException e) {
			e.printStackTrace();
		}
		return "successful";
	}
}
