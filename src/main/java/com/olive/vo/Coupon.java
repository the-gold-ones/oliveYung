package com.olive.vo;

public class Coupon {
	private String user_idx;
	private String name;
	int discount;
	
	public String getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(String user_idx) {
		this.user_idx = user_idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Coupon [user_idx=" + user_idx + ", name=" + name + ", discount=" + discount + "]";
	}
}
