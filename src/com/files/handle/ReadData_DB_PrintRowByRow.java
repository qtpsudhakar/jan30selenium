package com.files.handle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData_DB_PrintRowByRow {

	public static void main(String[] args) throws SQLException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {

		// Database URL.
		// "test" Is database name. You can change It as per your database name.
		String sqldb_url = "jdbc:mysql://localhost:3307/company";
		// Use your database username here. It Is "root" for root account.
		String sqldb_uname = "root";
		String sqldb_pass = "admin";

		// To Create database connection.
		Connection connect = DriverManager.getConnection(sqldb_url,
				sqldb_uname, sqldb_pass);

		Statement stmt = connect.createStatement();

		// Printing all records
		String query = "select * from emp";

		// Get the contents of user table from DB
		ResultSet res = stmt.executeQuery(query);

		// Print the result untill all the records are printed res.next()
		// returns true if there is any next record else returns false.
		while (res.next()) {
			System.out.println(res.getString(1));
			System.out.println(res.getString(2));
			System.out.println(res.getString(3));
			System.out.println(res.getString(4));
		}

		connect.close();
	}

}
