package studentManagementSystem;

public class AttendanceDetails extends AttendanceDetailsOperation
{
      private int roll;
      private String Month;
      private int total;
      private int leave;
      private int present;
      
      public AttendanceDetails()
      {
    	  
      }
      
      public AttendanceDetails(int roll,String Month,int total,int leave,int present)
      {
    	  this.roll = roll;
    	  this.Month = Month;
    	  this.total = total;
    	  this.leave = leave;
    	  this.present = present;
      }
      
      public void setRollNo(int roll)
      {
     	 this.roll = roll;
      }
            
      public void setMonth(String m)
      {
     	  Month = m;
      }
      
      public void setTotal(int ttl)
      {
     	 total = ttl;
      }
      
      public void setleave(int leave)
      {
     	 this.leave = leave;
      }
      
      public void setpresent()
      {
     	 this.present = total-leave;
      }
      
      public int getRollNo()
      {
     	 return roll;
      }
      
      public String getMonth()
      {
    	  return Month;
      }
      
      public int getTotal()
      {
     	 return total;
      }
      
      public int getLeave()
      {
     	 return leave;
      }
      
      public int getPresent()
      {
     	 return present;
      }      
      
}
