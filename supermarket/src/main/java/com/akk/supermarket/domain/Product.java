package com.akk.supermarket.domain;

import java.math.BigDecimal;

public class Product implements IProduct {

	private String name;
	private String description;
	private BigDecimal price;
	private ISpecialOffers offers;
	
	
	public BigDecimal cost(int quantity){
		return new BigDecimal(quantity ).multiply(price);
	}
	
}