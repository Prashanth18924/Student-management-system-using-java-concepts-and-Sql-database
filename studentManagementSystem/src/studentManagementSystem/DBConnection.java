package studentManagementSystem;

import java.sql.*;

public class DBConnection 
{
	private static final String url="jdbc:mysql://localhost:3306/studentDB";
    private static final String username="root";
    private static final String password="PHW#84#jeor";
    
    public static  Connection getConnection() throws Exception
    {
    	return  DriverManager.getConnection(url,username,password);
    }
    
}
