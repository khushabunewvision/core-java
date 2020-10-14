package String_Method.equals_with_Arraylist;

import java.util.ArrayList;

public class equals_with_Arraylist 
{
	public static void main(String[] args)
	{
		String str1 = "Name";  
		
        ArrayList<String> list = new ArrayList<>();  
        
        list.add("My");   
        list.add("Name");  
        list.add("Is");  
        list.add("Khushabu");  
        
        for (String str : list) 
        {  
            if (str.equals(str1)) 
            {  
                System.out.println("Hi is present");  
            }  
            else
            {
            	System.out.println("Hi is not present");
            }
        }  
	}

}
