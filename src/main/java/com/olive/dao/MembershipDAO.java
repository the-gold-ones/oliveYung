package com.olive.dao;

import java.util.List;

import com.olive.vo.Coupon;

public class MembershipDAO {
	private MySQLConnector dataSource;
	
	public MembershipDAO() {
		dataSource = new MySQLConnector();
	}
	
	public List<Coupon> findAllById(String id) {
		return null;
	}
}
