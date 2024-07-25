package com.khadri.shopping.amazon;

import java.util.Scanner;

import com.khadri.shopping.amazon.stock.category.Category;

public class AmazonDriver {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Stock[] values = Stock.values();
		Category category = new Category();

		boolean isContinueShopping = false;

		do {

			System.out.println("########## Home Page ##########");
			System.out.println("1.Mens_wear");
			System.out.println("2.Kids_wear");
			System.out.println("3.Womens_wear");
			System.out.println("4.Previous");

			System.out.println("Choose any one Category:(1,2,3) ");
			System.out.println("=============================");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				category.mensWear(isContinueShopping);
				break;
			case 2:
				category.kidsWear(isContinueShopping);
				break;
			case 3:
				category.womensWear(isContinueShopping);
				break;

			case 4:
				System.out.println("Thank you for shopping!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
				System.exit(0);
			}

		} while (isContinueShopping);

		scanner.close();

	}
}
