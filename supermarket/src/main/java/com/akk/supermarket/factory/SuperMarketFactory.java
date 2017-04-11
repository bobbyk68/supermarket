package com.akk.supermarket.factory;

import java.util.ArrayList;

import com.akk.supermarket.domain.Basket;
import com.akk.supermarket.domain.Item;
import com.akk.supermarket.service.CheckoutService;


public class SuperMarketFactory {
	
	public static Basket getBasketInstance() {
		return new Basket(new ArrayList<Item>());
	}
	
	public static CheckoutService getCheckoutInstance(Basket b) {
		return new CheckoutService(b);
	}

}
