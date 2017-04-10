package com.akk.supermarket.domain;

public class Item {
	
	private IProduct product;
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}

	public Item(IProduct product, int qty) {
		this.product = product;
		this.quantity = qty;
	}
	
	public IProduct getProduct() {
		return product;
	}
	
	
	
	

}
