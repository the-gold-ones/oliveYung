package com.ljy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/simple_shop";
	private final String DB_ID = "root";
	private final String DB_PWD = "1234";
	
	

}
