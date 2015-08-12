package com.claim.claimazon;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.claim.claimazon.model.Book;
import com.claim.claimazon.service.BookService;

@Controller
public class HelloController {
	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAllBooks(ModelMap model) {
		ArrayList<Book> books = bookService.findAllBooks();

		model.addAttribute("message", "Hello world!");
		model.addAttribute("books", books);
		return "hello";
	}
}