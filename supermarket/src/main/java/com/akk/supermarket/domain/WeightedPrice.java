package com.akk.supermarket.domain;

import java.math.BigDecimal;

public class WeightedPrice implements IPrice {

	private Double priceByWeight;
	
	public WeightedPrice(double weightPrice) {
		priceByWeight = weightPrice;
	}
	@Override
	public BigDecimal calculateCost(double weight) {
		return new BigDecimal(weight).multiply(new BigDecimal(priceByWeight));
	}
	@Override
	public double getPrice() {
		return 0;
	}

}
