package com.olive.query;

public enum Query {
	USER_BY_ID("select * from user where id = ?"),
	ADMIN_BY_ID("select * from admin where id = ?"),
	JOIN("insert into user (id, pw, name, email, phone, gender, address, birthday) values (?,?,?,?,?,?,?,?)"),
	UPDATE_USER("update user set pw=?, name=?, email=?, phone=?, address=? where idx=?");
	
	
	private String query;
	
	private Query(String query) {
		this.query = query;
	}
	
	public String getQuery() {
		return query;
	}
}
