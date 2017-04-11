package com.akk.supermarket.domain;

import java.math.BigDecimal;

public class WeightedPrice implements IPrice {

	private BigDecimal priceByWeight;
	
	public WeightedPrice(double weightPrice) {
		priceByWeight = new BigDecimal(weightPrice);
	}
	@Override
	public BigDecimal calculateCost(BigDecimal weight) {
		return weight.multiply(priceByWeight);
	}
	@Override
	public BigDecimal getPrice() {
		return BigDecimal.ZERO;
	}

}
