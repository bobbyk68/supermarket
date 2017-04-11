package com.akk.supermarket;
import java.math.BigDecimal;

import junit.framework.Assert;

import org.junit.Test;

import com.akk.supermarket.domain.Basket;
import com.akk.supermarket.domain.BuyOneGetOneFree;
import com.akk.supermarket.domain.IProduct;
import com.akk.supermarket.domain.ISpecialOffers;
import com.akk.supermarket.domain.Item;
import com.akk.supermarket.domain.Product;
import com.akk.supermarket.domain.UnitPrice;
import com.akk.supermarket.domain.WeightedPrice;
import com.akk.supermarket.factory.SuperMarketFactory;
import com.akk.supermarket.service.CheckoutService;

public class SuperMarketTest {
	
	@Test
	public void testEmptyBasket() {
		Basket emptyBasket = SuperMarketFactory.getBasketInstance();
		CheckoutService nomoney = SuperMarketFactory.getCheckoutInstance(emptyBasket);
		BigDecimal price = nomoney.calculateBill();
		Assert.assertTrue(price.compareTo(BigDecimal.ZERO) == 0);
	}
	
	
	@Test
	public void testWeightedProductandUnitProductTypes() {
		IProduct potatoes = new Product("Potato", "King Edwards", new WeightedPrice(1.99));
		IProduct apple = new Product("Apple", "Granny", new UnitPrice(0.59));
		Basket shopping = SuperMarketFactory.getBasketInstance();
		shopping.addItemToBasket(new Item(apple, 2));
		shopping.addItemToBasket(new Item(potatoes, 3.0)); //3kg
		Assert.assertEquals(shopping.getItems().size(), 2);
		CheckoutService simpleShop = new CheckoutService(shopping);
		BigDecimal totalCost = simpleShop.calculateBill();
		checkResult(totalCost,7.15);

	}
	
	@Test
	public void testSpecialOffer() {
		ISpecialOffers bogof = new BuyOneGetOneFree();
		Product apple = new Product("Apple", "Granny Smith", new UnitPrice(0.59), bogof);
		Product newspaper = new Product("The Guardian", "Daily Paper", new UnitPrice(1.8));
		Basket shopping =  SuperMarketFactory.getBasketInstance();
		shopping.addItemToBasket(new Item(apple, 2));
		shopping.addItemToBasket(new Item(newspaper,1));
		CheckoutService simpleShop = new CheckoutService(shopping);
		BigDecimal totalCost = simpleShop.calculateBill();
		checkResult(totalCost, 2.39);
	}

	@Test
	public void testSimple() {
		Product apple = new Product("Apple", "Granny Smith", new UnitPrice(0.59));
		Product newspaper = new Product("The Times", "Daily Paper", new UnitPrice(0.9));
		Basket shopping =  SuperMarketFactory.getBasketInstance();
		shopping.addItemToBasket(new Item(apple, 1));
		shopping.addItemToBasket(new Item(newspaper,1));
		CheckoutService simpleShop = new CheckoutService(shopping);
		BigDecimal totalCost = simpleShop.calculateBill();
		checkResult(totalCost, 1.49);
	}

	
	@Test
	public void testBuyOneGetOneFreeWithExtraUnits() {
		ISpecialOffers bogof = new BuyOneGetOneFree();
		Product apple = new Product("Apple", "Granny Smith", new UnitPrice(0.59), bogof);
		Basket shopping =  SuperMarketFactory.getBasketInstance();
		shopping.addItemToBasket(new Item(apple, 3));
		CheckoutService simpleShop = new CheckoutService(shopping);
		BigDecimal totalCost = simpleShop.calculateBill();
		checkResult(totalCost, 1.18);
	}

	private void checkResult(BigDecimal totalCost, double expectedValue) {
		Assert.assertEquals(0, totalCost.setScale(2, BigDecimal.ROUND_HALF_UP)
				.compareTo(new BigDecimal(expectedValue).setScale(2, BigDecimal.ROUND_HALF_UP)));
	}
	
}
