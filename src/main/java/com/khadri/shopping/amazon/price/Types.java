package com.khadri.shopping.amazon.price;

import java.util.Scanner;

public class Types {
	public static void tshirts() {
		
		System.out.println("please select type");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.plain T-shirts");
		System.out.println("2.roundNeck T-shirt");
		System.out.println("3.hudi T-shirt");

		System.out.println("4.Previous");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("plain T-Shirts selected");
			
			break;
		case 2:
			System.out.println("roundNeck T-shirt selected");
			break;
		case 3:
			System.out.println("hudi T-shirt selected");
			
			break;
		case 4:
			System.out.println("Back to menu ");
			
			break;

		default:
			break;
		}
		
	}
	public void jeans() {
		System.out.println("please select type ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Black jeans");
		System.out.println("2.Blue jeans");
		System.out.println("3.Ton jeans");

		System.out.println("4.Previous");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Black jeans Selected");
			
			break;
		case 2:
			System.out.println("Blue jeans Selected");
			break;
		case 3:
			System.out.println("Ton jeans Selected");
			
			break;
		case 4:
			System.out.println("Back to menu ");
			
			break;

		default:
			break;
		}
		
	}
	public void shorts() {
		System.out.println("please select a type");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.night shorts");
		System.out.println("2.boxers");
		System.out.println("3.mens shorts");

		System.out.println("4.Previous");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("night shorts Selected");
			
			break;
		case 2:
			System.out.println("boxers Selected");
			break;
		case 3:
			System.out.println("mens shorts Selected");
			
			break;
		case 4:
			System.out.println("Back to menu ");
			
			break;

		default:
			break;
		}
		
	}

}


