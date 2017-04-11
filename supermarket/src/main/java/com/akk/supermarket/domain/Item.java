package com.akk.supermarket.domain;

public class Item {
	
	private IProduct product;
	private Double amount;
	
	public Double getAmount() {
		return amount;
	}

	public Item(IProduct product, double qty) {
		this.product = product;
		this.amount = qty;
	}
	
	public IProduct getProduct() {
		return product;
	}
	
	
	
	

}
