package com.aggregation;

public class Book {
	private String name;
	private int price;
	private String authorName;

	// public Book() {
	// super();
	// TODO Auto-generated constructor stub
	// }

	public Book(String name, int price, String author) {
		super();
		this.name = name;
		this.price = price;
		this.authorName = authorName;
	}

	public Book(String string, int i, Author author2) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return authorName;
	}

	public void setAuthor(String author) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", authorName=" + authorName + "]";
	}

}
