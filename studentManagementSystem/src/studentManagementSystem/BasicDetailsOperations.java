/*
 * Database name = studentDB;
 * Table name = basicDetails;
 */




package studentManagementSystem;
import java.sql.*;

public class BasicDetailsOperations
{
	 public void insertbasic(BasicDetails bd) throws Exception
     {
         String query = "insert into basicDetails values(?,?,?,?,?,?)";
         Connection con = DBConnection.getConnection();
         
         PreparedStatement pst = con.prepareStatement(query);
         pst.setString(1,bd.getName());
         pst.setInt(2, bd.getRollNo());
         pst.setInt(3,bd.getStd());
         pst.setString(4,bd.getDob());
         pst.setString(5,bd.getBloodGroup());
         pst.setString(6, bd.getschoolName());
         int rows = pst.executeUpdate();
         
         if(rows !=0)
        	 System.out.println("DATABASE UPDATED SUCCESSFULLY....");
     }
	 
	 public void showbasic(BasicDetails bd) throws Exception
     {
    	 Connection con;
    	  
         String query = "SELECT * FROM basicDetails";
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
	 
	 public void updateBasic(String identity,String value,int num) throws Exception
     {
         String query = "UPDATE basicDetails set "+identity+" = "+value+" where ROLL_NO = "+num;
         System.out.println(query);
         Connection con = DBConnection.getConnection();
         Statement st = con.createStatement();
         int rows = st.executeUpdate(query);
         
         System.out.println("Database updated successfully");     
         con.close();
       
     }
	 
	 public void deleteBasic(int num) throws Exception
     {
         String query = "delete from basicDetails where ROLL_NO="+num;
         System.out.println(query);
         Connection con = DBConnection.getConnection();
         Statement st = con.createStatement();
         int rows = st.executeUpdate(query);
         
         System.out.println("Data deleted successfully");
         
        
         con.close();
       
     }
	 
	 
}
