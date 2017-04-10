package com.akk.supermarket.service;

import java.math.BigDecimal;
import java.util.List;

import com.akk.supermarket.domain.Basket;
import com.akk.supermarket.domain.Item;

public class CheckoutService {

		private Basket basket;

		public CheckoutService(Basket basket) {
			this.basket = basket;
		}
		
		public BigDecimal calculateBill() {
			BigDecimal cost = BigDecimal.ZERO;
			List<Item> items = basket.getItems();
			for ( Item item : items) {
				// special offers?
				//item.getProduct().getOffers()
				cost(item.getQuantity(), item.getProduct().getPrice());
			}
			return cost;
		}
		
		private BigDecimal cost(int quantity, BigDecimal price){
			return new BigDecimal(quantity ).multiply(price);
		}
}
