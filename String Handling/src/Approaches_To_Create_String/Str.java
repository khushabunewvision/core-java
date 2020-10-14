/*
 * The java.lang.String class implements

 *  Serializable, Comparable and CharSequence interfaces.
 *  
 *  1.
if you create string object using new keyword 
like
String s1 = new String()
then it will store in heap memory



2. 
if you create string object using String literal
like
String s2="abc";

then it will store string in String constant pool memory.
 */

package Approaches_To_Create_String;

public class Str 
{
	public static void main(String[] args) 
	{
		
		String a="hello";  //  String Literal
		/*Each time you create a string literal, the JVM checks the
		 *  "string constant pool" first.
		 *  If the string already exists in the pool, 
		 *  a reference to the pooled instance
		 *   is returned. If the string doesn't exist in the pool,
		 *    a new string instance is created and placed in the pool.
		 * */
		System.out.println(a);
		
		char[] ch={'k','h','u','s','h','a','b','u'};  
		String s=new String(ch);//converting char array to string  
		System.out.println(s);
		
		String ab=new String("warade");//creating using new keyword it ll be sttore in heAP memory
		
		String s1="Hello";  
		s1.concat(" World");//concat() method appends the string at the end  
		System.out.println(s1);//will print Hello because strings are immutable objects  

	/*  		
		objects are created but s reference variable still refers to "Hello" not to "Hello World".

		But if we explicitly assign it to the reference variable, it will refer to "hello World" object.
		*/
		s1=s1.concat(" World");  
		   System.out.println(s1); 
		   //Please notice that still hello object is not modified.
	}

}
