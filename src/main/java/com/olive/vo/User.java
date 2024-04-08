package com.olive.vo;
//idx	id	pw	name	email	phone	level	gender
public class User {
	private int idx;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String phone;
	private String level;
	private String gender;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [idx=" + idx + ", id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", phone="
				+ phone + ", level=" + level + ", gender=" + gender + "]";
	}

	
}
