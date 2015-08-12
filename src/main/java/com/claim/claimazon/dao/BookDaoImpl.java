package com.claim.claimazon.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.claim.claimazon.model.Book;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Book> findAllBooks() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		ArrayList<Book> bookList = (ArrayList<Book>) session
				.createCriteria(Book.class);
		tx.commit();
		session.close();
		return bookList;
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
		// session = sessionFactory.openSession();
		// tx = session.beginTransaction();
		// session.save(book);
		// tx.commit();
		// session.close();

		return false;
	}
}