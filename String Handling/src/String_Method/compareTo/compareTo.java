package String_Method.compareTo;

/**compareTo() method compares the given string with current string lexicographically.
It returns positive number, negative number or 0.
*
*It compares strings on the basis of Unicode value of each character in the strings.
*
*  if s1 > s2, it returns positive number  
	if s1 < s2, it returns negative number  
	if s1 == s2, it returns 0
	
	By using compareTo() we are comparing two strings character by character, such type of
checking is called lexicographically checking or dictionary checking.
1. compareTo() is return type is integer and it returns three values
	a. zero ----> if both String are equal
	b. positive --->if first string first character Unicode value is bigger than second String first
		character Unicode value then it returns positive.
	c. Negative ---> if first string first character Unicode value is smaller than second string first
		character Unicode value then it returns negative.
2. compareTo() method comparing two string with case sensitive.
*/

public class compareTo 
{
	public static void main(String args[])
	{  
			String s1="hello";  
			String s2="hello";  
			String s3="meklo";  
			String s4="hemlo";  
			String s5="flag";  
			String s6="HELLO";
			
			System.out.println(s1.compareTo(s2));//0 because both are equal  
	
			System.out.println(s1.compareToIgnoreCase(s6));//0 because both are equal  not case sensitive
			
			System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
			
			System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
			
			System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
			
			System.out.println(s1.compareTo(s6));/*If second string is empty, result would be positive.
			 If first string is empty, result would be negative.*/
			
			System.out.println(s6.compareTo(s1));
			
			

	}
}
