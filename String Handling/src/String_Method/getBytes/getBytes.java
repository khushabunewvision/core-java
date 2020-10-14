package String_Method.getBytes;

/**
 * getBytes() method returns the byte array of the string. In other words, it returns sequence of bytes.
 * 						SIGNATURE
 * public byte[] getBytes()  
public byte[] getBytes(Charset charset)  
public byte[] getBytes(String charsetName)throws UnsupportedEncodingException

* Return sequence of Byte
 * 
 */

public class getBytes
{
	public static void main(String[] args)
	{
		String s1="ABCDEFG";  
		byte[] barr=s1.getBytes();  
		for(int i=0;i<barr.length;i++)
		{  
			System.out.println(barr[i]);
		}
		// returns a byte array that again can be passed to String constructor to get String.
		// Getting string back   
        String s2 = new String(barr);  
        System.out.println(s2);  
		
		
		
		
	}
	
}
