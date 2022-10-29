package com.ProductManagementSystem;

import java.util.Scanner;

import com.ProductManagementSystem.daoimpl.ProductDaoImpl;

public class AppTest {

	public static void printMenu() {
		System.out.println("\n--------- MENU ---------");
		System.out.println("1. ADD PRODUCT");
		System.out.println("2. DELETE PRODUCT");
		System.out.println("3. DISPLAY ALL PRODUCTs");
		System.out.println("4. SORT BY PRICE");
		System.out.println("5. SORT BY QUANTITY");

	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			ProductDaoImpl pd = new ProductDaoImpl();

			boolean performOperations = true;

			while (performOperations) {

				printMenu();

				System.out.println(" Enter choice : ");
				int ch = sc.nextInt();

				switch (ch) {

				case 1:
					pd.addProduct();

				case 2:
					pd.deleteProduct();

				case 3:
					pd.displayAllProduct();

				case 4:
					pd.sortOnPrice();

				case 5:
					pd.sortOnQuantity();
				}
			}
		}

	}
}
