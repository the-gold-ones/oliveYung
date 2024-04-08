package com.olive.query;

public enum Query {
	USER_BY_ID("select * from user where id = ?"),
	JOIN("insert into user (id, pw, name, email, phone, level, gender) values (?,?,?,?,?,?,?)");
	
	private String query;
	
	private Query(String query) {
		this.query = query;
	}
	
	public String getQuery() {
		return query;
	}
}
