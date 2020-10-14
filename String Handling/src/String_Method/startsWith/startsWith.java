package String_Method.startsWith;
/**startsWith() method checks if this string starts with given prefix. It returns true if this string starts with given prefix else returns false.
 * public boolean startsWith(String prefix)  
public boolean startsWith(String prefix, int offset)
 * 
 */

public class startsWith 
{
	public static void main(String[] args) 
	{
		String s1="java string split method ";  
		String str="khushabu";
		System.out.println(s1.startsWith("ja"));  
		System.out.println(s1.startsWith("java string"));
		System.out.println(str.startsWith("k")); // True  
        System.out.println(str.startsWith("a")); // False  
        System.out.println(str.startsWith("h",1)); // True  
	}
}
