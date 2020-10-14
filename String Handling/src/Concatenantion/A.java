package Concatenantion;


public class A 
{

	public static void main(String[] args) 
	{
		//String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();  
		   String s="Sachin"+" Tendulkar";  
		   System.out.println(s);
		   
		   String s1=50+30+"Sachin"+40+40;  
		   System.out.println(s1);//80Sachin4040 
		   //Note: After a string literal, all the + will be treated as string concatenation operator.
		   
		   //.concat()
		   String s11="Sachin ";  
		   String s2="Tendulkar";  
		   String s3=s11.concat(s2);  
		   System.out.println(s3);//Sachin Tendulkar  
	}

}
