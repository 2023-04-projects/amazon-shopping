package com.khadri.shopping.amazon.stock.category;

import java.util.List;

import com.khadri.shopping.amazon.price.data.Constants;
import com.khadri.shopping.amazon.price.data.Shirt;
import com.khadri.shopping.amazon.price.data.ShirtType;

public class SarryData {
	public static List<SarryType> getSarryTypes() {
		Sarry sarry1 = new Sarry(1,"siril", 4000D, 1D);
		Sarry sarry2 = new Sarry(2,"Enterprise", 1000D, 9D);
		SarryType SarryType1 = new SarryType(Constants.SILK_SARRY.name(), List.of(sarry1, sarry2));

		Sarry sarry3 = new Sarry(1,"Adidas", 6000D, 1D);
		Sarry sarry4 = new Sarry(2,"Varadha", 4000D, 10D);
		SarryType SarryType2 = new SarryType(Constants.PATTU_SARRY.name(), List.of(sarry3, sarry4));

		return List.of(SarryType1, SarryType2);
	}


}
