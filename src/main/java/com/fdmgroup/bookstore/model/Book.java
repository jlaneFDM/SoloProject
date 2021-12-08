package com.fdmgroup.bookstore.model;

public class Book {
	private int itemId;
	private double price;
	private String title;
	private BookGenre bookGenre;

	public Book(int itemId, double price, String title, BookGenre bookGenre) {
		super();
		this.itemId = itemId;
		this.price = price;
		this.title = title;
		this.bookGenre = bookGenre;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BookGenre getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(BookGenre bookGenre) {
		this.bookGenre = bookGenre;
	}

	@Override
	public String toString() {
		return "Book [itemId=" + itemId + ", price=" + price + ", title=" + title + ", bookGenre=" + bookGenre + "]";
	}

}
