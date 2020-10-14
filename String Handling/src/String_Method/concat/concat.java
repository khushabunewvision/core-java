package String_Method.concat;

/** concat() method combines specified string at the end of this string. 
 * It returns combined string. It is like appending another string.
 * 
 * public String concat(String anotherString) 
 
 */

public class concat
{
	public static void main(String args[])
	{  
		String s1="java string";  
		s1.concat("is immutable");  
		System.out.println(s1);  
	
		s1=s1.concat(" is immutable so assign it explicitly");  
		System.out.println(s1);
		
		 String str1 = "Hello";  
        String str2 = "Khushabu";  
        String str3 = "Warade";  
        
        // Concatenating one string   
        String str4 = str1.concat(str2);
        System.out.println(str4);  
        
        // Concatenating multiple strings  
        String str5 = str1.concat(str2).concat(str3);  
        System.out.println(str5);  
        
        String str6=str1.concat(" ").concat(str2).concat(" ").concat(str3);  
        System.out.println(str6);
        
        System.out.println(str1.concat("!!!"));
	}
	
}
