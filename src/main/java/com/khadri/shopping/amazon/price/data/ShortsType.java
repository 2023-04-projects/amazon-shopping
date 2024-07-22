package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class ShortsType {

	private String type;

	private List<Shorts> listOfShorts;

	public ShortsType(String type, List<Shorts> listOfShorts) {
		super();
		this.type = type;
		this.listOfShorts = listOfShorts;
	}

	public String getType() {
		return type;
	}

	public List<Shorts> getListOfShorts() {
		return listOfShorts;
	}
	
}
