package com.claim.claimazon.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.claimazon.dao.BookDao;
import com.claim.claimazon.model.Book;

/**
 * Created by benjamin on 8/11/15.
 */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;

	// @RequestMapping(method = RequestMethod.GET)
	// public String printWelcome(ModelMap model) {
	// ArrayList<Book> books= bookDao.findAllBooks();
	//
	// model.addAttribute("message", "Hello world!");
	// model.addAttribute("books", books);
	// return "hello";
	//
	// }

	@Override
	public ArrayList<Book> findAllBooks() {
		return bookDao.findAllBooks();
	}

	@Override
	public ArrayList<Book> findBookById(String id) {
		return null;
	}

	@Override
	public ArrayList<Book> findBooksByCategory(String name) {
		return null;
	}

	@Override
	public void updateBook(String id) {

	}

	@Override
	public String deleteBook(String id) {
		return null;
	}

	@Override
	public Boolean addBook(Book book) {
		return null;
	}
}
