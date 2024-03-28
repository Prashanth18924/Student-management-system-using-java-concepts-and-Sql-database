package studentManagementSystem;

public class MarkDetails extends MarkDetailsOperation
{
	     private int rollNo;
	     private int Tamil;
	     private int English;
	     private int Maths;
	     private int Science;
	     private int SocialScience;
	     
	     public MarkDetails()
	     {
	    	 
	     }
	     
	     public MarkDetails(int rollNo,int t,int e,int m,int s,int ss)
	     {
	    	 this.rollNo=rollNo;
	    	 Tamil=t;
	    	 English=e;
	    	 Maths=m;
	    	 Science=s;
	    	 SocialScience=ss;
	     }
	     
	     
	     public void setrollNo1(int roll)
	     {
	    	 rollNo = roll;
	     }
	     
	     public void setTamil(int t)
	     {
	    	 Tamil = t;
	     }
	     
	     public void setEnglish(int e)
	     {
	    	 English = e;
	     }
	     
	     public void setMaths(int m)
	     {
	    	 Maths = m;
	     }
	     
	     public void setScience(int s)
	     {
	    	 Science = s ;
	     }
	     
	     public void setSocialScience(int ss)
	     {
	    	 SocialScience = ss ;
	     }

	     public int getrollNo1()
	     {
	    	 return rollNo;
	     }
	          
	     public int getTamil()
	     {
	    	 return Tamil;
	     }
	     
	     public int getEnglish()
	     {
	    	 return English;
	     }
	     
	     public int getMaths()
	     {
	    	 return Maths;
	     }
	     
	     public int getScience()
	     {
	    	 return Science;
	     }
	     
	     public int getSocialScience()
	     {
	    	 return SocialScience;
	     }
	     
	     
}
