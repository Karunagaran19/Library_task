package com.onetoone;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("e_book")
public class EBook extends Book {
	@Column(name = "download_url")
	private String downloadUrl;
	@Column(name = "size_in_mb")
	private int sizeInMb;
	
	public EBook() {
		super();
	}

	public EBook(String title, double price, String isbn, String publisher, String edition,
			String downloadUrl, int sizeInMb) {
		super(title, price, isbn, publisher, edition);
		this.downloadUrl = downloadUrl;
		this.sizeInMb = sizeInMb;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public int getSizeInMb() {
		return sizeInMb;
	}

	public void setSizeInMb(int sizeInMb) {
		this.sizeInMb = sizeInMb;
	}

}
