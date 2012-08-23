package site.service;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import site.classes.User;
import site.config.DatabaseConnector;


public class Loginservice {
	public boolean login(User user){

		DatabaseConnector dConnector = new DatabaseConnector();
		Connection con = dConnector.connectDB("db1");
		boolean isUserExists=false;
		Statement stmt=null;
		// Login
				try {
					stmt = con.createStatement();

					String query = "select * from user_tb where username='"+user.getUsername()+"' and password='"+user.getPassword()+"'";
					System.out.println(query);
					ResultSet rs = stmt.executeQuery(query);
					if(rs.next())
					{
						System.out.println("exists");
						isUserExists= true;
					}
					else
					{
						System.out.println("not exists");
						isUserExists= false;

					}
					 con.close();


				}

				catch (Exception e) {
					e.printStackTrace();
				}
				return isUserExists;
		
	}
    
}
