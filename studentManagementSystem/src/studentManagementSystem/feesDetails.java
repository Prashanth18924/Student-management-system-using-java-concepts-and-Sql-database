package studentManagementSystem;

public class feesDetails extends feesDetailsOperation
{
	 int rollNo;
     int TotalFees;
     int paidfees;
     int remainingfees;
     
     feesDetails()
     {
    	 
     }
     
     feesDetails(int roll,int totalfees,int paidfees,int remainingfees)
     {
    	 rollNo = roll;
    	 TotalFees = totalfees;  
    	 this.paidfees = paidfees;
    	 this.remainingfees=remainingfees; 	 
     }
     
     public void setRollNo(int roll_No)
     {
    	 rollNo = roll_No;
     }
          
     public void setTotalFees(int totalfees)
     {
    	 TotalFees = totalfees;
     }
      
     public void setpaid(int Paidfees)
     {
    	 paidfees = Paidfees;
     }
     
     public void setremainingFees(int Remainingfees)
     {
    	 remainingfees=Remainingfees; 	 
     }
     
     public int getRollNo()
     {
    	 return rollNo;
     }
     
     public int getTotalFees()
     {
    	 return TotalFees;
     }
   
     public int getpaid()
     {
    	 return paidfees;
     }
     
     public int getremainingFees()
     {
    	 return remainingfees;
     }
     }
     
	 
     
	 
	 

