package com.olive.vo;

import java.sql.Date;

public class Payment {
	private int user_idx;
	private int item_idx;
	private Date moment;
	private int price;
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public int getItem_idx() {
		return item_idx;
	}
	public void setItem_idx(int item_idx) {
		this.item_idx = item_idx;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Payment [user_idx=" + user_idx + ", item_idx=" + item_idx + ", moment=" + moment + ", price=" + price
				+ "]";
	}
	
	
}
