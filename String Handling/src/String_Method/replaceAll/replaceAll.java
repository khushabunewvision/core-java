package String_Method.replaceAll;
/**replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.
 * public String replaceAll(String regex, String replacement)  
 * 
 */

public class replaceAll 
{
	public static void main(String[] args) 
	{
		String s1="hello my name is khushabu";  
		String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString);  
		
		String s2="My name is Khan. My name is Bob. My name is Sonoo.";  
		String replaceString1=s2.replaceAll("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceString1);  
		
		String replaceString2=s2.replaceAll("\\s","");  
		System.out.println(replaceString2);  
		
		
		
	}

}
