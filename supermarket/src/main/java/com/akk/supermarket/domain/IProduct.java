package com.akk.supermarket.domain;

import java.math.BigDecimal;

public interface IProduct {
	
	public BigDecimal getPrice();
	public ISpecialOffers getOffers();

}
