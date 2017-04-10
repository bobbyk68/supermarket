package com.akk.supermarket.domain;

import java.math.BigDecimal;

public class Product implements IProduct {

	private String name;
	private String description;
	private BigDecimal price;
	private ISpecialOffers offers;
	
	public BigDecimal getPrice() {
		return price;
	}


	public ISpecialOffers getOffers() {
		return offers;
	}

	
	
}