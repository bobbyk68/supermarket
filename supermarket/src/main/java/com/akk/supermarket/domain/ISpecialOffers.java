package com.akk.supermarket.domain;

import java.math.BigDecimal;

interface ISpecialOffers {
	
	/*
	 * calculate price based on quantity and special offers
	Buy two cans of beans for £1. ( cans are 80p, price is overridden to £1 )
	- £1.99/kilo. ( the weight is calculated and then multiplied )
	- Buy three, get one free. ( get the quantity and see if they are eligible )
	*/
	
	public BigDecimal getOffer(int quantity);
	
}
