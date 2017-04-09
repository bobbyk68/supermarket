package com.akk.supermarket;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.Assert;

public class SuperMarketTest {
	
	@Test
	public void testEmptyBasket() {
		
		Basket emptyBasket = new Basket();
		Checkout nomoney = new Checkout(basket);
		BigDecimal price = nomoney.getBill();
		Assert.assertTrue(price.compareTo(BigDecimal.ZERO) == 0);
	}
	
	@Test
	public void testWeightedProduct() {
		Product potatoes = new Product("Potato", "King Edwards", new KgWeight(1.99), null);
	}
	
	@Test
	public void testBuyOneGetOneFree() {
		ISpecialOffer bogof = new BuyOneGetOneFreeOffer();
		Product apple = new Product("Apple", "Granny Smith", 0.59, bogof);
		Product newspaper = new Product("The Guardian", "Daily Paper", 1.8, null)
		Basket shopping = new Basket();
		basket.add(apple, 2);
		Checkout simpleShop = new Checkout(basket);
		simpleShop.getTotalPrice();
		simpleShop.getItemList();
		
		
	}

}
