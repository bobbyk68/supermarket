package com.akk.supermarket.domain;

import java.math.BigDecimal;

public class UnitPrice implements IPrice {

	private BigDecimal price;
	
	public BigDecimal getPrice() {
		return price;
	}

	public UnitPrice(double unitPrice) {
		this.price = new BigDecimal(unitPrice);
	}

	@Override
	public BigDecimal calculateCost(BigDecimal amount) {
		return price.multiply(amount);
	}

	

}
