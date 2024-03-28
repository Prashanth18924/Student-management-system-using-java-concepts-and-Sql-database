/*
 * Database name - studentDB;
 * Table name    - MarkDetails;
 */




package studentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class MarkDetailsOperation 
{
	
	 public void insertMarks(MarkDetails md) throws Exception
     {
    	 
         String query = "insert into MarkDetails values(?,?,?,?,?,?)";
         Connection con = DBConnection.getConnection();
         
         PreparedStatement pst = con.prepareStatement(query);
         pst.setInt(1,md.getrollNo1());
         pst.setInt(2, md.getTamil());
         pst.setInt(3,md.getEnglish());
         pst.setInt(4,md.getMaths());
         pst.setInt(5,md.getScience());
         pst.setInt(6, md.getSocialScience());
         int rows = pst.executeUpdate();
         
         if(rows !=0)
        	 System.out.println("DATABASE UPDATED SUCCESSFULLY....");
     }
	 
	 public void showMarks(MarkDetails md) throws Exception
     {
    
         String query = "SELECT * FROM MarkDetails";
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
	 
	 public void updateMarks(String identity,int value,int num) throws Exception
     {
         String query = "UPDATE markDetails set "+identity+" = "+value+" where ROLL_NO = "+num;
         System.out.println(query);
         Connection con = DBConnection.getConnection();
         Statement st = con.createStatement();
         int rows = st.executeUpdate(query);
         
         System.out.println("Database updated successfully");
              
         con.close();
       
     }
	 
	 public void deleteMarks(int num) throws Exception
     {
         String query = "delete from markDetails where ROLL_NO="+num;
         
         Connection con = DBConnection.getConnection();
         Statement st = con.createStatement();
         int rows = st.executeUpdate(query);
         
         System.out.println("Details deleted successfully");
         
        
         con.close();
       
     }
	 public void takeGrade(int num) throws Exception
	 {
		 String query = "select* from markDetails where ROLL_NO="+num;
        
         Connection con = DBConnection.getConnection();
         Statement st = con.createStatement();
         ResultSet rows = st.executeQuery(query);
         int val=0;
         while(rows.next())
         {
        	int tamil = rows.getInt(1);
        	
        	System.out.println("Tamil Grade          - "+Grade(tamil));
        	int english = rows.getInt(2);
        	System.out.println("English Grade        - "+Grade(english));
        	int maths = rows.getInt(3);
        	System.out.println("Maths Grade          - "+Grade(maths));
        	int science = rows.getInt(4);
        	System.out.println("Science Grade        - "+Grade(science));
         	int social_science = rows.getInt(5);
         	System.out.println("Social Science Grade - "+Grade(social_science));   
         	System.out.println("**********************************");
         }
         
         con.close(); 
         
       
	 }
	 public static String Grade(int n)
	 {
		 if(n>=90)
		 {
			 return "O GRADE";
		 }
		 else if(89>=n || 80<=n)
		 {
			 return "A+ GRADE";
		 }
		 else if(79>=n && 70<=n)
		 {
			 return "A GRADE";
		 }
		 else if(69>=n && 60<=n)
		 {
			 return "B+ GRADE";
		 }
		 else if(59>=n && 50<=n)
		 {
			 return "B GRADE";
		 }
		 else if(50>=n)
		 {
			 return "U GRADE";
		 }
		 
		
		 
		 return " ";
		 
		 
		 
		 
	 }
	 
	 
}
