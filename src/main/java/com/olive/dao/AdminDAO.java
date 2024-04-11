package com.olive.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

import com.olive.query.Query;
import com.olive.vo.Admin;

public class AdminDAO implements MemberRepository {

	private MySQLConnector dataSource;
	
	public AdminDAO() {
		dataSource = new MySQLConnector();
	}

	@Override
	public Optional<Admin> findById(String id) {
		Admin admin = null;
		Connection conn = dataSource.getConnector();
		try (PreparedStatement pstmt = conn.prepareStatement(Query.ADMIN_BY_ID.getQuery())){
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				admin = new Admin();
				admin.setId(rs.getString(1));
				admin.setPw(rs.getString(2));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		dataSource.close();
		return Optional.ofNullable(admin);
	}
}	
