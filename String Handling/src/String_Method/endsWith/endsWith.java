package String_Method.endsWith;

/**
 * endsWith() method checks if this string ends with given suffix.
 *  It returns true if this string ends with given suffix else returns false.
 * public boolean endsWith(String suffix)  
 * 
 *  
 */

public class endsWith 
{
	public static void main(String[] args) 
	{
		String s1="India is a country";  
		System.out.println(s1.endsWith("try"));  
		System.out.println(s1.endsWith("point"));  
		
		 if(s1.endsWith(".com")) 
		 {  
	            System.out.println("String ends with .com");  
	      }
		  else 
		  {
			  System.out.println("It does not end with .com");  
		  }  
	}

}
