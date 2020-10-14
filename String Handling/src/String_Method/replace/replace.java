package String_Method.replace;
/**replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
		Since JDK 1.5, a new replace() method is introduced, allowing you to replace a sequence of char values.
 * public String replace(char oldChar, char newChar)  
and  
public String replace(CharSequence target, CharSequence replacement)  
 * 
 */

public class replace 
{
	public static void main(String[] args)
	{
		String s1="Hello my name is khushabu";  
		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString);
		
		String replaceString1=s1.replace("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceString1);
		
		String str = "oooooo-hhhh-oooooo";  
        String rs = str.replace("h","s"); // Replace 'h' with 's'  
        System.out.println(rs);  
        rs = rs.replace("s","h"); // Replace 's' with 'h'  
        System.out.println(rs);  
        
	}
	

}
