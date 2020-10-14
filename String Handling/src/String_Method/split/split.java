package String_Method.split;
/**split() method splits this string against given regular expression and returns a char array.
 *  			Signature
					There are two signature for split() method in java string.
					public String split(String regex)  
					and,  
					public String split(String regex, int limit)  
*
			*Throws
			PatternSyntaxException if pattern for regular expression is invalid
			*Since
			1.4
*
 */

public class split
{
	public static void main(String[] args) 
	{
		String s1="Hello Hi majja ma cheee";  
		
		System.out.println("1st take of split");
		String[] words=s1.split("\\s");//splits the string based on whitespace  // split(String regex,int limit)
		//using java foreach loop to print elements of string array  
		for(String w:words)
		{  
			System.out.println(w);  
		}
		
		System.out.println("\n2nd take of split");
		for(String w:s1.split("\\s",0)) 		//split(String regex,int limit)
		{  
			System.out.println(w);  
		} 
		
		System.out.println("\n3rd take of split");
		for(String w:s1.split("\\s",1))
		{  
			System.out.println(w);  
		}  
		
		System.out.println("\n4th take of split");
		for(String w:s1.split("\\s",3))
		{  
			System.out.println(w);  
		}  
		
		System.out.println("\n 5th Take of Split(String regexx, int limit)");
		String[] arr = s1.split("a", 0);  
        for (String w : arr) 
        {  
            System.out.println(w);  
        }  
        System.out.println("Split array length: "+arr.length);  
        
        String cars=" maruti, hundai, swift, eon, lamborgini";
        String allcar[]= cars.split(",");
        for(String car : allcar)
        {
        	System.out.println(car);
        }
	}
}
