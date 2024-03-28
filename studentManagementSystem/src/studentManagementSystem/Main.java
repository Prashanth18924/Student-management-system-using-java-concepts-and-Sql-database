/*
 * Grade System
 * Attendance Percentage
 */
package studentManagementSystem;

import java.util.Scanner;


public class Main {
	
			public static void main(String[] args) throws Exception
			{
				BasicDetails bd = new BasicDetails();
				MarkDetails md = new MarkDetails();
				Scanner sc = new Scanner(System.in);
				AttendanceDetails ad = new AttendanceDetails();
				feesDetails fd = new feesDetails();
				Login log = new Login();
				
				int login=0;
				System.out.println("***********************************");
				System.out.println("********STUDENTS DATABASE**********");
				System.out.println("***********************************");
				
				System.out.println();
				boolean loginLoop = true;
				
				
			    System.out.println("*************LOGIN*****************");
				System.out.println();
				
				System.out.println("1.STUDENT");
				System.out.println("2.ADMIN");
				
				while(loginLoop)
				{
				System.out.println("ENTER YOUR CHOICE : ");
			    login = sc.nextInt();
			    if(login==1 || login==2)
			    {
			    	loginLoop = false;
			    }
			    else
			    {
			    	System.out.println("Please... Enter 1 or 2");
			    	loginLoop = true;
			    }
				}
				
				switch(login)
				{
				case 1:
					boolean caseOne = true;
					while(caseOne)
					{
					int value = 0;
					System.out.println("ENTER THE ROLL_NO : ");
					int roll = sc.nextInt();
					System.out.println("ENTER THE PASSWORD : ");
					int pass = sc.nextInt();
					
					value = log.loginprocess(roll, pass);
					if(value==0)
					{
						caseOne = true;
					}
					else
					{
						System.out.println("If you want continue...1.YES /2.NO ");
						String ans = sc.next();
						if(ans == "yes" || ans == "Yes" || ans == "YES" || ans == "yES" || ans == "yeS")
						{
							caseOne = true;
						}
						else
						{
							System.out.println("Thank You...");
							break;
							
						}
						
					}
					}
					break;
				case 2:
		        	  
		        boolean loop = true;
				while(loop)
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
				case 1 :
				{
					boolean loop1 = true;
					while(loop1)
					{
					System.out.println("************************************");
					System.out.println("**   1 . BASIC DETAILS            **");
					System.out.println("**   2 . MARK DETAILS             **");
					System.out.println("**   3 . ATTENDANCE DETAILS       **");
					System.out.println("**   4 . FEES DETAILS             **");
					System.out.println("**   5 . EXIT                     **");
					System.out.println("************************************");
					
				    System.out.println("ENTER THE CHOICE : ");
				    int ch = sc.nextInt();
				    
				    switch(ch)
				    {
				    case 1:
				    {
				    	bd.showbasic(bd);
				    	System.out.println("IF YOU WANT TO CONTINUE : YES / NO");
				        String innerloop = sc.next();
				        if(innerloop == "yes")
				        {
				        	loop1=true;
				        }
				        else
				        {
				        	loop1=false;
				        }
						break;
				    }
				    case 2:
				    {
				    	md.showMarks(md);
						break;
				    }
				    case 3:
				    {
				    	ad.showAttendance(ad);
				    	break;
				    }
				    case 4:
				    {
				    	fd.showFees(fd);
				    	break;
				    }
				    case 5:
				    {
				    	login = 2;
				    	break;
				    }
				    }}
				    break;
					
				}
				case 2 :
				{
					System.out.println("INSERT THE VALUES....CHOOSE THE DATABASE...");
					System.out.println();
					System.out.println("**   1 . INSERT VALUES IN BASIC DETAILS       **");
					System.out.println("**   2 . INSERT VALUES IN MARK DETAILS        **");
					System.out.println("**   3 . INSERT VALUES IN ATTENDANCE DETAILS  **");
					System.out.println("**   4 . INSERT VALUES IN FEES DETAILS        **");
					System.out.println("**   5 . GO TO MAIN                           **");
					System.out.println("ENTER THE CHOICE");
					int ch2 = sc.nextInt();
					
					switch(ch2)
					{
					case 1 :
					{
							
						System.out.println("Enter the Name : ");
						String name = sc.next();
						bd.setName(name);
						
						
						System.out.println("Enter the Roll No : ");
						int rollNo = sc.nextInt();
						bd.setRollNo(rollNo);
					
										
						System.out.println("Enter the Date of Birth : ");
						String dob = sc.next();
						bd.setDob(dob);
						
						System.out.println("Enter the Blood Group : ");
						String bg = sc.next();
						bd.setStd();
						bd.setschoolName();
						
						bd.setBloodGroup(bg);
						bd.insertbasic(bd);
						
						break;
					}
					case 2 :
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
						
						break;
					}
					case 3 :
					{
						System.out.println("Enter the Roll no : ");
						int rollNo = sc.nextInt();
						ad.setRollNo(rollNo);
								
						System.out.println("Enter the month name : ");
						String month = sc.next();
						ad.setMonth(month);
						
						System.out.println("Total Days : ");
						int total = sc.nextInt();
						ad.setTotal(total);
						
						System.out.println("Leave Days : ");
						int leave = sc.nextInt();
						ad.setleave(leave);
						
						ad.setpresent();
						
						md.insertMarks(md); 
						
						break;
						
					}
					case 4:
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
						 
						 break;
					}
						
				}
				 break;
				}
				case 3:
				{
					System.out.println("UPDATE THE VALUES....CHOOSE THE DATABASE...");
					System.out.println();
					System.out.println("**   1 . UPDATE VALUES IN BASIC DETAILS       **");
					System.out.println("**   2 . UPDATE VALUES IN MARK DETAILS        **");
					System.out.println("**   3 . UPDATE VALUES IN ATTENDANCE DETAILS  **");
					System.out.println("**   4 . UPDATE VALUES IN FEES DETAILS        **");
					System.out.println();
					System.out.println("ENTER THE CHOICE");
					int ch2 = sc.nextInt();
					switch(ch2)
					{
					case 1 :
					{
						System.out.println("Enter the coloumn name : ");
						String coloumn = sc.next();
						
						System.out.println("Enter the Values : ");
						String value = sc.next();
						
						System.out.println("Enter the Roll No : ");
						int roll_no = sc.nextInt();
						
						bd.updateBasic(coloumn,value,roll_no);
						
						break;
					}
					case 2:
					{
						System.out.println("Enter the coloumn name : ");
						String coloumn = sc.next();
						
						System.out.println("Enter the Values : ");
						int value = sc.nextInt();
						
						System.out.println("Enter the Roll No : ");
						int roll_no = sc.nextInt();
						
						md.updateMarks(coloumn,value,roll_no);
						
						break;
					}
					case 3:
					{
						System.out.println("Enter the coloumn name : ");
						String coloumn = sc.next();
						
						System.out.println("Enter the Values : ");
						String value = sc.next();
						
						System.out.println("Enter the Roll No : ");
						int roll_no = sc.nextInt();
						
						ad.updateAttendance(coloumn,value,roll_no);
						
						break;
					}
					case 4:
					{
						System.out.println("Enter the coloumn name : ");
						String coloumn = sc.next();
						
						System.out.println("Enter the Values : ");
						int value = sc.nextInt();
						
						System.out.println("Enter the Roll No : ");
						int roll_no = sc.nextInt();
						
						fd.updateFees(coloumn,value,roll_no);
						
						break;
					}
					
					
					}
					
				
				break;	
				}
				case 4:
				{
					System.out.println("DELETE THE VALUES....CHOOSE THE DATABASE...");
					System.out.println();
					System.out.println("**   1 . DELETE VALUES IN BASIC DETAILS       **");
					System.out.println("**   2 . DELETE VALUES IN MARK DETAILS        **");
					System.out.println("**   3 . DELETE VALUES IN ATTENDANCE DETAILS  **");
					System.out.println("**   4 . DELETE VALUES IN FEES DETAILS        **");
					System.out.println();
					System.out.println("ENTER THE CHOICE");
					int ch2 = sc.nextInt();
					
					switch(ch2)
					{
					case 1:
					{
						System.out.println("Enter the Roll NO : ");
						int rollNo = sc.nextInt();
						
						bd.deleteBasic(rollNo);
						break;
					}
					case 2:
					{
						System.out.println("Enter the Roll NO : ");
						int rollNo = sc.nextInt();
						
						md.deleteMarks(rollNo);
						break;
					}
					case 3:
					{
						System.out.println("Enter the Roll NO : ");
						int rollNo = sc.nextInt();
						
						ad.deleteAttendance(rollNo);
						break;
					}
					case 4:
					{
						System.out.println("Enter the Roll NO : ");
						int rollNo = sc.nextInt();
						
						fd.deleteFees(rollNo);
						break;
					}
					}
					
					
				}
				break;
				case 5:
				{
					System.out.println("EXTRA FEATURES....CHOOSE THE DATABASE...");
					System.out.println();
				
					System.out.println("**   1 . GRADE FOR MARKS               **");
					System.out.println("**   2 . PERCENTAGE FOR ATTENDANCE     **");
					System.out.println();
					System.out.println("ENTER THE CHOICE");
					int ch2 = sc.nextInt();
					switch(ch2)
					{
				
					case 1  :
					{
						System.out.println("ENTER THE ROLL NO : ");
						int roll1 = sc.nextInt();
						
						md.takeGrade(roll1);
					}
					case 2:
					{
						System.out.println("ENTER THE ROLL NO : ");
						int roll2 = sc.nextInt();
						
						ad.percentage(roll2);
					}
					
					
				
				
					}
				}
				break;	
				case 6:
				{
					loop = false;
					break;
				}
				}}
				
			if(loop==false)
			{
				System.out.println("Thank You...");
			}
			
			break;
			   }
			 
			}
			

}


