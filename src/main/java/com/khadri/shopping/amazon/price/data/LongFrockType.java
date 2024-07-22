package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class LongFrockType {
	private String type;
	private List<LongFrock> listOfLongFrock;
	
	public LongFrockType(String type, List<LongFrock> listOfLongFrock) {
		super();
		this.type = type;
		this.listOfLongFrock = listOfLongFrock;
	}

	public String getType() {
		return type;
	}

	public List<LongFrock> getListOfLongFrock() {
		return listOfLongFrock;
	}
	


}
