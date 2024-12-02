package com.solution.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.solution.util.JDBCUtil;

public class ReadData {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet resultSet = null;
				
		try {
			connection = JDBCUtil.getConnection();
			stmt = connection.createStatement();
			String sqlReadQuery ="SELECT * FROM Employee";
			
			resultSet = stmt.executeQuery(sqlReadQuery);
					
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3)+"\t"+resultSet.getString(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
        }
		finally {
			try {
               JDBCUtil.cleanUp(connection, stmt, resultSet);
            } catch (Exception e) {
                e.printStackTrace();
            }
			
		}
		
	}
}
