package com.akk.supermarket.domain;

import java.math.BigDecimal;

public interface IPrice {
	
	public BigDecimal getPrice();
	
	public BigDecimal calculateCost(BigDecimal amount);

}
