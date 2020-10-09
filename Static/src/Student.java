class Student1
{  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	   
	   Student1(int r, String n)
	   {  
			   rollno = r;  
			   name = n;  
	   }
	   
	   void display ()
	   {
		   	System.out.println(rollno+" "+name+" "+college);
	   }  
	   
	   static void disp()
	   {
		   System.out.println(college);
	   }
}  

public class Student
{  
	 public static void main(String args[])
	 {  
		 	System.out.println(Student1.college);
		 	Student1.disp();// static method called by classname.method() as psvm is declared in another class
			 
		 	Student1 s1 = new Student1(111,"Karan");  
			 Student1 s2 = new Student1(222,"Aryan");  
			
			 s1.display();  
			 s2.display();
			
			 //we can change the college of all objects by the single line of code 
			Student1.college="BBDIT";  
			System.out.println(Student1.college);
			
			s1.display();  
			 s2.display();
			 
	}  
}  