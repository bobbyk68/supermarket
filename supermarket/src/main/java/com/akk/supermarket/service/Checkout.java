package com.akk.supermarket.service;

import java.math.BigDecimal;
import java.util.List;

import com.akk.supermarket.domain.Basket;
import com.akk.supermarket.domain.Item;

public class Checkout {

		private Basket basket;

		public Checkout(Basket basket) {
			this.basket = basket;
		}
		
		public BigDecimal getBill() {
			List<Item> items = basket.getItems();
			return null;
		}
}
