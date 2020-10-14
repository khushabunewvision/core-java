package String_Method.toLowerCase_Uppercase;
/**toLowerCase() method returns the string in lowercase letter.
 * toLowerCase() method works same as toLowerCase(Locale.getDefault()) method. It internally uses the default locale.
 * Signature:-	public String toLowerCase()  
						public String toLowerCase(Locale locale)
* toUpperCase() method returns the string in uppercase letter. 
* toUpperCase() method works same as toUpperCase(Locale.getDefault()) method.
*Signature:-	public String toUpperCase()  
					public String toUpperCase(Locale locale)
*
*
 */

public class toLowerCase_Uppercase 
{
	public static void main(String[] args)
	{
		String s1="HEllo Hi KhANA KHAke Jana HHAAA";  
		String s1lower=s1.toLowerCase();  
		System.out.println(s1lower);
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		
	}
}
