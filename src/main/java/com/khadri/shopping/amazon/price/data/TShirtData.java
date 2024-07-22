package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class TShirtData {

	public static List<TShirtType> getTshirtTypes() {
		TShirt shirt1 = new TShirt(1,"Puma", 1000D, 1D);
		TShirt shirt2 = new TShirt(2,"Nike", 2000D, 99D);
		TShirtType tShirtType1 = new TShirtType(Constants.COLOR_NECK.name(), List.of(shirt1, shirt2));

		TShirt shirt3 = new TShirt(1,"Adidas", 1000D, 1D);
		TShirt shirt4 = new TShirt(2,"Reebok", 2000D, 99D);
		TShirtType tShirtType2 = new TShirtType(Constants.ROUND_NECK.name(), List.of(shirt3, shirt4));

		return List.of(tShirtType1, tShirtType2);
	}

}
