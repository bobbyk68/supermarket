package com.akk.supermarket;

import java.math.BigDecimal;

public class Product {

	private String name;
	private String description;
	private BigDecimal price;
	private ISpecialOffers offers;
	
	
	public BigDecimal cost(int quantity){
		return new BigDecimal(quantity ).multiply(price);
	}
	
}


interface ISpecialOffer {
	
	/*
	 * calculate price based on quantity and special offers
	Buy two cans of beans for £1. ( cans are 80p, price is overridden to £1 )
	- £1.99/kilo. ( the weight is calculated and then multiplied )
	- Buy three, get one free. ( get the quantity and see if they are eligible )
	*/
	
	public BigDecimal getOffer(int quantity);
	
}

class BuyOneGetOneFree implements ISpecialOffers {
	public BigDecimal getOffer(int quantity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

/*
	The basket will contains items with unit price (£1)
	and items with a weight price ( 69p by kg )

*/