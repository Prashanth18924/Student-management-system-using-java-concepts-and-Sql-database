package studentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AttendanceDetailsOperation
{	
		 public void insertAttendance(AttendanceDetails ad) throws Exception
	     {
	         String query = "insert into AttendanceDetails values(?,?,?,?,?)";
	         Connection con = DBConnection.getConnection();
	         
	         PreparedStatement pst = con.prepareStatement(query);
	         pst.setInt(1, ad.getRollNo());
	         pst.setString(2,ad.getMonth());
	         pst.setDouble(3, ad.getTotal());
	         pst.setDouble(4,ad.getLeave());
	         pst.setDouble(5,ad.getPresent());
	         
	         int rows = pst.executeUpdate();
	         
	         if(rows !=0)
	        	 System.out.println("DATABASE UPDATED SUCCESSFULLY....");
	     }
		 
		 public void showAttendance(AttendanceDetails ad) throws Exception
	     {
	         String query = "SELECT * FROM AttendanceDetails";
	         Connection con = DBConnection.getConnection();
	         Statement st = con.createStatement();
	         ResultSet rs = st.executeQuery(query);
	         
	         while(rs.next())
	         {
	         System.out.println("RollNo        - "+rs.getInt(1));
	         System.out.println("Month         - "+rs.getString(2));
	         System.out.println("TotalDays     - "+rs.getInt(3));
	         System.out.println("LeaveDays     - "+rs.getInt(4));
	         System.out.println("PresentDays   - "+rs.getInt(5));  
	         System.out.println("******************************");
	         }
	         con.close();
	       
	     }
		 
		 public void updateAttendance(String identity,String value,int num) throws Exception
	     {
	         String query = "UPDATE attendanceDetails set "+identity+" = '"+value+"' where ROLL_NO = "+num;
	         System.out.println(query);
	         Connection con = DBConnection.getConnection();
	         Statement st = con.createStatement();
	         int rows = st.executeUpdate(query);
	         
	         System.out.println("Database updated successfully");
	         
	        
	         con.close();
	       
	     }
		 
		 public void deleteAttendance(int num) throws Exception
	     {    	 
	         String query = "delete from AttendanceDetails where ROLL_NO="+num;
	         System.out.println(query);
	         Connection con = DBConnection.getConnection();
	         Statement st = con.createStatement();
	         int rows = st.executeUpdate(query);
	         
	         System.out.println("Details deleted successfully");
	         
	        
	         con.close();
	       
	     }
		 
		public void percentage(int num) throws Exception
		{
			 String query = "SELECT * FROM AttendanceDetails where ROLL_NO="+num;
	         Connection con = DBConnection.getConnection();
	         Statement st = con.createStatement();
	         ResultSet rs = st.executeQuery(query);
	         
	         rs.next();
	    
	        
	         double total = rs.getInt(3);
	         System.out.println("TotalDays     - "+total);
	         double present = rs.getInt(5);
	         System.out.println("PresentDays   - "+present);  
	        
	         double per = calculatePercentage(total,present);
	         
	         System.out.println("Percentage    - "+per);
	         con.close();
	         
	         
		}
		
		
		public static double calculatePercentage(double total,double present)
		{
			 double percentage = (present/total)*100;
	         return percentage;
		}
		  
	
	
	}


