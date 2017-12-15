package com.onetoone;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("paper_book")
public class PaperBook extends Book {
	@Column(name = "shipping_weight")
	private float shippingWeight;
	@Column(name = "in_stock")
	private int inStock;
	
	public PaperBook() {
		super();
	}

	public PaperBook(String title, double price, String isbn, String publisher, String edition,
			float shippingWeight, int inStock) {
		super(title, price, isbn, publisher, edition);
		this.shippingWeight = shippingWeight;
		this.inStock = inStock;
	}

	public float getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(float shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

}
