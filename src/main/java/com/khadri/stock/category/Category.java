package com.khadri.stock.category;

import java.util.Scanner;

public class Category {

	public void mensWear() {
		System.out.println("U entered into Mens-wear");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select one option");
		System.out.println("1.T-shirts");
		System.out.println("2.Jeans");
		System.out.println("3.Shorts");

		System.out.println("4.Previous");

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("T-Shirts Selected");
			
			break;
		case 2:
			System.out.println("jeans -Selected");
			break;
		case 3:
			System.out.println("Shorts- Selected");
			
			break;
		case 4:
			System.out.println("Back to menu ");
			
			break;

		default:
			break;
		}
		
	}
	public void kidsWear() {
		System.out.println("U entered into kids-wear");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select one option");
		System.out.println("1.T-shirts");
		System.out.println("2.Jeans");
		System.out.println("3.Shorts");

		System.out.println("4.Previous");

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("T-Shirts Selected");
			
			break;
		case 2:
			System.out.println("jeans -Selected");
			break;
		case 3:
			System.out.println("Shorts- Selected");
			
			break;
		case 4:
			System.out.println("Back to menu ");
			
			break;

		default:
			break;
		}
		
	}
	public void womensWear() {
		System.out.println("U entered into womenswear");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select one option");
		System.out.println("1.T-shirts");
		System.out.println("2.Sarry");
		System.out.println("3.LongFrocks");

		System.out.println("4.Previous");

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("T-Shirts Selected");
			
			break;
		case 2:
			System.out.println("Sarry -Selected");
			break;
		case 3:
			System.out.println("LongFrocks- Selected");
			
			break;
		case 4:
			System.out.println("Back to menu ");
			
			break;

		default:
			break;
		}
		
	}

}
