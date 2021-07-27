package com.java.oop;

import java.util.ArrayList;
import java.util.List;

//Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.
//It represents part-of relationship.
//In composition, both the entities are dependent on each other.
//When there is a composition between two entities, the composed object cannot exist without the other entity.

class Book {
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
}

class Library {
	
	private List<Book> books;
	
	public Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
}

public class Composition {

	public static void main(String[] args) {
		
		Book b1 = new Book("Effective Java", "Joshua Bloch");
		Book b2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");
		Book b3 = new Book("Reinventing India", "Raghunath Mashelkar");
		
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		Library library = new Library(books);
		
		List<Book> getBooks = library.getBooks();
		
		for (Book b : getBooks) {
			System.out.println("Title : " + b.getTitle() + " || Author: "+ b.getAuthor());
		}
	}
}
