package studentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class feesDetailsOperation
{
	public void insertFees(feesDetails fd) throws Exception
    {
   	    Connection con;
   
        String query = "insert into feesDetails values(?,?,?,?)";
        con = DBConnection.getConnection();
        
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1,fd.getRollNo());
        pst.setInt(2,fd.getTotalFees());
     
        pst.setInt(3,fd.getpaid());
        pst.setInt(4,fd.getremainingFees());
        int rows = pst.executeUpdate();
        if(rows !=0)
       	 System.out.println("DATABASE UPDATED SUCCESSFULLY....");
    }
	 
	public void showFees(feesDetails fd) throws Exception
    {
        String query = "SELECT * FROM feesDetails";
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
	 
	 public void updateFees(String identity,int value,int num) throws Exception
    {    	    
        String query = "UPDATE feesDetails set "+identity+" = "+value+" where ROLL_NO = "+num;
        System.out.println(query);
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        
        System.out.println("Database updated successfully");
        
       
        con.close();
      
    }
	 
	 public void deleteFees(int num) throws Exception
	 {		 
   
        String query = "delete from feesDetails where ROLL_NO="+num;
        System.out.println(query);
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        
        System.out.println("Data deleted successfully");
        
       
        con.close();
      
    }
	 
}
