package org.library.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		
		int bookId;
		String bookName;
		String authorName;
		String titleName;
		int price;
		String publisherName;
		System.out.println("Enter book id:");
		bookId = Integer.valueOf(bf.readLine());
		System.out.println("Enter book Name:");
		bookName = bf.readLine();
		System.out.println("Enter author Name:");
		authorName = bf.readLine();
		System.out.println("Enter title Name:");
		titleName = bf.readLine();
		System.out.println("Enter book price:");
		price = Integer.valueOf(bf.readLine());
		System.out.println("Enter Publisher Name:");
		publisherName = bf.readLine();
		Library library = new Library(bookId, bookName, authorName, titleName, price, publisherName);
		System.out.println("Book Id: " + library.getBookId());
		System.out.println("Book Name: " + library.getBookName());
		System.out.println("Author Name: " + library.getAuthorName());
		System.out.println("Title Name: " + library.getTitleName());
		System.out.println("Book Price: " + library.getPrice());
		System.out.println("Publisher Name: " + library.getPublisherName());
		session.save(library);
		session.getTransaction().commit();

		session.close();
	}

}
