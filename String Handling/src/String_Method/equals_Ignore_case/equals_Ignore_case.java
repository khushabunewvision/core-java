package String_Method.equals_Ignore_case;

/**
 * String equalsIgnoreCase() method compares the two given strings on the basis of 
 * content of the string irrespective of case of the string. It is like equals() method but doesn't check case.
 *  If any character is not matched, it returns false otherwise it returns true.
 *  
 *  public boolean equalsIgnoreCase(String str)  
 */

public class equals_Ignore_case 
{
	public static void main(String[] args)
	{
		String s1="hello";  
		String s2="hello";  
		String s3="HELLO";  
		String s4="world";
		
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
		System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
		
		
				
		
	}

}
