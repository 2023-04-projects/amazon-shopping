package com.khadri.shopping.amazon.stock.category;

import java.util.List;
import java.util.Scanner;

import com.khadri.shopping.amazon.cart.Cart;
import com.khadri.shopping.amazon.cart.Item;
import com.khadri.shopping.amazon.price.data.LongFrock;
import com.khadri.shopping.amazon.price.data.LongFrockData;
import com.khadri.shopping.amazon.price.data.LongFrockType;
import com.khadri.shopping.amazon.price.data.NightWear;
import com.khadri.shopping.amazon.price.data.NightWearData;
import com.khadri.shopping.amazon.price.data.NightWearType;
import com.khadri.shopping.amazon.price.data.Shorts;
import com.khadri.shopping.amazon.price.data.ShortsData;
import com.khadri.shopping.amazon.price.data.ShortsType;
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
			System.out.println("Shorts- Selected");

			break;
			
		case 3:
			
			System.out.println("########## Item Types ##########");
			List<ShortsType> shortsType = ShortsData.getShortsType();

			shortsType.stream().forEach(eachType -> {
				System.out.println(eachType.getType());
			});

			System.out.println("Please enter item type");
			String itemType2 = scanner.next();
			shortsType.stream().filter(each -> each.getType().equalsIgnoreCase(itemType2)).findFirst()
					.get().getListOfShorts().forEach(eachEntry -> {
						System.out.println(eachEntry.getSNo() + ", Brand Name :" + eachEntry.getBrandName()
								+ ", Price :" + eachEntry.getPrice() + ", Discount" + eachEntry.getDiscount());
					});

			System.out.println("Choose Item Number: ");
			int itemNo2 = scanner.nextInt();

			Shorts shorts = ShortsData.getShortsType().stream()					
					.filter(eachType -> eachType.getType().equalsIgnoreCase(itemType2)).findFirst().get()
					.getListOfShorts().stream().filter(each -> each.getSNo().equals(itemNo2)).findFirst().get();

			Item item2 = new Item(shorts.getBrandName(), shorts.getPrice(), shorts.getDiscount());
			Cart.cartItems.add(item2);

			System.out.println("do you want to continue shopping ? (yes/no)");
			String decision2 = scanner.next();
			if (decision2.equalsIgnoreCase("yes")) {
				isContinueShopping = true;
			} else {
				System.out.println("############### Billing ############");

			}

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
		System.out.println("you entered into kids-wear");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Select one option");
		System.out.println("1.Shirts");
		System.out.println("2.NightWear");

		System.out.println("4.Previous");
		List<NightWearType> nightWearType = NightWearData.getNightWearType();

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Shirts Selected");

			break;
		case 2:
			System.out.println("########## Item Types ##########");
			nightWearType.stream().forEach(eachType -> {
				System.out.println(eachType.getType());
			});

			System.out.println("Please enter item type");
			String itemType2 = scanner.next();
			nightWearType.stream().filter(each -> each.getType().equalsIgnoreCase(itemType2)).findFirst()
					.get().getListOfNightWear().forEach(eachEntry -> {
						System.out.println(eachEntry.getNo() + ", Brand Name :" + eachEntry.getBrandName()
								+ ", Price :" + eachEntry.getPrice() + ", Discount" + eachEntry.getDiscount());
					});

			System.out.println("Choose Item Number: ");
			int itemNo2 = scanner.nextInt();

			NightWear nightWear = NightWearData.getNightWearType().stream()					
					.filter(eachType -> eachType.getType().equalsIgnoreCase(itemType2)).findFirst().get()
					.getListOfNightWear().stream().filter(each -> each.getNo().equals(itemNo2)).findFirst().get();

			Item item2 = new Item(nightWear.getBrandName(), nightWear.getPrice(), nightWear.getDiscount());
			Cart.cartItems.add(item2);

			System.out.println("do you want to continue shopping ? (yes/no)");
			String decisions1 = scanner.next();
			if (decisions1.equalsIgnoreCase("yes")) {
				boolean isContinueShopping = true;
			} else {
				System.out.println("############### Billing ############");

			}
			break;
		
		case 3:
			System.out.println("Back to menu ");

			break;

		default:
			break;
		}
		scanner.close();

	}

	public void womensWear() {
		System.out.println("You entered into womenswear");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Select one option");
		System.out.println("1.Sarry");
		System.out.println("2.LongFrocks");

		System.out.println("3.Previous");

		int choice = scanner.nextInt();
		switch (choice) {
		
		case 1:
			System.out.println("Sarry -Selected");
			break;
		case 2:
			System.out.println("########## Item Types ##########");
			List<LongFrockType> longFrockType = LongFrockData.getLongFrockType();

			longFrockType.stream().forEach(eachType -> {
				System.out.println(eachType.getType());
			});

			System.out.println("Please enter item type");
			String itemType2 = scanner.next();
			longFrockType.stream().filter(each -> each.getType().equalsIgnoreCase(itemType2)).findFirst()
					.get().getListOfLongFrock().forEach(eachEntry -> {
						System.out.println(eachEntry.getNo() + ", Brand Name :" + eachEntry.getBrandName()
								+ ", Price :" + eachEntry.getPrice() + ", Discount" + eachEntry.getDiscount());
					});

			System.out.println("Choose Item Number: ");
			int itemNo2 = scanner.nextInt();

			LongFrock longFrock = LongFrockData.getLongFrockType().stream()					
					.filter(eachType -> eachType.getType().equalsIgnoreCase(itemType2)).findFirst().get()
					.getListOfLongFrock().stream().filter(each -> each.getNo().equals(itemNo2)).findFirst().get();

			Item item2 = new Item(longFrock.getBrandName(), longFrock.getPrice(), longFrock.getDiscount());
			Cart.cartItems.add(item2);

			System.out.println("do you want to continue shopping ? (yes/no)");
			String decisions1 = scanner.next();
			if (decisions1.equalsIgnoreCase("yes")) {
				boolean isContinueShopping = true;
			} else {
				System.out.println("############### Billing ############");

			}

			break;
		case 3:
			System.out.println("Back to menu ");

			break;

		default:
			break;
		}

		scanner.close();
	}

}
