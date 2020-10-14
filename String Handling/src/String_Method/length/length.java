
package String_Method.length;

public class length 
{
	public static void main(String[] args) 
	{
		String str = "Khushabu";  
        if(str.length()>0) 
        {  
            System.out.println("String is not empty and length is: "+str.length());  
        }  
        str = "";  
        if(str.length()==0) 
        {  
            System.out.println("String is empty now: "+str.length());  
        }  
        
        System.out.println("string length is: "+str.length());//8
        
	}

}
