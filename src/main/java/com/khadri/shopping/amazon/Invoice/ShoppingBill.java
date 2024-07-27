package com.khadri.shopping.amazon.Invoice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ShoppingBill {
	public static void main(String[] args) {

		String id = null;
		String productName = null;
		int quantity = 0;
		double price = 0.0;
		double totalPrice = 0.0;
		double overAllPrice = 0.0;
		double cgst, sgst, subtotal = 0.0, discount = 0.0;
		char c = '\0';
		System.out.println("\t\t\t\\\t\t\t\t--------------------Invoice-----------------");
		System.out.println("\t\t\t\t\t\t\t\tkhadri Mart");
		System.out.println("\t\t\t\t\t 3/90 Near By S.M.J.L Degree College");
		System.out.println("\t\t\t\t\t" + "    " + "Opposite  judge Bilding");
		System.out.println("GSTIN: 03AWBPP875" + "Contact: (+91) 6301689980");

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println("Date: " + formatter.format(date) + "  " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]
				+ "\t\t\t\t\t\t (+91) 9848022338O");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
		String customername = scan.nextLine();
		List<Belling> product = new ArrayList<Belling>();
		do {
			System.out.println("Enter the product details: ");
			System.out.print("Product ID: ");
			id = scan.nextLine();
			System.out.print("Product Name: ");
			productName = scan.nextLine();
			System.out.print("Quantity: ");
			quantity = scan.nextInt();
			System.out.print("Price (per unit): ");
			price = scan.nextDouble();
			totalPrice = price * quantity;
			overAllPrice = overAllPrice + totalPrice;
			product.add(new Belling(id, productName, quantity, price, totalPrice));
			System.out.print("Want to add more items? (y or n): ");
			c = scan.next().charAt(0);
			scan.nextLine();
		} while (c == 'y' || c == 'Y');
		Belling.displayFormat();
		for (Belling p : product) {
		  p.display();
		}
		System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " + overAllPrice);
		discount = overAllPrice * 2 / 100;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount (Rs.) " + discount);
		subtotal = overAllPrice - discount;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal " + subtotal);
		sgst = overAllPrice * 12 / 100;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) " + sgst);
		cgst = overAllPrice * 12 / 100;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) " + cgst);
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " + (subtotal + cgst + sgst));
		System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
		System.out.println("\t\t\t\t                     Visit Again");
		scan.close();
		}
}

