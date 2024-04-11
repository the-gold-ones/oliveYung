package com.olive.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

import com.olive.query.Query;
import com.olive.vo.User;

public class UserDAO implements MemberRepository{
	MySQLConnector dataSource;
	
	public UserDAO() {
		dataSource = new MySQLConnector();
	}
	
	@Override
	public Optional<User> findById(String id) {
		User user = null;
		Connection conn = dataSource.getConnector();
		try (PreparedStatement pstmt = conn.prepareStatement(Query.USER_BY_ID.getQuery())){
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setIdx(rs.getInt(1));
				user.setId(rs.getString(2));
				user.setPw(rs.getString(3));
				user.setName(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setPhone(rs.getString(6));
				user.setLevel(rs.getString(7));
				user.setGender(rs.getString(8));
				user.setAddress(rs.getString(9));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		dataSource.close();
		return Optional.ofNullable(user);
	}
	
	public void insertUser(User user) {
		Connection conn = dataSource.getConnector();
		try (PreparedStatement pstmt = conn.prepareStatement(Query.JOIN.getQuery())){
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPw());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getPhone());
			pstmt.setString(6, user.getGender());
			pstmt.setString(7, user.getAddress());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		dataSource.close();
	}
	
	public void updateUser(User user) {
		Connection conn = dataSource.getConnector();
		try (PreparedStatement pstmt = conn.prepareStatement(Query.JOIN.getQuery())){
			pstmt.setString(1, user.getPw());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getPhone());
			pstmt.setString(5, user.getAddress());
			pstmt.setInt(6, user.getIdx());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		dataSource.close();
	}
}
