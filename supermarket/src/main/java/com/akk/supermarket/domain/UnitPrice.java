package com.akk.supermarket.domain;

import java.math.BigDecimal;

public class UnitPrice implements IPrice {

	private double price;
	
	public double getPrice() {
		return price;
	}

	public UnitPrice(double d) {
		this.price = d;
	}

	@Override
	public BigDecimal calculateCost(double amount) {
		return new BigDecimal(price).multiply(new BigDecimal(amount));
	}

}
