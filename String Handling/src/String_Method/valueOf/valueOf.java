package String_Method.valueOf;
/** valueOf() method converts different types of values into string.
 *  By the help of string valueOf() method, you can convert int to string, long to string, boolean to string, 
 *  character to string, float to string, double to string, object to string and char array to string.
 * Signature:-		public static String valueOf(boolean b)  
							public static String valueOf(char c)  
							public static String valueOf(char[] c)  
							public static String valueOf(int i)  
							public static String valueOf(long l)  
							public static String valueOf(float f)  
							public static String valueOf(double d)  
							public static String valueOf(Object o)  
*
 */

public class valueOf 
{
	public static void main(String[] args)
	{
		int value=30;  
		String s=String.valueOf(value);  
		System.out.println(s+10);//concatenating string with 10  
		
		boolean b1=true;  
        byte b2=11;    
        short sh = 12;  
        int i = 13;  
        long l = 14L;  
        float f = 15.5f;  
        double d = 16.5d;  
        char chr[]={'a','b','c','d'};  
        valueOf obj=new valueOf();  
        String s1 = String.valueOf(b1);    
        String s2 = String.valueOf(b2);    
        String s3 = String.valueOf(sh);    
        String s4 = String.valueOf(i);    
        String s5 = String.valueOf(l);    
        String s6 = String.valueOf(f);    
        String s7 = String.valueOf(d);    
        String s8 = String.valueOf(chr);    
        String s9 = String.valueOf(obj);    
        System.out.println(s1);  
        System.out.println(s2);  
        System.out.println(s3);  
        System.out.println(s4);  
        System.out.println(s5);  
        System.out.println(s6);  
        System.out.println(s7);  
        System.out.println(s8);  
        System.out.println(s9);
	}
		
		
}
