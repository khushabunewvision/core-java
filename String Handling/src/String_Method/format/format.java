package String_Method.format;

/**
 * The java string format() method returns the formatted string by given locale, format and arguments.
 * 
If you don't specify the locale in String.format() method, it uses default locale by calling Locale.getDefault() method.

The format() method of java language is like sprintf() function in c language and printf() method of java language.

*			Signature
*public static String format(String format, Object... args)  
and,  
public static String format(Locale locale, String format, Object... args)  
*
*Throws
NullPointerException : if format is null.
IllegalFormatException : if format is illegal or incompatible.
*
 */

public class format
{
	public static void main(String[] args)
	{
		String name="sonoo";  
		String sf1=String.format("name is %s",name);  
		String sf2=String.format("value is %f",32.33434);  
		String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
		  
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3); 
		
		String str1 = String.format("%d", 101);          // Integer value  
        String str2 = String.format("%s", "Amar Singh"); // String value  
        String str3 = String.format("%f", 101.00);       // Float value  
        String str4 = String.format("%x", 101);          // Hexadecimal value  
        String str5 = String.format("%c", 'c');          // Char value  
        System.out.println(str1);  
        System.out.println(str2);  
        System.out.println(str3);  
        System.out.println(str4);  
        System.out.println(str5); 
        
        String str6= String.format("|%10d|", 101);  // right justifySpecifying length of integer  
        String str7 = String.format("|%-10d|", 101); // Left-justifying within the specified width  
        String str8 = String.format("|% d|", 101);   
        String str9 = String.format("|%010d|", 101); // Filling with zeroes  
        System.out.println(str6);  
        System.out.println(str7);  
        System.out.println(str8);  
        System.out.println(str9);  
        System.out.println(str5); 
	}

}
