package studentManagementSystem;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.*;
import java.util.Date;

public class MainMethod {
	Scanner sc = new Scanner(System.in);
	Login log = new Login();
	BasicDetails bd = new BasicDetails();
	MarkDetails md = new MarkDetails();
	AttendanceDetails ad = new AttendanceDetails();
	feesDetails fd = new feesDetails();
   
	
	public static void main(String[] args) throws Exception
	{
		MainMethod mm = new MainMethod();
		
		System.out.println("***********************************");
		System.out.println("********STUDENTS DATABASE**********");
		System.out.println("***********************************");
		System.out.println();
		
		mm.login();

	}
	
    public void login() throws Exception
    {
		
	    System.out.println("*************LOGIN*****************");
		System.out.println();
		
		System.out.println("1.STUDENT");
		System.out.println("2.ADMIN");
		
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		
		if(choice==1)
		{
			studentLogin();
		}
		else if(choice==2)
		{
			adminLogin();
		}
		else
		{
			System.out.println("Please enter 1 or 2");
			login();
		}
		
		
	}
	
	public  void studentLogin() throws Exception
	     { 
		
		int value = 0;
		System.out.println("ENTER THE ROLL_NO : ");
		int roll = sc.nextInt();
		System.out.println("ENTER THE PASSWORD : ");
		int pass = sc.nextInt();
		
		value = log.loginprocess(roll, pass);
		if(value==0)
		{
			studentLogin();
		}
		else
		{
			System.out.println("If you want continue...\n1 for Go to Student Login \n2 for Go exit ");
			int ans = sc.nextInt();
			switch(ans)
			{
			case 1:
				studentLogin();
				break;
			case 2:
			    log.logout();
			    break;
			default:
				System.out.println("You enter wrong number...");
				studentLogin();
				break;
			}
			
			
	}
		
	
		
}
	
    public void adminLogin() throws Exception
	{
		System.out.println("ENTER THE USER_NAME(in small letters) : ");
		String user = sc.next();
		System.out.println("ENTER THE PASSWORD : ");
		int pass = sc.nextInt();
		
		if(user.equals("admin") && pass == 123)
		{
			adminOperations();
		}
		else
		{
			System.out.println("You enter wrong informations...\n 1 for go to admin login \n 2 for go to login \n 3 for go to exit");
			int ad = sc.nextInt();
			if(ad==1)
			{
				adminLogin();
			}
			else if(ad==2)
			{
				login();
			}
			else if(ad==3)
			{
				exit();
			}
			else
			{
				System.out.println("You enter wrong number...");
			}
		}
		
		
	}
	
	public void adminOperations() throws Exception
	{
		System.out.println("************************************");
		System.out.println("************************************");
		System.out.println("**   1 . SHOW DETAILS             **");
		System.out.println("**   2 . INSERT DETAILS           **");
		System.out.println("**   3 . UPDATE DETAILS           **");
		System.out.println("**   4 . DELETE DETAILS           **");
		System.out.println("**   5 . EXTRA FEATURES           **");
		System.out.println("**   6 . EXIT                     **");
		System.out.println("************************************");
		System.out.println("************************************");
		
		System.out.println();
		System.out.println();
		
		System.out.println("ENTER THE CHOICE : ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			showDetails();
			break;
		case 2:
			insertDetails();
			break;
		case 3:
			updateDetails();
			break;
		case 4:
			deleteDetails();
			break;
		case 5:
			extraOperation();
			break;
		case 6:
			exit();
			break;
		default:
			System.out.println("Enter the wrong choice");
			adminOperations();
		}
	}
    
	public void showDetails() throws Exception
	{
		System.out.println("************************************");
		System.out.println("**   1 . BASIC DETAILS            **");
		System.out.println("**   2 . MARK DETAILS             **");
		System.out.println("**   3 . ATTENDANCE DETAILS       **");
		System.out.println("**   4 . FEES DETAILS             **");
		System.out.println("**   5 . ADMIN OPERATIONS         **");
		System.out.println("**   6 . ADMIN LOGOUT             **");
		System.out.println("************************************");
		
	    System.out.println("ENTER THE CHOICE : ");
	    int ch = sc.nextInt();
	    
	    
	   switch(ch)
	    {
	    case 1:
	    {
	        showbasic();
			break;
	    }
	    
	    case 2:
	    {
	    	showMarks();
			break;
	    }
	    case 3:
	    {
	    	showAttendance();
	    	break;
	    }
	    case 4:
	    {
	    	showFees();
	    	break;
	    }
	    case 5:
	    {
	    	adminOperations();
	    	break;
	    }
	    case 6:
	    {
	    	adminLogout();
	    	break;
	    }
	    default:
	    {
	    	System.out.println("You enter wrong number");
	    	showDetails();
	    	break;
	    }
	    }	
	  
	    
	    }
	
	
        public void showbasic() throws Exception
        {

	    	bd.showbasic(bd);
	    	System.out.println("IF YOU WANT TO CONTINUE :\n 1 for again show details / 2 for admin operation");
	        int innerloop = sc.nextInt();
	        if(innerloop == 1)
	        {
	        	showDetails();
	        }
	        else 
	        {
	        	adminOperations();
	        }
		
        }
		
        public void showMarks() throws Exception
        {

	    	md.showMarks(md);
	    	System.out.println("IF YOU WANT TO CONTINUE :\n 1 for again show details / 2 for admin operation");
	        int innerloop = sc.nextInt();
	        if(innerloop == 1)
	        {
	        	showDetails();
	        }
	        else 
	        {
	        	adminOperations();
	        }
		
        }
		
        public void showAttendance() throws Exception
        {

	    	ad.showAttendance(ad);
	    	System.out.println("IF YOU WANT TO CONTINUE :\n 1 for again show details / 2 for admin operation");
	        int innerloop = sc.nextInt();
	        if(innerloop == 1)
	        {
	        	showDetails();
	        }
	        else 
	        {
	        	adminOperations();
	        }
		
        }
		
        public void showFees() throws Exception
        {

	    	fd.showFees(fd);
	    	System.out.println("IF YOU WANT TO CONTINUE :\n 1 for again show details / 2 for admin operation");
	        int innerloop = sc.nextInt();
	        if(innerloop == 1)
	        {
	        	showDetails();
	        }
	        else 
	        {
	        	adminOperations();
	        }
		
        }
		
    public void insertDetails() throws Exception
    	{
    		System.out.println("INSERT THE VALUES....CHOOSE THE DATABASE...");
			System.out.println();
			System.out.println("**   1 . INSERT VALUES IN BASIC DETAILS       **");
			System.out.println("**   2 . INSERT VALUES IN MARK DETAILS        **");
			System.out.println("**   3 . INSERT VALUES IN ATTENDANCE DETAILS  **");
			System.out.println("**   4 . INSERT VALUES IN FEES DETAILS        **");
			System.out.println("**   5 . ADMIN OPERATIOMS                     **");
			System.out.println("**   6 . ADMIN LOGOUT                         **");
			System.out.println("ENTER THE CHOICE");
			int ch = sc.nextInt();
			
    		
    	    
    	    
    	   switch(ch)
    	    {
    	    case 1:
    	    {
    	        insertBasic();
    			break;
    	    }
    	    
    	    case 2:
    	    {
    	    	insertMarks();
    			break;
    	    }
    	    case 3:
    	    {
    	    	insertAttendance();
    	    	break;
    	    }
    	    case 4:
    	    {
    	    	insertFees();
    	    	break;
    	    }
    	    case 5:
    	    {
    	    	adminOperations();
    	    	break;
    	    }
    	    case 6:
    	    {
    	    	adminLogout();
    	    	break;
    	    }
    	    default:
    	    {
    	    	System.out.println("You enter wrong number");
    	    	insertDetails();
    	    	break;
    	    }
    	    }	
    	  
    	    
    	    }
    	
    	
            public void insertBasic() throws Exception
            {

            	
				System.out.println("Enter the Name : ");
				String name = sc.next();
				bd.setName(name);
				
				
				System.out.println("Enter the Roll No : ");
				int rollNo = sc.nextInt();
				bd.setRollNo(rollNo);
			
				
								
				
				int dateVal=0;
                do {
		        System.out.println("Enter the Date of Birth day (dd/MM/yyyy): ");
		    	String dateStr = sc.next();	    	
		   	    try {
	    		 SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy");
	        	 Date date = formatter.parse(dateStr);
	        	 String strDate = formatter.format(date);
	        	 dateVal=0;
	        	 bd.setDob(strDate);   	 
	    	    }
	    	    catch(Exception e)
	    	    {
	    		System.out.println("Enter date in given format...");
	    		dateVal=1;
	    	    }}while(dateVal==1);
		    	
                int value=0;
                do {
                System.out.println("Enter the blood group(Ex... O+,AB-,A+)");
           	    String str = sc.next();
           	 
           	    if(str.equals("O+")||str.equals("A+")||str.equals("B+")||str.equals("AB+")||str.equals("O-")||str.equals("A-")||str.equals("B-")||str.equals("AB-"))
           	    {
           		 value=0;
           		 bd.setBloodGroup(str);
           	    }
           	    else
           	    {
           		 value=1;
           	    }
           	    }while(value==1);
                
                
				bd.setStd();
				bd.setschoolName();
				
				System.out.println("Enter the password for student...");
				int pass = sc.nextInt();
				
				 String query = "insert into login values(?,?,?)";
		         Connection con = DBConnection.getConnection();
		         
		         PreparedStatement pst = con.prepareStatement(query);
		         pst.setInt(1,rollNo);
		         pst.setInt(2, pass);
		         pst.setString(3,name);
		       
		         int rows = pst.executeUpdate();
		         
		         
				
				
				bd.insertbasic(bd);
				
				System.out.println("IF YOU WANT TO CONTINUE : ");
    	    	System.out.println("1 for insert another student basic details");
    	    	System.out.println("2 for go to collection of various databases for insert operation");
    	    	System.out.println("3 for go to admin operation");
    	    	System.out.println("4 for go to admin logout");
    	    	
    	        int innerloop = sc.nextInt();
    	        if(innerloop == 1)
    	        {
    	        	insertBasic();
    	        }
    	        else if(innerloop == 2)
    	        {
    	        	insertDetails();
    	        }
    	        else if(innerloop == 3)
    	        {
    	        	adminOperations();
    	        }
    	        else if(innerloop == 4)
    	        {
    	        	exit();
    	        }
    		
    		
            }
    		
            public void insertMarks() throws Exception
            {
            	System.out.println("Enter the Roll No : ");
				int rollNo1 = sc.nextInt();
				md.setrollNo1(rollNo1);
				
				System.out.println("Enter the Mark for Tamil : ");
				int t = sc.nextInt();
				md.setTamil(t);
				
				System.out.println("Enter the Mark for English : ");
				int e = sc.nextInt();
				md.setEnglish(e);
				
				System.out.println("Enter the Mark for Maths : ");
				int m = sc.nextInt();
				md.setMaths(m);
				
				System.out.println("Enter the Mark for Science : ");
				int s = sc.nextInt();
				md.setScience(s);
				
				System.out.println("Enter the Mark for Social Science : ");
				int ss = sc.nextInt();
				md.setSocialScience(ss);			
				
				md.insertMarks(md);
    	    	
            	
            	
    	    	System.out.println("IF YOU WANT TO CONTINUE : ");
    	    	System.out.println("1 for insert another student mark details");
    	    	System.out.println("2 for go to collection of various databases for insert operation");
    	    	System.out.println("3 for go to admin operation");
    	    	System.out.println("4 for go to admin logout");

    	    	
    	        int innerloop = sc.nextInt();
    	        if(innerloop == 1)
    	        {
    	        	insertMarks();
    	        }
    	        else if(innerloop == 2)
    	        {
    	        	insertDetails();
    	        }
    	        else if(innerloop == 3)
    	        {
    	        	adminOperations();
    	        }
    	        else if(innerloop == 4)
    	        {
    	        	exit();
    	        }
    		
            }
    		
            public void insertAttendance() throws Exception
            {
            	System.out.println("Enter the Roll no : ");
				int rollNo = sc.nextInt();
				ad.setRollNo(rollNo);
				
				int value=0;
				
				do {
				 System.out.println("Enter the full month name in small letters Ex... march,may,december");   	 
		    	 String str = sc.next();
		    	 
		    	 if(str.equals("january")||str.equals("february")||str.equals("march")||str.equals("april")||str.equals("may")||str.equals("june")||str.equals("july")||str.equals("august")||str.equals("september")||str.equals("october")||str.equals("november")||str.equals("december"))
		         {
		    		 value=0;
		    		 ad.setMonth(str);
		    	 }
		    	 else
		    	 {
		    		 value=1;
		    	 }}while(value==1);
				
				
				System.out.println("Total Days : ");
				int total = sc.nextInt();
				ad.setTotal(total);
				
				System.out.println("Leave Days : ");
				int leave = sc.nextInt();
				ad.setleave(leave);
				
				ad.setpresent();
				
				ad.insertAttendance(ad); 
    	    	
				System.out.println("IF YOU WANT TO CONTINUE : ");
    	    	System.out.println("1 for insert another student attendance details");
    	    	System.out.println("2 for go to collection of various databases for insert operation");
    	    	System.out.println("3 for go to admin operation");
    	    	System.out.println("4 for go to admin logout");

    	    	
    	        int innerloop = sc.nextInt();
    	        if(innerloop == 1)
    	        {
    	        	insertAttendance();
    	        }
    	        else if(innerloop == 2)
    	        {
    	        	insertDetails();
    	        }
    	        else if(innerloop == 3)
    	        {
    	        	adminOperations();
    	        }
    	        else if(innerloop == 4)
    	        {
    	        	exit();
    	        }
    	 
    		
            }
    		
            public void insertFees() throws Exception
            {

            	 System.out.println("Enter the Roll No : ");
				 int rollNo1 = sc.nextInt();
				 fd.setRollNo(rollNo1);
				
				 System.out.println("Enter the Total Fees :");
				 int total = sc.nextInt();
				 fd.setTotalFees(total);
				
				 
				 System.out.println("Enter the Paid : ");
				 int paidFees = sc.nextInt();
				 fd.setpaid(paidFees);
				 
				 int Remain = total -paidFees;
				 fd.setremainingFees(Remain);
				 
				 fd.insertFees(fd);
				 
				    System.out.println("IF YOU WANT TO CONTINUE : ");
	    	    	System.out.println("1 for insert another student fees details");
	    	    	System.out.println("2 for go to collection of various databases for insert operation");
	    	    	System.out.println("3 for go to admin operation");
	    	    	System.out.println("4 for go to admin logout");

	    	    	
	    	        int innerloop = sc.nextInt();
	    	        if(innerloop == 1)
	    	        {
	    	        	insertFees();
	    	        }
	    	        else if(innerloop == 2)
	    	        {
	    	        	insertDetails();
	    	        }
	    	        else if(innerloop == 3)
	    	        {
	    	        	adminOperations();
	    	        }
	    	        else if(innerloop == 4)
	    	        {
	    	        	exit();
	    	        }
    		
            }
            
    public void updateDetails() throws Exception
            {
            	System.out.println("UPDATE THE VALUES....CHOOSE THE DATABASE...");
				System.out.println();
				System.out.println("**   1 . UPDATE VALUES IN BASIC DETAILS       **");
				System.out.println("**   2 . UPDATE VALUES IN MARK DETAILS        **");
				System.out.println("**   3 . UPDATE VALUES IN ATTENDANCE DETAILS  **");
				System.out.println("**   4 . UPDATE VALUES IN FEES DETAILS        **");
				System.out.println("**   5 . ADMIN OPERATION                      **");
				System.out.println();
				System.out.println("ENTER THE CHOICE");
				int ch = sc.nextInt();
				
				   
		        switch(ch)
		    	    {
		    	    case 1:
		    	    {
		    	        updateBasic();
		    			break;
		    	    }
		    	    
		    	    case 2:
		    	    {
		    	    	updateMarks();
		    			break;
		    	    }
		    	    case 3:
		    	    {
		    	    	updateAttendance();
		    	    	break;
		    	    }
		    	    case 4:
		    	    {
		    	    	updateFees();
		    	    	break;
		    	    }
		    	    case 5:
		    	    {
		    	    	adminOperations();
		    	    	break;
		    	    }
		    	    default:
		    	    {
		    	    	System.out.println("You enter wrong number");
		    	    	updateDetails();
		    	    	break;
		    	    }
		    	    }	
		    	  
				
            }
            
            public void updateBasic() throws Exception
            {
            	System.out.println("Enter the coloumn name(NAME/STANDARD/DATE_OF_BIRTH/BLOOD_GROUP/SCHOOL_NAME): ");
				String coloumn = sc.next();
				
				System.out.println("Enter the Values : ");
				String value = sc.next();
				
				System.out.println("Enter the Roll No : ");
				int roll_no = sc.nextInt();
				
				bd.updateBasic(coloumn,value,roll_no);
				
		
				    System.out.println("IF YOU WANT TO CONTINUE : ");
	    	    	System.out.println("1 for update another student basic details");
	    	    	System.out.println("2 for go to collection of various databases for update operation");
	    	    	System.out.println("3 for go to admin operation");
	    	    	System.out.println("4 for go to admin logout");

	    	    	
	    	        int innerloop = sc.nextInt();
	    	        if(innerloop == 1)
	    	        {
	    	        	updateBasic();
	    	        }
	    	        else if(innerloop == 2)
	    	        {
	    	        	updateDetails();
	    	        }
	    	        else if(innerloop == 3)
	    	        {
	    	        	adminOperations();
	    	        }
	    	        else if(innerloop == 4)
	    	        {
	    	        	exit();
	    	        }
    		
            }
            
            public void updateMarks() throws Exception
            {
            	System.out.println("Enter the coloumn name(TAMIL/ENGLISH/MATHS/SCIENCE/SOCIAL_SCIENCE): ");
				String coloumn = sc.next();
				
				System.out.println("Enter the Values : ");
				String value = sc.next();
				
				System.out.println("Enter the Roll No : ");
				int roll_no = sc.nextInt();
				
				bd.updateBasic(coloumn,value,roll_no);
				
		
				    System.out.println("IF YOU WANT TO CONTINUE : ");
	    	    	System.out.println("1 for update another student marks details");
	    	    	System.out.println("2 for go to collection of various databases for update operation");
	    	    	System.out.println("3 for go to admin operation");
	    	    	System.out.println("4 for go to admin logout");

	    	    	
	    	        int innerloop = sc.nextInt();
	    	        if(innerloop == 1)
	    	        {
	    	        	updateBasic();
	    	        }
	    	        else if(innerloop == 2)
	    	        {
	    	        	updateDetails();
	    	        }
	    	        else if(innerloop == 3)
	    	        {
	    	        	adminOperations();
	    	        }
	    	        else if(innerloop == 4)
	    	        {
	    	        	exit();
	    	        }
    		
            }
            
            public void updateAttendance() throws Exception
            {
            	System.out.println("Enter the coloumn name(TOTAL_DAYS / LEAVE_DAYS / PRESENT_DAYS): ");
				String coloumn = sc.next();
				
				System.out.println("Enter the Values : ");
				String value = sc.next();
				
				System.out.println("Enter the Roll No : ");
				int roll_no = sc.nextInt();
				
				bd.updateBasic(coloumn,value,roll_no);
				
		
				    System.out.println("IF YOU WANT TO CONTINUE : ");
	    	    	System.out.println("1 for update another student Attendance details");
	    	    	System.out.println("2 for go to collection of various databases for update operation");
	    	    	System.out.println("3 for go to admin operation");
	    	    	System.out.println("4 for go to admin logout");

	    	    	
	    	        int innerloop = sc.nextInt();
	    	        if(innerloop == 1)
	    	        {
	    	        	updateAttendance();
	    	        }
	    	        else if(innerloop == 2)
	    	        {
	    	        	updateDetails();
	    	        }
	    	        else if(innerloop == 3)
	    	        {
	    	        	adminOperations();
	    	        }
	    	        else if(innerloop == 4)
	    	        {
	    	        	exit();
	    	        }
    		
            }
            
            public void updateFees() throws Exception
            {
            	System.out.println("Enter the coloumn name(TOTAL_NO / PAID_FEES / REMAINING_FEES): ");
				String coloumn = sc.next();
				
				System.out.println("Enter the Values : ");
				String value = sc.next();
				
				System.out.println("Enter the Roll No : ");
				int roll_no = sc.nextInt();
				
				bd.updateBasic(coloumn,value,roll_no);
				
		
				    System.out.println("IF YOU WANT TO CONTINUE : ");
	    	    	System.out.println("1 for update another student Fees details");
	    	    	System.out.println("2 for go to collection of various databases for update operation");
	    	    	System.out.println("3 for go to admin operation");
	    	    	System.out.println("4 for go to admin logout");

	    	    	
	    	        int innerloop = sc.nextInt();
	    	        if(innerloop == 1)
	    	        {
	    	        	updateFees();
	    	        }
	    	        else if(innerloop == 2)
	    	        {
	    	        	updateDetails();
	    	        }
	    	        else if(innerloop == 3)
	    	        {
	    	        	adminOperations();
	    	        }
	    	        else if(innerloop == 4)
	    	        {
	    	        	exit();
	    	        }
    		
            }
            
    public void deleteDetails() throws Exception
            {
            	System.out.println("DELETE THE VALUES....CHOOSE THE DATABASE...");
				System.out.println();
				System.out.println("**   1 . DELETE VALUES IN BASIC DETAILS       **");
				System.out.println("**   2 . DELETE VALUES IN MARK DETAILS        **");
				System.out.println("**   3 . DELETE VALUES IN ATTENDANCE DETAILS  **");
				System.out.println("**   4 . DELETE VALUES IN FEES DETAILS        **");
				System.out.println("**   5 . ADMIN OPERATIONS                     **");
				System.out.println();
				System.out.println("ENTER THE CHOICE");
				int ch = sc.nextInt();
				
				switch(ch)
	    	    {
	    	    case 1:
	    	    {
	    	        deleteBasic();
	    			break;
	    	    }
	    	    
	    	    case 2:
	    	    {
	    	    	deleteMarks();
	    			break;
	    	    }
	    	    case 3:
	    	    {
	    	    	deleteAttendance();
	    	    	break;
	    	    }
	    	    case 4:
	    	    {
	    	    	deleteFees();
	    	    	break;
	    	    }
	    	    case 5:
	    	    {
	    	    	adminOperations();
	    	    	break;
	    	    }
	    	    default:
	    	    {
	    	    	System.out.println("You enter wrong number");
	    	    	updateDetails();
	    	    	break;
	    	    }
	    	    }	
	    	  
            }
    
     public void deleteBasic() throws Exception
     {
    	    System.out.println("Enter the Roll NO : ");
			int rollNo = sc.nextInt();
			
			bd.deleteBasic(rollNo);
			
			System.out.println("IF YOU WANT TO CONTINUE : ");
 	    	System.out.println("1 for delete another student basic details");
 	    	System.out.println("2 for go to collection of various databases for delete operation");
 	    	System.out.println("3 for go to admin operation");
	    	System.out.println("4 for go to admin logout");

 	    	
 	        int innerloop = sc.nextInt();
 	        if(innerloop == 1)
 	        {
 	        	deleteBasic();
 	        }
 	        else if(innerloop == 2)
 	        {
 	        	deleteDetails();
 	        }
 	        else if(innerloop == 3)
 	        {
 	        	adminOperations();
 	        }
 	        else if(innerloop == 4)
 	        {
 	        	exit();
 	        }
     }
     
     public void deleteMarks() throws Exception
     {
    	    System.out.println("Enter the Roll NO : ");
			int rollNo = sc.nextInt();
			
			md.deleteMarks(rollNo);
			
			System.out.println("IF YOU WANT TO CONTINUE : ");
 	    	System.out.println("1 for delete another student marks details");
 	    	System.out.println("2 for go to collection of various databases for delete operation");
 	    	System.out.println("3 for go to admin operation");
 	    	System.out.println("4 for Exit");
 	    	
 	        int innerloop = sc.nextInt();
 	        if(innerloop == 1)
 	        {
 	        	deleteMarks();
 	        }
 	        else if(innerloop == 2)
 	        {
 	        	deleteDetails();
 	        }
 	        else if(innerloop == 3)
 	        {
 	        	adminOperations();
 	        }
 	        else if(innerloop == 4)
 	        {
 	        	exit();
 	        }
     }
     
     public void deleteAttendance() throws Exception
     {
    	    System.out.println("Enter the Roll NO : ");
			int rollNo = sc.nextInt();
			
			ad.deleteAttendance(rollNo);
			
			System.out.println("IF YOU WANT TO CONTINUE : ");
 	    	System.out.println("1 for delete another student Attendance details");
 	    	System.out.println("2 for go to collection of various databases for delete operation");
 	    	System.out.println("3 for go to admin operation");
	    	System.out.println("4 for go to admin logout");

 	    	
 	        int innerloop = sc.nextInt();
 	        if(innerloop == 1)
 	        {
 	        	deleteAttendance();
 	        }
 	        else if(innerloop == 2)
 	        {
 	        	deleteDetails();
 	        }
 	        else if(innerloop == 3)
 	        {
 	        	adminOperations();
 	        }
 	        else if(innerloop == 4)
 	        {
 	        	exit();
 	        }
     }
     
     public void deleteFees() throws Exception
     {
    	    System.out.println("Enter the Roll NO : ");
			int rollNo = sc.nextInt();
			
			fd.deleteFees(rollNo);
			
			System.out.println("IF YOU WANT TO CONTINUE : ");
 	    	System.out.println("1 for delete another student fees details");
 	    	System.out.println("2 for go to collection of various databases for delete operation");
 	    	System.out.println("3 for go to admin operation");
	    	System.out.println("4 for go to admin logout");

 	    	
 	        int innerloop = sc.nextInt();
 	        if(innerloop == 1)
 	        {
 	        	deleteFees();
 	        }
 	        else if(innerloop == 2)
 	        {
 	        	deleteDetails();
 	        }
 	        else if(innerloop == 3)
 	        {
 	        	adminOperations();
 	        }
 	        else if(innerloop == 4)
 	        {
 	        	exit();
 	        }
     }
     
     public void extraOperation() throws Exception
     {
    	    System.out.println("EXTRA FEATURES...");
			System.out.println();
		
			System.out.println("**   1 . GRADE FOR MARKS               **");
			System.out.println("**   2 . PERCENTAGE FOR ATTENDANCE     **");
			System.out.println("**   3 . ADMIN OPERATION               **");
			System.out.println("**   4 . LOG OUT                       **");
			System.out.println();
			System.out.println("ENTER THE CHOICE");
			int ch = sc.nextInt();
			
			if(ch==1)
			{
				grade();
			}
			else if(ch==2)
			{
				percentage();
			}
			else if(ch==3)
			{
				adminOperations();
			}
     }
     
     public void grade() throws Exception
     {
    	    System.out.println("ENTER THE ROLL NO : ");
			int roll1 = sc.nextInt();
			
			md.takeGrade(roll1);
			

			System.out.println("IF YOU WANT TO CONTINUE : ");
 	    	System.out.println("1 for find grade for student attendance details");
 	    	System.out.println("2 for go to collection of various databases for delete operation");
 	    	System.out.println("3 for go to admin operation");
 	    	System.out.println("4 for Exit");
 	    	
 	    	int innerloop = sc.nextInt();
  	        if(innerloop == 1)
  	        {
  	        	grade();
  	        }
  	        else if(innerloop == 2)
  	        {
  	            extraOperation();
  	        }
  	        else if(innerloop == 3)
  	        {
  	        	adminOperations();
  	        }
  	        else if(innerloop == 4)
  	        {
  	        	exit();
  	        }
			
     }
     
     public void percentage() throws Exception
     {
    	    System.out.println("ENTER THE ROLL NO : ");
			int roll2 = sc.nextInt();
			
			ad.percentage(roll2);
			
			System.out.println("IF YOU WANT TO CONTINUE : ");
 	    	System.out.println("1 for find the percentage for another student attendance details");
 	    	System.out.println("2 for go to collection of various databases for Extra Features");
 	    	System.out.println("3 for go to admin operation");
	    	System.out.println("4 for go to admin logout");

 	    	
 	    	int innerloop = sc.nextInt();
  	        if(innerloop == 1)
  	        {
  	        	percentage();
  	        }
  	        else if(innerloop == 2)
  	        {
  	            extraOperation();
  	        }
  	        else if(innerloop == 3)
  	        {
  	        	adminOperations();
  	        }
  	        else if(innerloop == 4)
  	        {
  	        	exit();
  	        }
     }
     
  
     
     public void adminLogout() throws Exception
     {
    	 System.out.println("**       LOG OUT       **");
    	 System.out.println("Enter the user         : ");
    	 String user = sc.next();
    	 System.out.println("Enter the Password     : ");
    	 int pass = sc.nextInt();
    	 
    	 if(user.equals("admin")&&pass==123)
    	 {
    		 System.out.println("****************************************");
    		 System.out.println("1 for login / 2 for admin login / 3 for exit ");
    		 int log = sc.nextInt();
    		 if(log==1) {
    			 login();
    		 }
    		 else if(log == 2)
    		 {
    			 adminLogin();
    		 }
    		 else if(log == 3) 
    		 {
    			 System.out.println("Thank You...");
    			 System.exit(0);
    		 }
    		 
    	 }
    	 else
    	 {
    		 System.out.println("You enter the wrong username or password");
    		 adminLogout();
    	 }
     }
            
     public void exit() throws Exception
            {
            	
            	System.out.println("Are you ready to LogOut... 1 for yes / 2 for no");
            	int logout = sc.nextInt();
            	if(logout==1)
            	{
            		adminLogout();
            	}
            	else if(logout==2)
            	{
            		adminOperations();
            	}
            	else
            	{
            		System.out.println("Enter wrong number");
            	}
            
            }
    
}
