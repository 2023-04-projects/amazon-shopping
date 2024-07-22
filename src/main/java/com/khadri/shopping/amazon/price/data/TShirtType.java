package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class TShirtType {

	private String type;

	private List<TShirt> listOfTShirts;

	public TShirtType(String type, List<TShirt> listOfTShirts) {
		super();
		this.type = type;
		this.listOfTShirts = listOfTShirts;
	}

	public String getType() {
		return type;
	}

	public List<TShirt> getListOfTShirts() {
		return listOfTShirts;
	}



}
