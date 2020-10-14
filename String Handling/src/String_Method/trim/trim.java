package String_Method.trim;
/**trim() method eliminates leading and trailing spaces. The unicode value of space character is '\u0020'.
 * The trim() method in java string checks this unicode value before and after the string, 
		if it exists then removes the spaces and returns the omitted string.
*   The string trim() method doesn't omits middle spaces.
*   Signature:- public String trim()  
*   
 */

public class trim 
{
	public static void main(String[] args) 
	{
		String s1="  hello khushabu   ";  
		System.out.println(s1.length());  
		System.out.println(s1);
		System.out.println(s1+"warade");//without trim()  
		System.out.println(s1.trim()+"warade");//with trim()  
		
		String tr = s1.trim();  
        System.out.println(tr.length());  
        System.out.println(tr); //With trim()  
	}
}
