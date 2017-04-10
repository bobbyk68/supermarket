package com.akk.supermarket.domain;

public class WeightedPrice implements IPrice {

	private Double weight;
	
	public WeightedPrice(double d) {
		weight = d;
	}

}
