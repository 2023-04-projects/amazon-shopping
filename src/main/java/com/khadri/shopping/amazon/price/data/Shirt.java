package com.khadri.shopping.amazon.price.data;

public class Shirt {
	private Integer No;
	private String brandName;
	private Double price;
	private Double discount;
	public Shirt(Integer No, String brandName, Double price, Double discount) {
		super();
		this.No = No;
		this.brandName = brandName;
		this.price = price;
		this.discount = discount;
	}
	public Integer getNo() {
		return No;
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
