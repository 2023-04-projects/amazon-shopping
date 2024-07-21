package com.khadri.shopping.amazon;

import java.util.Scanner;

import com.khadri.shopping.amazon.stock.category.Category;

public class AmazonDriver {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Stock[] values = Stock.values();
		Category category = new Category();

		while (true) {
			System.out.println("Choose any one Category:(1,2,3) ");
			System.out.println("1.Mens_wear");
			System.out.println("2.Kids_wear");
			System.out.println("3.Womens_wear");
			System.out.println("4.Previous");

			int option = scanner.nextInt();
			switch (option) {
			case 1:
				category.mensWear();
				break;
			case 2:
				category.kidsWear();
				break;
			case 3:
				category.womensWear();
				break;

			case 4:
				System.out.println("Thank you for shopping!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
				System.exit(0);
			}

		}

	}
}
