package com.khadri.shopping.amazon.price;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DriverTypes1 {
	
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
        
		ArrayList<String> jeansTypes = new ArrayList<>();
		jeansTypes.add("Black jeans");
		jeansTypes.add("Blue jeans");
		jeansTypes.add("Ton jeans");
		
		brands.put("Black jeans", "Puma");
		brands.put("Blue jeans", "American");
		brands.put("Ton jeans", "Adadis");
		 
		prices.put("Black jeans", 3000.00);
		prices.put("Blue jeans", 2500.00);
		prices.put("Ton jeans", 5000.00);
		
		discounts.put("Black jeans", 10.0);
		discounts.put("Blue jeans", 15.0);
		discounts.put("Ton jeans", 20.0);
		
		ArrayList<String> shortsTypes = new ArrayList<>();
		shortsTypes.add("night shorts");
		shortsTypes.add("boxers");
		shortsTypes.add("mens shorts");

		brands.put("night shorts", "Puma");
		brands.put("boxers", "American");
		brands.put("mens shorts", "Adadis");
		
		prices.put("night shorts", 500.00);
		prices.put("boxers", 300.00);
		prices.put("mens shorts", 600.00);

		discounts.put("night shorts", 5.0);
		discounts.put("boxers", 3.0);
		discounts.put("mens shorts", 6.0);
		while (true) {
			System.out.println("Choose any one Type:(1,2,3) ");
			System.out.println("1.tshirts");
			System.out.println("2.jeans");
			System.out.println("3.shorts");

			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Select a T-Shirt type:");
				for (int i = 0; i < tShirtTypes.size(); i++) {
					System.out.println((i + 1) + ". " + tShirtTypes.get(i));
				}
				int tchoice = sc.nextInt();
				if (tchoice >= 1 && tchoice <= tShirtTypes.size()) {
					String selectedTShirt = tShirtTypes.get(tchoice - 1);
					System.out.println("You selected: " + selectedTShirt);
					System.out.println("brand:" + brands.get(selectedTShirt));
					System.out.println("Price: $" + prices.get(selectedTShirt));
					System.out.println("Discount: " + discounts.get(selectedTShirt) + "%");

					System.out.println("\nDo you want to select another T-Shirt? (yes/no)");
					String answer = sc.next();
					if (!answer.equalsIgnoreCase("yes")) {
						System.out.println("Thank you for shopping!");
						sc.close();
						return;
					}
				} else {
					System.out.println("Invalid choice");
				}
				break;
			case 2:
				System.out.println("Select a Jeans type:");
				for (int i = 0; i < jeansTypes.size(); i++) {
					System.out.println((i + 1) + ". " + jeansTypes.get(i));
				}
				int jchoice = sc.nextInt();
				if (jchoice >= 1 && jchoice <= jeansTypes.size()) {
					String selectedJeans = jeansTypes.get(jchoice - 1);
					System.out.println("You selected: " + selectedJeans);
					System.out.println("brand:" + brands.get(selectedJeans));
					System.out.println("Price: $" + prices.get(selectedJeans));
					System.out.println("Discount: " + discounts.get(selectedJeans) + "%");

					System.out.println("\nDo you want to select another Jeans? (yes/no)");
					String answer = sc.next();
					if (!answer.equalsIgnoreCase("yes")) {
						System.out.println("Thank you for shopping!");
						sc.close();
						return;
					}
				} else {
					System.out.println("Invalid choice");
				}
				break;
			case 3:
				System.out.println("select a shorts type");
				for(int i=0;i<shortsTypes.size();i++) {
					System.out.println((i+1)+"."+shortsTypes.get(i));
				}
				int schoice = sc.nextInt();
				if (schoice >= 1 && schoice <= shortsTypes.size()) {
					String selectedshorts = shortsTypes.get(schoice - 1);
					System.out.println("You selected: " + selectedshorts);
					System.out.println("brand:" + brands.get(selectedshorts));
					System.out.println("Price: $" + prices.get(selectedshorts));
					System.out.println("Discount: " + discounts.get(selectedshorts) + "%");

					System.out.println("\nDo you want to select another Shorts? (yes/no)");
					String answer = sc.next();
					if (!answer.equalsIgnoreCase("yes")) {
						System.out.println("Thank you for shopping!");
						sc.close();
						return;
					}
				} else {
					System.out.println("Invalid choice");
				}
				break;
			case 4:
				System.out.println("Thank you for shopping!");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}

		}
	}
}
