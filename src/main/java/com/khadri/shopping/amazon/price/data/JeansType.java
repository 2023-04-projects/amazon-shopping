package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class JeansType {
	 String type;
	 List<Jeans> ListOfJeans;
	 
	 public JeansType(String type, List<Jeans> listOfJeans) {
		super();
		this.type = type;
		ListOfJeans = listOfJeans;
	}

	public String getType() {
		return type;
	}

	public List<Jeans> getListOfJeans() {
		return ListOfJeans;
	}


	

}
