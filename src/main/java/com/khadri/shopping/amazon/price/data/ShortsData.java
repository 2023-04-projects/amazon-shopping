package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class ShortsData {

	public static List<ShortsType> getShortsType() {
		Shorts shorts1 = new Shorts(1,"CROCS", 1200D, 1D);
		Shorts shorts2 = new Shorts (2,"TEAMSPRIT", 1000D, 9D);
		ShortsType shortsType1 = new ShortsType(Constants.CARGO_SHORTS.name(), List.of(shorts1, shorts2));
		
		Shorts shorts3 = new Shorts(1,"SUPERDRY", 1000D, 1D);
		Shorts shorts4 = new Shorts(2,"MACK_VIMAL", 2000D, 99D);
		ShortsType shortsType2 = new ShortsType(Constants.BOARD_SHORTS.name(), List.of(shorts3, shorts4));

		return List.of(shortsType1, shortsType2);
	}

}
