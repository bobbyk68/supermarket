package com.akk.supermarket.domain;

import java.math.BigDecimal;

public class BuyOneGetOneFree implements ISpecialOffers {
	public BigDecimal getOffer(double quantity, double val) {
		int notInDeal = new Double(quantity).intValue() % 2;
		return null;
	}
}

/*
	The basket will contains items with unit price (£1)
	and items with a weight price ( 69p by kg )

*/
