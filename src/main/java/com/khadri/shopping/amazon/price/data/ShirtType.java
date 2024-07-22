package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class ShirtType {
	private String type;

	private List<Shirt> listOfShirts;

	public ShirtType(String type, List<Shirt> listOfShirts) {
		super();
		this.type = type;
		this.listOfShirts = listOfShirts;
	}

	public String getType() {
		return type;
	}

	public List<Shirt> getListOfShirts() {
		return listOfShirts;
	}


}
