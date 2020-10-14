package String_Method.charAt;

//charAt() method returns a char value at the given index number.
/*The index number starts from 0 and goes to n-1, where n is length of the string. 
	  It returns StringIndexOutOfBoundsException if given index number is greater than
	   or equal to this string length or a negative number.
	   
* Specified by   CharSequence interface, located inside java.lang package.
* 
*Throws  StringIndexOutOfBoundsException : if index is negative value or greater than this string length.
*/

public class charAt 
{
		public static void main(String args[])
		{  
			String name="Khushabu warade";
			int i,j=name.length(),c=0;
			
			char ch=name.charAt(4);//returns the char value at the 4th index  
			System.out.println(ch);
			
			System.out.println(name.charAt(j-1));// String last index
			
			for(i=0;i<name.length();i++)
			{
				System.out.print(name.charAt(i));
			}
			
			 for ( i=0; i<=name.length()-1; i++) 
			 {  
		            if(i%2!=0) 
		            {  
		                System.out.println("Char at "+i+" place "+name.charAt(i));  
		            }  
		     }
			  for (i=0; i<=name.length()-1; i++)
			  {  
		            if(name.charAt(i) == 'a') 
		            {  
		                c++;  
		            }  
		        }  
		        System.out.println("Frequency of t is: "+c);  
	}
	  
}
