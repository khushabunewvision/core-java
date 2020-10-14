package String_Method.getchar;

/**getChars() method copies the content of this string into specified char array.
 *  There are 4 arguments passed in getChars() method. 
 * 
 * public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)  
 * It doesn't return any value
 * It throws StringIndexOutOfBoundsException if beginIndex is greater than endIndex.
 */

public class getchar 
{
	public static void main(String[] args) 
	{
		String str = new String("hello guys how r u");  
	      char[] ch = new char[10];  
	      
	      try
	      {  
	         str.getChars(6, 16, ch, 0);  
	         System.out.println(ch);  
	      }
	      catch(Exception ex)
	      {
	    	  System.out.println(ex);
	      }
	      
	      try // exeception in throws
	      {  
	            str.getChars(1, 26, ch, 0);  
	            System.out.println(ch);  
	        } 
	      catch (Exception e) 
	      {  
	            System.out.println(e);  
	       }  
	}

}
