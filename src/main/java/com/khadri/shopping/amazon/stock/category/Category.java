package com.khadri.shopping.amazon.stock.category;

import java.util.Scanner;

import com.khadri.shopping.amazon.cart.Cart;
import com.khadri.shopping.amazon.cart.Item;
import com.khadri.shopping.amazon.price.data.TShirt;
import com.khadri.shopping.amazon.price.data.TShirtData;

public class Category {

	public void mensWear(boolean isContinueShopping) {
		System.out.println("########## Mens Wears ##########");
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.T-shirts");
		System.out.println("2.Jeans");
		System.out.println("3.Shorts");
		System.out.println("4.Previous");

		System.out.println("Choose one option : ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("########## Item Types ##########");
			TShirtData.getTshirtTypes().stream().forEach(eachType -> {
				System.out.println(eachType.getType());
			});

			System.out.println("Please enter item type");
			String itemType = scanner.next();
			TShirtData.getTshirtTypes().stream().filter(each -> each.getType().equalsIgnoreCase(itemType)).findFirst()
					.get().getListOfTShirts().forEach(eachEntry -> {
						System.out.println(eachEntry.gettNo() + ", Brand Name :" + eachEntry.getBrandName()
								+ ", Price :" + eachEntry.getPrice() + ", Discount" + eachEntry.getDiscount());
					});

			System.out.println("Choose Item Number: ");
			int itemNo = scanner.nextInt();

			TShirt tShirt = TShirtData.getTshirtTypes().stream()
					.filter(eachType -> eachType.getType().equalsIgnoreCase(itemType)).findFirst().get()
					.getListOfTShirts().stream().filter(each -> each.gettNo().equals(itemNo)).findFirst().get();

			Item item = new Item(tShirt.getBrandName(), tShirt.getPrice(), tShirt.getDiscount());
			Cart.cartItems.add(item);

			System.out.println("do you want to continue shopping ? (yes/no)");
			String decision = scanner.next();
			if (decision.equalsIgnoreCase("yes")) {
				isContinueShopping = true;
			} else {
				System.out.println("############### Billing ############");

			}
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

		scanner.close();

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
		scanner.close();

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

		scanner.close();
	}

}
