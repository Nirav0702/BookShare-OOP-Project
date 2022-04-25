package com.example.BookShare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.BookShare.dao.BookRepo;
import com.example.BookShare.model.Book;
//import com.example.BookShare.services.BookService;

@Controller
public class BookController {
	@Autowired
	BookRepo bookrepo;

	@RequestMapping("/addBook")
	public String addBook(Book book, @RequestParam("userName")String userName) 
	{
		book.setAvailability(true);
		book.setOwnerName(userName);
		book.setBorrowerName("N/A");
		book.setTimeBorrowed("01012022");
		book.setTimereturned("N/A");
		System.out.println(userName);
		bookrepo.save(book);
		return "dashboard.jsp";
	}
	
	@GetMapping("/yourBooks")
	public String getBooks(Model model) 
	{
		return "yourbooks.jsp";
	}
}
