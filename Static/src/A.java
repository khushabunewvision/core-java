
public class A 
{
      static int a=10,b=20,i=1;
      
      A()
      {
    	  System.out.println("In constructor");
      }
      static 
      {
    	  System.out.println("In Static blocK");
    	  System.out.println("The addition is:="+(a+b));
      }
      
      static void counter()
      {
    	  System.out.println(i);
    	  i++;
      }
	public static void main(String[] args)
	{
		A a= new A();
		System.out.println(b);// Static Variable called directly
		counter();//static method called diredctly as psvm() is in same cllass
		counter();
		counter();
		counter();
		counter();
	}

}
