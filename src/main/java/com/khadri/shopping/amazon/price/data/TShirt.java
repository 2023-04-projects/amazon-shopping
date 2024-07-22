package com.khadri.shopping.amazon.price.data;

public class TShirt {

	private Integer tNo;
	private String brandName;
	private Double price;
	private Double discount;

	public TShirt(Integer tNo, String brandName, Double price, Double discount) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.discount = discount;
		this.tNo = tNo;
	}

	public Integer gettNo() {
		return tNo;
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
