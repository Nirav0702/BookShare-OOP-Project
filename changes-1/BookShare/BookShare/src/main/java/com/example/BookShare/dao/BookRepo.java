package com.example.BookShare.dao;

import org.springframework.web.servlet.ModelAndView;

import com.example.BookShare.model.Account;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BookShare.model.Book;
import com.example.BookShare.model.Wallet;

@Repository
public interface BookRepo extends CrudRepository<Book, Integer>
{
	Book findByBookId(int bookId);
	
	List<Book> findAllByBookTitle(String bookTitle);

	List<Book> findAllByOwnerName(String ownerName);

	List<Book> findAllByBorrowerName(String borrowerName);

	Book findByBorrowerName(String userName);
}	
