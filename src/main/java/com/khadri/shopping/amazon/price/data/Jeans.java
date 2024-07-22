package com.khadri.shopping.amazon.price.data;

public class Jeans {
	private Integer tNo;
	private String brandName;
	private Double price;
	private Double discount;
	
	public Jeans(Integer tNo, String brandName, Double price, Double discount) {
		super();
		this.tNo = tNo;
		this.brandName = brandName;
		this.price = price;
		this.discount = discount;
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
