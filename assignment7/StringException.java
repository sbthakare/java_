package assignment7;

import java.util.Scanner;

class CheckVowel extends Exception{
	
	public CheckVowel(String msg) {
		super(msg);   // calling parent class constructor
	}
}
public class StringException 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String ");
		
		String str=sc.next();
		
		try {
			for(int i=0;i<str.length();i++)
			{  
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				{
					throw new CheckVowel("String contains vowel");
				}
				else 
					throw new CheckVowel("String not contains vowel");
			   
			}
			
	    }catch(Exception e)
		{
		System.out.println(e);
      	}
	}
}


