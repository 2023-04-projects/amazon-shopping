package com.khadri.shopping.amazon.price.data;

import java.util.List;

public class NightWearData {
	public static List<NightWearType> getNightWearType() {
		NightWear nightWear1 = new NightWear(1,"ARSHIA_FASHIONS", 500d, 2D);
		NightWear nightWear2 = new NightWear(2,"BORNWEAR", 700D, 9D);
		NightWearType nightWearType1 = new NightWearType(Constants.NIGHT_DRESS.name(), List.of(nightWear1, nightWear2));

		NightWear nightWear3 = new NightWear(1,"BABYWISH", 1000D, 10D);
		NightWear nightWear4 = new NightWear(2,"MAX", 600D, 5D);
		NightWearType nightWearType2 = new NightWearType(Constants.SHORTS.name(), List.of(nightWear3, nightWear4));

		return List.of(nightWearType1, nightWearType2);
	}

}
