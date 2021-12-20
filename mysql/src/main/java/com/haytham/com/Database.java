package com.haytham.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static final String URL = "jdbc:mysql://localhost:3306/people";
	private Connection conn = null;
	private static Database db = new Database();
	

	public static Database instance() {
		return db;
	}
	
	public void connect() throws SQLException {
		conn = DriverManager.getConnection(URL, "root", "1LoveMySql");
		System.out.println("Connecting to DB with " + conn);
		
	}
	
	public void disconnect() throws SQLException {
		conn.close();
		
	}
	
	private Database() {
		
	}
}
