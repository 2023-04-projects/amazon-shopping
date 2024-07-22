package com.khadri.shopping.amazon.cart;

public class Item {
	private String brandName;
	private Double price;
	private Double discount;

	public Item(String brandName, Double price, Double discount) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.discount = discount;
	}

	public String getBrandName() {
		return brandName;
	}

	public Double getPrice() {
		return price;
	}

	public Double getDiscount() {
		return discount;
	}
}
