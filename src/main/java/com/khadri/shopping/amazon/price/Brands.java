package com.khadri.shopping.amazon.price;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Brands {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> tShirtTypes = new ArrayList<>();
		tShirtTypes.add("Plain T-Shirt");
		tShirtTypes.add("roundNeck T-Shirt");
		tShirtTypes.add("hudi T-Shirt");

		Map<String, Double> prices = new HashMap<>();
		Map<String, Double> discounts = new HashMap<>();
		Map<String, String> brands = new HashMap<>();

		brands.put("Plain T-Shirt", "Puma");
		brands.put("roundNeck T-Shirt", "American");
		brands.put("hudi T-Shirt", "Adadis");

		prices.put("Plain T-Shirt", 1000.00);
		prices.put("roundNeck T-Shirt", 2000.00);
		prices.put("hudi T-Shirt", 3000.00);

		discounts.put("Plain T-Shirt", 10.0);
		discounts.put("roundNeck T-Shirt", 15.0);
		discounts.put("hudi T-Shirt", 20.0);

		boolean exit = false;
		while (!exit) {
			System.out.println("Select a T-Shirt type:");
			for (int i = 0; i < tShirtTypes.size(); i++) {
				System.out.println((i + 1) + ". " + tShirtTypes.get(i));
			}
			int choice = sc.nextInt();
			if (choice >= 1 && choice <= tShirtTypes.size()) {
				String selectedTShirt = tShirtTypes.get(choice - 1);
				System.out.println("You selected: " + selectedTShirt);
				System.out.println("brand:" + brands.get(selectedTShirt));
				System.out.println("Price: $" + prices.get(selectedTShirt));
				System.out.println("Discount: " + discounts.get(selectedTShirt) + "%");

				System.out.println("\nDo you want to select another T-Shirt? (YES/NO)");
				String answer = sc.next();
				if (!answer.equalsIgnoreCase("YES")) {
					exit = true;
				}
			} else {
				System.out.println("Invalid choice");
			}

		}
	}

}
