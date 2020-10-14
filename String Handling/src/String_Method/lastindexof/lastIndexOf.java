
package String_Method.lastindexof;

/** lastIndexOf() method returns last index of the given character value or substring. 
 * If it is not found, it returns -1. The index counter starts from zero.
 * 
 * 1	int lastIndexOf(int ch)	returns last index position for the given char value
	2	int lastIndexOf(int ch, int fromIndex)	returns last index position for the given char value and from index
	3	int lastIndexOf(String substring)	returns last index position for the given substring
	4	int lastIndexOf(String substring, int fromIndex)	returns last index position for the given substring and from index
 * 
 */

public class lastIndexOf 
{
	public static void main(String[] args)
	{
		String s1="this is index of example";//there are 2 's' characters in this sentence  
		int index1=s1.lastIndexOf('s');//returns last index of 's' char value  
		System.out.println(index1);//6  
		
		int index2 = s1.lastIndexOf('s',5);  
        System.out.println(index2);
        
        int index3 = s1.lastIndexOf("of");  
        System.out.println(index3);
        
        int index4 = s1.lastIndexOf("of", 25);  
        System.out.println(index4);//14
        
        index4 = s1.lastIndexOf("of", 10);  
        System.out.println(index4); // -1, if not found                
	}

}
