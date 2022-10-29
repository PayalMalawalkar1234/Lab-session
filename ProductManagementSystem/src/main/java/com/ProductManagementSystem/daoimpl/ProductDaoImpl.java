package com.ProductManagementSystem.daoimpl;

import java.util.ArrayList;
import java.util.Scanner;

import com.ProductManagementSystem.dao.ProductDao;
import com.ProductManagementSystem.model.Product;

public class ProductDaoImpl implements ProductDao {

	ArrayList<Product> products = new ArrayList<Product>();

	Scanner sc = new Scanner(System.in);

	// add products
	public void addProduct() {

		Product p = new Product();

		System.out.println("Enter product Id :");
		p.setProductId(sc.nextInt());

		System.out.println("Enter product name :");
		p.setProductName(sc.next());

		System.out.println("Enter product quantity :");
		p.setProductQuantity(sc.nextInt());

		System.out.println("Enter product price :");
		p.setProductPrice(sc.nextInt() * p.getProductQuantity());

		products.add(p);
		System.out.println("-------- PRODUCT ADDED --------\n");
	}

	// delete product
	public void deleteProduct() {

		Product p = new Product();

		System.out.println("Enter product Id :");
		int pId = sc.nextInt();

		Product delProduct = null;
		boolean isFound = false;

		// traverse products
		for (Product i : products) {

			if (pId == i.getProductId()) {

				delProduct = i;

				isFound = true;
			}
		}

		if (isFound) {

			products.remove(delProduct);
			System.out.println("-------- PRODUCT DELETED --------\n");
		}

		else {
			System.out.println("No product found\n");
		}

	}

	// display all products
	public void displayAllProduct() {

		System.out.println("Products are:  ");
		products.forEach(product -> System.out.println(product));
	}

	public void sortOnPrice() {
		// input price
		System.out.println("Enter the price to sort :");
		int price = sc.nextInt();

		System.out.println("1 Price greater than");
		System.out.println("2 Price lower than");

		System.out.println("Enter choice");
		int ch = sc.nextInt();

		if (ch == 1) {
			System.out.println("Poducts which are above price: ");

			for (Product i : products) {

				if (i.getProductPrice() > price) {

					System.out.println(i);
				}
			}
		}

		else {
			System.out.println("Products which are below price: ");
			// traverse products
			for (Product i : products) {

				if (i.getProductPrice() < price) {

					System.out.println(i);
				}
			}
		}
	}

	public void sortOnQuantity() {

		System.out.println("Enter the quantity to sort :");
		int quantity = sc.nextInt();

		System.out.println("1 Quantity greater than");
		System.out.println("2 Quantity lower than");

		System.out.println("Enter choice");
		int ch = sc.nextInt();

		if (ch == 1) {
			System.out.println("Products which are above quantity: ");
			// traverse products
			for (Product i : products) {

				if (i.getProductQuantity() > quantity) {

					System.out.println(i);
				}
			}
		}

		else {
			System.out.println("Products which are below quantity: ");
			// traverse products
			for (Product i : products) {

				if (i.getProductQuantity() < quantity) {

					System.out.println(i);
				}
			}
		}
	}

}
