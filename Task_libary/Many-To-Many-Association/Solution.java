package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String args[]) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Author rossie = new Author();
		rossie.setAuthId(1);
		rossie.setEmailid("van@gmail.com");
		rossie.setGender("Male");
		rossie.setName("Rossie");
		rossie.setWebUrl("rossie-val.com");
		
		EBook eb = new EBook();
		eb.setBookId(1);
		eb.setDownloadUrl("Rookie.bh6.in");
		eb.setEdition("Edition 1.01");
		eb.setIsbn("1283738123");
		eb.setPrice(1200);
		eb.setPublisher("Rookie");
		eb.setSizeInMb(3);
		eb.setTitle("Big Hero 6");
		
		PaperBook pb = new PaperBook();
		pb.setBookId(2);
		pb.setEdition("Edition 2");
		pb.setInStock(10);
		pb.setIsbn("12319283");
		pb.setPrice(1560);
		pb.setPublisher("Stringer");
		pb.setShippingWeight(3.5f);
		pb.setTitle("Ruins");
		
		rossie.getBooks().add(eb);
		rossie.getBooks().add(pb);
		
		eb.getAut().add(rossie);
		pb.getAut().add(rossie);
		
		session.beginTransaction();
		session.save(eb);
		session.save(pb);
		session.save(rossie);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
