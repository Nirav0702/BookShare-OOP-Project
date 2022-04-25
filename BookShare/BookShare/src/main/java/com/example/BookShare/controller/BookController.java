package com.example.BookShare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.BookShare.dao.BookRepo;
import com.example.BookShare.model.Book;
import com.example.BookShare.services.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	BookRepo bookrepo;

	@RequestMapping("/addBook")
	public String addBook(@RequestParam("bookTitle")String bookTitle, @RequestParam("bookAuthor")String bookAuthor, @RequestParam("bookPublisher")String bookPublisher, @RequestParam("bookYear")String bookYear, @RequestParam("bookEdition")String bookEdition) 
	{
		Book book = new Book();
		book.setBookTitle(bookTitle);
		book.setBookAuthor(bookAuthor);
		book.setBookPublisher(bookPublisher);
		book.setBookYear(bookYear);
		book.setBookEdition(bookEdition);
		//book.setBookId(1);
		book.setAvailability(true);
		book.setOwnerId(1);
		book.setBorrowerId(2);
		book.setTimeBorrowed("01012022");
		book.setTimereturned("01022022");
		bookrepo.save(book);
		return "dashboard.jsp";
	}
	
	@GetMapping("/yourBooks")
	public String getBooks(Model model) {
		
		List <Book> booklist = bookService.getBooks();
		
		model.addAttribute("books", booklist);
		
		return "yourbooks.jsp";
	}
}
