package com.akk.supermarket.service;

import java.math.BigDecimal;
import java.util.List;

import com.akk.supermarket.domain.Basket;
import com.akk.supermarket.domain.IPrice;
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
				IPrice type = item.getProduct().getPriceType();
				BigDecimal standardPrice = type.calculateCost(new BigDecimal(item.getAmount()));
				// special offers?
				ISpecialOffers possibleOffer = item.getProduct().getOffers();
				BigDecimal lowestPrice = standardPrice;
				if ( possibleOffer != null ) {
					BigDecimal offerPrice = possibleOffer.getOffer(item.getAmount(), 
							type.getPrice());
					lowestPrice = ( offerPrice.compareTo( standardPrice) == -1 ) ? offerPrice : standardPrice; 
				}
				cost = cost.add( lowestPrice );
			}
			return cost;
		}
		
}
