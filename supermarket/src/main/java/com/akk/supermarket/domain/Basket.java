package com.akk.supermarket.domain;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private List<Item> items;
	
	public Basket(ArrayList<Item> items) {
		this.items = items;
	}

	public void addItemToBasket(Item item){
		items.add(item);
	}
	
	public List<Item> getItems(){
		return items;
	}
}
