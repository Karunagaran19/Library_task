package com.onetoone;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "book", discriminatorType = DiscriminatorType.STRING)
@Table(name = "book_details")
public class Book {
	@ManyToOne
	private Author aut;

	public Author getAut() {
		return aut;
	}

	public void setAut(Author aut) {
		this.aut = aut;
	}

	@Id
	@Column(name = "book_id")
	private int bookId;
	@Column(name = "title")
	private String title;
	@Column(name = "price")
	private double price;
	@Column(name = "isbn")
	private String isbn;
	@Column(name = "publisher")
	private String publisher;
	@Column(name = "edition")
	private String edition;

	public Book() {
		super();
	}

	public Book(String title, double price, String isbn, String publisher, String edition) {
		super();
		this.title = title;
		this.price = price;
		this.isbn = isbn;
		this.publisher = publisher;
		this.edition = edition;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

}
