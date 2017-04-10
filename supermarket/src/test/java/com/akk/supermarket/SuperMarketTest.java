package com.akk.supermarket;
import java.math.BigDecimal;

import org.junit.Test;

import com.akk.supermarket.domain.Basket;
import com.akk.supermarket.domain.IProduct;
import com.akk.supermarket.domain.Product;
import com.akk.supermarket.domain.UnitPrice;
import com.akk.supermarket.domain.WeightedPrice;
import com.akk.supermarket.factory.SuperMarketFactory;
import com.akk.supermarket.service.CheckoutService;

import junit.framework.Assert;

public class SuperMarketTest {
	
	@Test
	public void testEmptyBasket() {
		Basket emptyBasket = SuperMarketFactory.getBasketInstance();
		CheckoutService nomoney = SuperMarketFactory.getCheckoutInstance(emptyBasket);
		BigDecimal price = nomoney.calculateBill();
		Assert.assertTrue(price.compareTo(BigDecimal.ZERO) == 0);
	}
	
	
	@Test
	public void testCombinedProductTypes() {
		IProduct potatoes = new Product("Potato", "King Edwards", new WeightedPrice(1.99));
		IProduct apple = new Product("Apple", "Granny", new UnitPrice(0.59));
	}
	/*
	@Test
	public void testBuyOneGetOneFree() {
		ISpecialOffers bogof = new BuyOneGetOneFree();
		Product apple = new Product("Apple", "Granny Smith", 0.59, bogof);
		Product newspaper = new Product("The Guardian", "Daily Paper", 1.8)
		Basket shopping = new Basket();
		shopping.add(apple, 2);
		CheckoutService simpleShop = new CheckoutService(shopping);
		simpleShop.getTotalPrice();
		simpleShop.getItemList();
	}
	*/
}
