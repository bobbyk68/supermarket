package com.akk.supermarket;
import java.math.BigDecimal;

import org.junit.Test;

import com.akk.supermarket.domain.Basket;
import com.akk.supermarket.domain.BuyOneGetOneFree;
import com.akk.supermarket.domain.ISpecialOffers;
import com.akk.supermarket.domain.Product;
import com.akk.supermarket.domain.WeightedPrice;
import com.akk.supermarket.service.Checkout;

import junit.framework.Assert;

public class SuperMarketTest {
	
	@Test
	public void testEmptyBasket() {
		Basket emptyBasket = new Basket();
		Checkout nomoney = new Checkout(emptyBasket);
		BigDecimal price = nomoney.getBill();
		Assert.assertTrue(price.compareTo(BigDecimal.ZERO) == 0);
	}
	
	@Test
	public void testCombinedProductTypes() {
		Product potatoes = new Product("Potato", "King Edwards", new WeightedPrice(1.99));
		Product apple = new Product("Apple", "Granny", new UnitPrice(0.59));
	}
	
	@Test
	public void testBuyOneGetOneFree() {
		ISpecialOffers bogof = new BuyOneGetOneFree();
		Product apple = new Product("Apple", "Granny Smith", 0.59, bogof);
		Product newspaper = new Product("The Guardian", "Daily Paper", 1.8)
		Basket shopping = new Basket();
		shopping.add(apple, 2);
		Checkout simpleShop = new Checkout(shopping);
		simpleShop.getTotalPrice();
		simpleShop.getItemList();
	}
}
