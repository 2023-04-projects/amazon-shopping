package com.khadri.shopping.amazon.price.data;

public class Sarry {
	private Integer No;
	private String brandName;
	private Double price;
	private Double discount;
	public Sarry(Integer no, String brandName, Double price, Double discount) {
		super();
		No = no;
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
