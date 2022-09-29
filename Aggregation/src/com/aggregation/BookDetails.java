package com.aggregation;

public class BookDetails {

	static void display(Book b) {
		System.out.println("Book name:" + b.getName());
		System.out.println("Book price:" + b.getPrice());
		System.out.println("Book author:" + b.getAuthor());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book("Cosmos", 1000, new Author("Carl Sagan", 60));
		System.out.println("Author details are:");
		display(b1);

		// Book b2 = new Book("The Song of Sea", 1300, "D.Morgan");
		// System.out.println("Author details are:");
		// display(b2);

	}

}
