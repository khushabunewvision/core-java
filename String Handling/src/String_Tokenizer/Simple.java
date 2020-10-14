package String_Tokenizer;

/**The java.util.StringTokenizer class allows you to break a string into tokens. It is simple way to break string.
StringTokenizer class is deprecated now.
 It is recommended to use split() method of String class or regex (Regular Expression).
*It doesn't provide the facility to differentiate numbers, quoted strings, identifiers etc. 
*like StreamTokenizer class. 
 * 
 * 6 useful methods of StringTokenizer class 
 * boolean hasMoreTokens()	checks if there is more tokens available.
	String nextToken()	returns the next token from the StringTokenizer object.
	String nextToken(String delim)	returns the next token based on the delimeter.
	boolean hasMoreElements()	same as hasMoreTokens() method.
	Object nextElement()	same as nextToken() but its return type is Object.
	int countTokens()	returns the total number of tokens.

 */
import java.util.StringTokenizer;

public class Simple
{  
	 public static void main(String args[])
	 {  
	   StringTokenizer st = new StringTokenizer("my name is khan"," "); //OBJ of stringtokenizer 
	     while (st.hasMoreTokens()) 
	     {  
	         System.out.println(st.nextToken());  
	     }
	     
	     StringTokenizer st1 = new StringTokenizer("my,name,is,khan");  
	        
	      // printing next token  
	      System.out.println("Next token is : " + st1.nextToken(","));  
	   }  
	}  