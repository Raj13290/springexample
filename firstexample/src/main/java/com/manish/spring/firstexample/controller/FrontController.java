package com.manish.spring.firstexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manish.spring.firstexample.exception.BookDaoException;
import com.manish.spring.firstexample.service.BookService;

@Controller
public class FrontController {

	@Autowired
	private BookService service;

	@RequestMapping("/home")
	public String getHomePage() {
		//
		return "home";
	}

	@RequestMapping("/allBooks")
	public String getAllBooks(Model model) {
		try {
			model.addAttribute("books", service.getBooks());
		} catch (BookDaoException e) {
			e.printStackTrace();
		}
		return "displayAllBook";
	}

}
