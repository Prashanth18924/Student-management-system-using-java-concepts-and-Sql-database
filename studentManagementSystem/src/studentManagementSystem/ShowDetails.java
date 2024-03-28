package studentManagementSystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowDetails
{
	 public static void showbasicStu(int roll) throws Exception
     {
    	 Connection con;
    	  
         String query = "SELECT * FROM basicDetails where ROLL_NO ="+roll;
         con = DBConnection.getConnection();
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(query);
         
         while(rs.next())
         {
         System.out.println("name          -"+rs.getString(1));
         System.out.println("RollNo        -"+rs.getInt(2));
         System.out.println("Standard      -"+rs.getInt(3));
         System.out.println("Date of birth -"+rs.getString(4));
         System.out.println("BloodGroup    -"+rs.getString(5));
         System.out.println("SchoolName    -"+rs.getString(6));
         System.out.println("********************************");
         }
         con.close();
       
     }
	 
	 public static void showMarksStu(int roll) throws Exception
     {
    
         String query = "SELECT * FROM MarkDetails where ROLL_NO ="+roll;
         Connection con = DBConnection.getConnection();
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(query);
         
         while(rs.next())
         {
         System.out.println("Roll No          - "+rs.getInt(1));
         System.out.println("Tamil            - "+rs.getInt(2));
         System.out.println("English          - "+rs.getInt(3));
         System.out.println("Maths            - "+rs.getInt(4));
         System.out.println("Science          - "+rs.getInt(5));
         System.out.println("Social Science   - "+rs.getInt(6));
         System.out.println("*********************************");
         }
         con.close();
       
     }
	 
	 public static void showAttendanceStu(int roll) throws Exception
     {
         String query = "SELECT * FROM AttendanceDetails where ROLL_NO ="+roll;
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
	 
	 public static void showFeesStu(int roll) throws Exception
	    {
	        String query = "SELECT * FROM feesDetails where ROLL_NO = "+roll;
	        Connection con = DBConnection.getConnection();
	        Statement st = con.createStatement();
	        ResultSet rs = st.executeQuery(query);
	        
	        while(rs.next())
	        {
	        System.out.println("Roll No          - "+rs.getInt(1));
	        System.out.println("Total Fees       - "+rs.getInt(2));
	        System.out.println("Paid Fees        - "+rs.getInt(3));
	        System.out.println("Remaining Fees   - "+rs.getInt(4));
	        System.out.println("*********************************");
	       
	        }
	        con.close();
	      
	    }
}
