package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class LongFrockData {
	
	public static List<LongFrockType> getLongFrockType() {
		LongFrock LongFrock1 = new LongFrock(1,"ARSHIA_FASHIONS", 1500d, 2D);
		LongFrock LongFrock2 = new LongFrock(2,"BORNWEAR", 1300D, 9D);
		LongFrockType LongFrockType1 = new LongFrockType(Constants.BALL_GOWNS.name(), List.of(LongFrock1, LongFrock2));

		LongFrock LongFrock3 = new LongFrock(1,"BABYWISH", 1000D, 10D);
		LongFrock LongFrock4 = new LongFrock(2,"MAX", 800D, 5D);
		LongFrockType LongFrockType2 = new LongFrockType(Constants.BUBBLE_DRESS.name(), List.of(LongFrock3, LongFrock4));

		return List.of(LongFrockType1, LongFrockType2);
	}
}
