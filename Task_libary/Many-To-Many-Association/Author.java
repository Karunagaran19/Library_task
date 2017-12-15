package com.onetoone;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "author_details")
public class Author {
	@ManyToMany
	@JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "author_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
	private Set<Book> books = new HashSet<Book>();

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> bk) {
		this.books = bk;
	}

	@Id
	@Column(name = "author_id")
	private int authId;
	@Column(name = "author_name")
	private String name;
	@Column(name = "email_id")
	private String emailid;
	@Column(name = "gender")
	private String gender;
	@Column(name = "web_url")
	private String webUrl;

	public Author() {
		super();
	}

	public Author(int authId, String name, String emailid, String gender, String webUrl) {
		super();
		this.authId = authId;
		this.name = name;
		this.emailid = emailid;
		this.gender = gender;
		this.webUrl = webUrl;
	}

	public int getAuthId() {
		return authId;
	}

	public void setAuthId(int id) {
		this.authId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

}
