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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.BookShare.dao.BookRepo;
import com.example.BookShare.model.Book;
//import com.example.BookShare.services.BookService;

@Controller
public class BookController {
	@Autowired
	BookRepo bookrepo;

	@RequestMapping("/addBook")
	public ModelAndView addBook(Book book, @RequestParam("userName")String userName) 
	{
		book.setAvailability(true);
		book.setOwnerName(userName);
		book.setBorrowerName("N/A");
		book.setTimeBorrowed("01012022");
		book.setTimereturned("N/A");
		bookrepo.save(book);
		ModelAndView modelAndView = new ModelAndView("dashboard.jsp");
	    modelAndView.addObject("userName", userName);
	    return modelAndView;
	}
	
	@RequestMapping("/searchBook")
	public ModelAndView searchBookPage(@RequestParam("bookTitle")String bookTitle) 
	{
		System.out.println("book title");
		List<Book> b =(List<Book>) bookrepo.findAllByBookTitle(bookTitle);
		System.out.println(bookrepo.findAllByBookTitle(bookTitle));
		System.out.println("Done");
		ModelAndView modelAndView = new ModelAndView("searchbook.jsp");
	    modelAndView.addObject("bookList", b);
	    return modelAndView;
	}
	
	@GetMapping("/ownedBooks")
	@ResponseBody
	public ModelAndView ownedBooks(@RequestParam("userName")String userName) 
	{
		List<Book> b = bookrepo.findAllByOwnerName(userName);
		System.out.println(bookrepo.findAllByOwnerName(userName));
		ModelAndView modelAndView = new ModelAndView("ownedbooks.jsp");
	    modelAndView.addObject("bookList", b);
	    return modelAndView;
	}
	
	@GetMapping("/borrowedBooks")
	@ResponseBody
	public ModelAndView borrowedBooks(@RequestParam("userName")String userName) 
	{
		List<Book> b = bookrepo.findAllByBorrowerName(userName);
		System.out.println(bookrepo.findAllByBorrowerName(userName));
		ModelAndView modelAndView = new ModelAndView("borrowedbooks.jsp");
	    modelAndView.addObject("bookList", b);
	    return modelAndView;
	}
}
