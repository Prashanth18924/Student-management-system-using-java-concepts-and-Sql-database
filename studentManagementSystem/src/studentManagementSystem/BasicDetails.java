package studentManagementSystem;
import java.sql.*;

public class BasicDetails extends BasicDetailsOperations
{
     private String name;
     private int rollNo;
     private int std;
     private String dob;
     private String bloodGroup;
     private String schoolName;
     
     public BasicDetails()
     {
    	 
     }
     
     public BasicDetails(String na,int rollNo,int std,String dob,String bloodGroup,String schoolName)
     {
    	 this.name=name;
    	 this.rollNo=rollNo;
    	 this.std=std;
    	 this.dob=dob;
    	 this.bloodGroup=bloodGroup;
    	 this.schoolName=schoolName;
     }
     
     public void setName(String n)
     {
    	 name = n;
     }
     
     public void setRollNo(int roll)
     {
    	 rollNo = roll;
     }
     
     public void setStd()
     {
    	 std = 10;
     }
     
     public void setDob(String d)
     {
    	 dob = d;
     }
     
     public void setBloodGroup(String sbg)
     {
    	 bloodGroup = sbg;
     }
     
     public void setschoolName()
     {
    	 schoolName = "ABC high school";
     }
          
     public String getName()
     {
    	 return name;
     }
     
     public int getRollNo()
     {
    	 return rollNo;
     }
     
     public int getStd()
     {
    	 return std;
     }
     
     public String getDob()
     {
    	 return dob;
     }
     
     public String getBloodGroup()
     {
    	 return bloodGroup;
     }
     
     public String getschoolName()
     {
    	  return schoolName;
     }
     
    
}
