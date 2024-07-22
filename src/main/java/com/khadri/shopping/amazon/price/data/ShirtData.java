package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class ShirtData {
	public static List<ShirtType> getShirtTypes() {
		Shirt shirt1 = new Shirt(1,"Puma", 4000D, 1D);
		Shirt shirt2 = new Shirt(2,"Nike", 1000D, 9D);
		ShirtType ShirtType1 = new ShirtType(Constants.FORMAL_SHIRTS.name(), List.of(shirt1, shirt2));

		Shirt shirt3 = new Shirt(1,"Adidas", 6000D, 1D);
		Shirt shirt4 = new Shirt(2,"Reebok", 4000D, 10D);
		ShirtType ShirtType2 = new ShirtType(Constants.CHECKS_SHIRTS.name(), List.of(shirt3, shirt4));

		return List.of(ShirtType1, ShirtType2);
	}

}
