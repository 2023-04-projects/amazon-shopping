package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class NightWearType {
	private String type;

	private List<NightWear> listOfNightWear;

	public NightWearType(String type, List<NightWear> listOfNightWear) {
		super();
		this.type = type;
		this.listOfNightWear = listOfNightWear;
	}

	public String getType() {
		return type;
	}

	public List<NightWear> getListOfNightWear() {
		return listOfNightWear;
	}
	

}
