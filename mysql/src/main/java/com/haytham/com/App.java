package com.haytham.com;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		var db = Database.instance();
		
		try {
			db.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to connect to DB");
		}
		
		System.out.println("Connected");
		
		try {
			db.disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to disconnect from DB");
		}
	}
}
