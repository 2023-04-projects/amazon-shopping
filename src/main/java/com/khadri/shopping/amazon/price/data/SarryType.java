package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class SarryType {
	private String type;

	private List<Sarry> listOfSarry;

	public SarryType(String type, List<Sarry> listOfSarry) {
		super();
		this.type = type;
		this.listOfSarry = listOfSarry;
	}

	public String getType() {
		return type;
	}

	public List<Sarry> getListOfSarry() {
		return listOfSarry;
	}



}
