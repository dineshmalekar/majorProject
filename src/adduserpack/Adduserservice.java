package adduserpack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Loginpack.DatabaseConnector;


public class Adduserservice {
public boolean check_adduser(userAdd useradds){
    	
    	DatabaseConnector dConnector = new DatabaseConnector();
		Connection con = dConnector.connectDB("db1");
		Statement stmt=null;
		// Login
				try {
					stmt = con.createStatement();
					String query="INSERT INTO user_tb(id,firstname,lastname,email,phone,username,password) VALUES(null,'"+useradds.getFirstname()+"','"+useradds.getLastname()+"','"+useradds.getEmail()+"','"+useradds.getPhone()+"','"+useradds.getUsername()+"','"+useradds.getPassword()+"')";
					stmt.executeUpdate(query);
				}

				catch (Exception e) {
					e.printStackTrace();
				}
				return false;
				
    	
    }

}
