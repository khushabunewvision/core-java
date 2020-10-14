package Compare;

public class Equals 
{
	public static void main(String[] args)
	{
		String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";  
		   String s6="Ratan";
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   System.out.println(s1.equalsIgnoreCase(s2));//true  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s6));//1(because s1>s6)  
		   System.out.println(s6.compareTo(s1));//-1(because s6 < s1 )  
		   
		/*   s1 == s2 :0
				   s1 > s2   :positive value
				   s1 < s2   :negative value
	*/
	}

}
