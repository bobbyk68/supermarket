package com.akk.supermarket.factory;

import com.akk.supermarket.domain.Basket;
import com.akk.supermarket.service.CheckoutService;

public class SuperMarketFactory {
	
	public static Basket getBasketInstance() {
		return new Basket();
	}
	
	public static CheckoutService getCheckoutInstance(Basket b) {
		return new CheckoutService(b);
	}

}
