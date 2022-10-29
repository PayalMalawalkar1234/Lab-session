package com.ProductManagementSystem.model;

public class Product {
	private String productName;
	private int productId;
	private int productPrice;
	private int productQuantity;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, int productId, int productPrice, int productQuantity) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + "]";
	}

}
