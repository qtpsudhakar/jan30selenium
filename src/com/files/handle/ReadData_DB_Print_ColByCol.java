package com.files.handle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData_DB_Print_ColByCol {

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

		// get column names
		ResultSetMetaData rsm = res.getMetaData();
		
		// print column count
		System.out.println("number of columns are:" + rsm.getColumnCount());

		// get data from each column
		for (int c = 1; c <= rsm.getColumnCount(); c++) {
			// get column name
			String cName = rsm.getColumnLabel(c);
			System.out.println("***************");
			System.out.println(cName);
			System.out.println("***************");

			// get data from that column of each row
			while (res.next()) {
				System.out.println(res.getString(cName));
			}
			// move to beginning
			res.beforeFirst();
		}

		connect.close();
	}

}
