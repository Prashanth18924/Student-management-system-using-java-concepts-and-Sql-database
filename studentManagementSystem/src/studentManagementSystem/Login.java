package studentManagementSystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Login extends ShowDetails
{
     private int roll_no;
     private int password;
     
     public Login()
     {
    	 
     }
     
     public Login(int roll,int pass)
     {
    	 roll_no = roll;
    	 password = pass;
     }
     
     public void setRoll(int roll)
     {
    	 roll_no = roll;
     }
     
     public void setPass(int pass)
     {
    	 password = pass;
     }
     
     public int getRoll()
     {
    	 return roll_no;
     }
     
     public int getPass()
     {
    	 return password;
     }
     
     public int loginprocess(int roll,int password) throws Exception
     {
    	 
    	 String query = "select * from login where roll_no = "+roll;
    	 
         
         Connection con = DBConnection.getConnection();
         Statement st = con.createStatement();
         ResultSet rows = st.executeQuery(query);
         
         rows.next();
         
         if(roll == rows.getInt(1) && password == rows.getInt(2))
         {
        	    String name = rows.getString(3);
        	    showbasicStu(roll);
        	    showMarksStu(roll);
        	    showAttendanceStu(roll);
        	    showFeesStu(roll); 
        	    
         }
         else
         {
        	   System.out.println("YOU ENTER WRONG PASSWORD... ");
         }
         
         return 1;
         
     }
     
     public void logout() throws Exception
     {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("**       LOG OUT       **");
    	 System.out.println("Enter the Roll_No      : ");
    	 int roll = sc.nextInt();
    	 System.out.println("Enter the Password     : ");
    	 int pass = sc.nextInt();
    	 logoutProcess(roll,pass);
     }
     
     public void logoutProcess(int roll,int password) throws Exception
     {
    	 
    	 MainMethod mm = new MainMethod();
    	 Scanner sc = new Scanner(System.in);
    	 String query = "select * from login where roll_no = "+roll;
    	 
         
         Connection con = DBConnection.getConnection();
         Statement st = con.createStatement();
         ResultSet rows = st.executeQuery(query);
         
         rows.next();
         
         if(roll == rows.getInt(1) && password == rows.getInt(2))
         {
        	System.out.println("You are Logout successfully... "); 
        	 System.out.println("1 for login / 2 for admin login / 3 for exit ");
    		 int log = sc.nextInt();
    		 if(log==1) {
    			 mm.login();
    		 }
    		 else if(log == 2)
    		 {
    			 mm.adminLogin();
    		 }
    		 else if(log == 3) 
    		 {
    			 System.out.println("Thank You...");
    			 System.exit(0);
    		 }
        	System.out.println();
        	System.out.println();
        	System.out.println("*******************************");
        	mm.login();
         }
         else
         {
        	   System.out.println("YOU ENTER WRONG PASSWORD... ");
         }
         
         
         
     }
     
    
}
