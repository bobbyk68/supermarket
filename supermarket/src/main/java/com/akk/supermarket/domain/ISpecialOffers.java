package com.akk.supermarket.domain;

import java.math.BigDecimal;

public interface ISpecialOffers {
	
	public BigDecimal getOffer(double quantity, BigDecimal price);
	
}
