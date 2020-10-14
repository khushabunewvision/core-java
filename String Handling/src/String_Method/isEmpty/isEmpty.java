package String_Method.isEmpty;

/** isEmpty() method checks if this string is empty or not. It returns true, if length of string is 0 otherwise false. 
 * In other words, true is returned if string is empty otherwise it returns false.
 *
 * isEmpty() method of String class is included in java string since JDK 1.6.
 * public boolean isEmpty()  
 */
public class isEmpty 
{
	public static void main(String[] args)
	{
		String s1="";  
		String s2="Khushabu";  
		  
		System.out.println(s1.isEmpty());  
		System.out.println(s2.isEmpty());  
		
		if(s1.length()==0 || s1.isEmpty())
		{
			System.out.println("String s1 is empty");  
		}
        else 
        {
        	System.out.println("s1");        
        }
		
        if(s2.length()==0 || s2.isEmpty())
        {
            System.out.println("String s2 is empty");  
        }
        else
        {
        	System.out.println(s2);  
        }
	}

}
