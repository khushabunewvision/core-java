public class Test  
{ 
    // static block 
    static
    { 
        System.out.println("Hello User"); 
    } 
} 


Test.java- Static Block Without Using Main method
Yes, we can execute a java program without a main method by using a static block. 
Static block in Java is a group of statements that gets executed only once when the class 
is loaded into the memory by Java ClassLoader, It is also known as a static initialization block. 
Static initialization block is going directly into the stack memory.

			Example
			class StaticInitializationBlock{
			   static{
			      System.out.println("class without a main method");
			      System.exit(0);
			   }
			}
			
Can we execute a program without main() method?
Ans) No, one of the ways was the static block, but it was possible till JDK 1.6. Since JDK 1.7, it is not possible to execute a Java class without the main method.

class A3{  
  static{  
  System.out.println("static block is invoked");  
  System.exit(0);  
  }  
}  