package com.akk.supermarket.domain;

import java.math.BigDecimal;

public class BuyOneGetOneFree implements ISpecialOffers {
	public BigDecimal getOffer(double quantity, BigDecimal val) {
		double notInDeal = new Double(quantity).intValue() % 2;
		int inDeal = (int) (quantity - notInDeal) / 2;
		BigDecimal in = new BigDecimal(inDeal).multiply(val);
		BigDecimal out = new BigDecimal(notInDeal).multiply(val);
		return in.add(out);
	}

	
}


