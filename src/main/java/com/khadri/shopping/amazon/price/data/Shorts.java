package com.khadri.shopping.amazon.price.data;

public class Shorts {
	private Integer SNo;
	private String brandName;
	private Double price;
	private Double discount;
	
	public Shorts(Integer sNo, String brandName, Double price, Double discount) {
		super();
		SNo = sNo;
		this.brandName = brandName;
		this.price = price;
		this.discount = discount;
	}
	
	public Integer getSNo() {
		return SNo;
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
