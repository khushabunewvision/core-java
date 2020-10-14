package String_Method.equal;

/* equals() method compares the two given strings based on the content of the string. 
 * If any character is not matched, it returns false. If all characters are matched, it returns true.
 * 
 * public boolean equals(Object anotherObject)  
 * 
 * Overrides
equals() method of java Object class.

1. equals() method present in object used for reference comparison & return Boolean value.
		o If two reference variables are pointing to same object returns true otherwise false.
2. 	String is child class of object and it is overriding equals( ) methods used for content comparison.
	o I	f two objects content is same then returns true otherwise false.
3. StringBuffer class is child class of object and it is not overriding equals() method hence it is using
	parent class(Object) equals() method used for reference comparison.
o 		If two reference variables are pointing to same object returns true otherwise false.
*/

public class equals 
{

	public static void main(String[] args) 
	{
		String s1="hello";  
		String s2="hello";  
		String s3="HELLO";  
		String s4="world";
		
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
	
		  if (s1.equals(s3)) 
		  {  
	            System.out.println("both strings are equal");  
	      }
		  else
		  { 
			  System.out.println("both strings are unequal");     
		  }
		  
		  
	
	}

}
