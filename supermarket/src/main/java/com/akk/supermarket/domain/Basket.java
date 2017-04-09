package com.akk.supermarket.domain;

import java.util.List;

public class Basket {

	private List<Product> items;
	
	public void add(Product item){
		items.add(item);
		
	}
}
