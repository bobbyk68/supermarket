package com.akk.supermarket.service;

import java.math.BigDecimal;
import java.util.List;

import com.akk.supermarket.domain.Basket;
import com.akk.supermarket.domain.ISpecialOffers;
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
				ISpecialOffers possibleOffer = item.getProduct().getOffers();
				BigDecimal offerPrice = possibleOffer.getOffer(item.getAmount(), item.getProduct().getPrice().getPrice());
				BigDecimal standardPrice = item.getProduct().getPrice().calculateCost(item.getAmount());
				BigDecimal lowestPrice = ( offerPrice.compareTo( standardPrice) == -1 ) ? offerPrice : standardPrice; 
				cost = cost.add( lowestPrice );
			}
			return cost;
		}
		
//		private BigDecimal cost(IPrice price, Double qty){
//			return new BigDecimal(quantity ).multiply(price);
//		}
}
