package com.akk.supermarket.domain;

import java.math.BigDecimal;

public interface IPrice {
	
	public double getPrice();
	
	public BigDecimal calculateCost(double amount);

}
