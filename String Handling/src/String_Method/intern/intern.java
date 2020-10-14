package String_Method.intern;

/**intern() method returns the interned string(storing only one copy of each distinct 


 * String Value, which must be immutable.). It returns the canonical representation(unique representation) of string.
	
	By applying String.intern() on a couple of strings will ensure that all strings having the same contents share 
	the same memory. 
	For example, if a name ‘Amy’ appears 100 times, by interning you ensure only one ‘Amy’ is actually allocated memory.
	
 *When the intern() method is executed then it checks whether the String equals to this String Object is in the pool or not.
 *If it is available, then the string from the pool is returned. Otherwise, this String object is added to the pool and a
 * reference to this String object is returned.
 *It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.
 * It is advised to use equals(), not ==, to compare two strings. 
 * This is because == operator compares memory locations, while equals() method compares the content 
 * stored in two objects.
 * 
 * kbhi string jb apn new keyword ise intilize krte to heap me store hua jo object hai usko SCP me transfer krne ke liye intern() use hota hai
*
 */

public class intern 
{
	public static void main(String[] args)
	{
		// S1 refers to Object in the Heap Area  
        String s1 = new String("GFG"); // Line-1  
  
        // S2 refers to Object in SCP Area 
        String s2 = s1.intern(); // Line-2  
          
        // Comparing memory locations 
        // s1 is in Heap 
        // s2 is in SCP (string constatnt pool)
        System.out.println(s1 == s2); 
          
        // Comparing only values 
        System.out.println(s1.equals(s2)); 
          
        // S3 refers to Object in the SCP Area  
        String s3 = "GFG"; // Line-3  
  
        System.out.println(s2 == s3);  

        String s11=new String("hello");  
        String s21="hello";  
        String s31=s11.intern();//returns string from pool, now it will be same as s2  
        System.out.println(s11==s21);//false because reference variables are pointing to different instance  
        System.out.println(s21==s31);//true because reference variables are pointing to same instance  
	
        String s12 = "Javatpoint";  
        String s22 = s12.intern();  
        String s32 = new String("Javatpoint");  
        String s42 = s32.intern();          
        System.out.println(s12==s22); // True  
        System.out.println(s12==s32); // False  
        System.out.println(s12==s42); // True       
        System.out.println(s22==s32); // False  
        System.out.println(s22==s42); // True        
        System.out.println(s32==s42); // False          
	
	
	}
	
}
