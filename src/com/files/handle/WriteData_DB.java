package com.files.handle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteData_DB {

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

		// Create table
		//boolean eStatus = stmt.execute("CREATE TABLE ohrm (tcid VARCHAR(20), username VARCHAR(20), password VARCHAR(20),firstname VARCHAR(20),lastname VARCHAR(20));");
		//add data in table
		stmt.executeUpdate("INSERT INTO OHRM  VALUES ('TC_OHRM_001', 'admin', 'admin','selenium','hq');");
		
		
		connect.close();
	}

}
