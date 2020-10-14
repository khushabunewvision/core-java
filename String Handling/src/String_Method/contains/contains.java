package String_Method.contains;

/**
 *contains() method searches the sequence of characters in this string.
 * It returns true if sequence of char values are found in this string otherwise returns false.
 * 
 * Returns
true if sequence of char value exists, otherwise false.

Throws
NullPointerException : if sequence is null.

 */
public class contains 
{
	public static void main(String[] args) 
	{
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));//true  
		System.out.println(name.contains("about"));  //true
		System.out.println(name.contains("DO"));  //case sensitive tats y "False"
		System.out.println(name.contains("Khushabu"));
		
		//2nd approach
		boolean isContains = name.contains("hello");  
        System.out.println(isContains);  
        
        //3rd approach
        if(name.contains("do you know")) 
        {  
        		System.out.println("This string contains do you know");  
        }
        else
        {
            System.out.println("Result not found");     
        }
	}
}
