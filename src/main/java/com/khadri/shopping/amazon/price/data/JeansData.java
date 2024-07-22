package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class JeansData {

	public static List<JeansType> getJeansType() {
		Jeans jeans1 = new Jeans(1,"Puma", 2000D, 1D);
		Jeans jeans2 = new Jeans(2,"Nike", 3000D, 99D);
		JeansType jeansType1 = new JeansType(Constants.BOOTCUT.name(), List.of(jeans1, jeans2));

		Jeans jeans3 = new Jeans(1,"Lee", 5000D, 1D);
		Jeans jeans4 = new Jeans(2,"Spykar", 7000D, 99D);
		JeansType jeansType2 = new JeansType(Constants.SLIMFIT.name(), List.of(jeans3, jeans4));
		
		return List.of(jeansType1, jeansType2);
	}

}
