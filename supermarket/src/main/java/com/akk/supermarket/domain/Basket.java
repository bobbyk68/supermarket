package com.akk.supermarket.domain;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private List<Item> items;
	
	public void add(Item item){
		items.add(item);
		
	}
	
	public List<Item> getItems(){
		return new ArrayList<Item>();
	}
}
