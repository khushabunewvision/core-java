package equals;

public class Test 
{
	public Test(String str)
	{
	}
	public static void main(String[] args)
	{
		Test t1 = new Test("ratan");
		Test t2 = new Test("ratan");
		//Object class equals() method executed (reference comparison)
		System.out.println(t1.equals(t2));
		
		String str1 = new String("Sravya");
		String str2 = new String("Sravya");
		//String class equals() method executed (content comparison)
		System.out.println(str1.equals(str2));
		
		StringBuffer sb1 = new StringBuffer("anu");
		StringBuffer sb2 = new StringBuffer("anu");
		//StringBuffer class equals() executed (reference comparison)
		System.out.println(sb1.equals(sb2));
	}

}
