package com.akk.supermarket.domain;

import java.math.BigDecimal;

public class Product implements IProduct {

	private String name;
	private String description;
	private IPrice price;
	private ISpecialOffers offers;
	
	public IPrice getPrice() {
		return price;
	}

	public Product(String name, String desc, IPrice type) {
		this.name = name;
		this.description = desc;
		this.price = type;
	}
	
	public Product(String name, String desc, IPrice type, ISpecialOffers offer) {
		this.name = name;
		this.description = desc;
		this.price = type;
		this.offers = offer;
	}

	public ISpecialOffers getOffers() {
		return offers;
	}

	
	
}