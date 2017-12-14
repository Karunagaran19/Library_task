package org.library.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "LIBRARY_DETAILS")
public class Library {

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(int bookId, String bookName, String authorName, String titleName, int price, String publisherName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.titleName = titleName;
		this.price = price;
		this.publisherName = publisherName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	@Id
	@GeneratedValue
	@Column(name = "BOOK_ID")
	private int bookId;
	@Column(name = "BOOK_NAME", nullable = true, length = 255)
	private String bookName;
	@Column(name = "AUTHOR_NAME")
	private String authorName;
	@Column(name = "TITLE_NAME")
	private String titleName;
	@Column(name = "BOOK_PRICE")
	private int price;
	@Column(name = "PUBLISHER_NAME")
	private String publisherName;
}
