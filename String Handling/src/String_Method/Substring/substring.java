package String_Method.Substring;
/**substring() method returns a part of the string.
	We pass begin index and end index number position in the java substring method where start index is 
	inclusive and end index is exclusive. In other words, start index starts from 0 whereas end index starts from 1.
	There are two types of substring methods in java string.
 * 
 * public String substring(int startIndex)  
and  
public String substring(int startIndex, int endIndex)  
*
*Throws
StringIndexOutOfBoundsException if start index is negative value or end index is lower than starting index.
 */

public class substring 
{
	public static void main(String[] args)
	{
		String s1="khushabu";  
		System.out.println(s1.substring(2,4));//returns us
		System.out.println(s1.substring(2));//returns ushabu  
		
		String substr = s1.substring(0); // Starts with 0 and goes to end  
        System.out.println(substr);  
        String substr2 = s1.substring(5,10); // return Exception
        System.out.println(substr2);    
	}

}
