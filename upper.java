//Changing the string into upper case without using built in string function


import java.util.Scanner;
import java.io.*;
class upper
{
	public static int lower(int  a)
	{
			if(a>=65&&a<=90)
				a+=32;
		return a;
	}
		public static void main(String[] args)
	{
		//String s="Ankit";
		Scanner sc=new Scanner(System.in);
		String ss=sc.nextLine();

		//System.out.println(s);
		for(int i=0;i<ss.length();i++)
		{
			int r=ss.charAt(i);
			int b=lower(r);

			System.out.print((char) b);
		}

		
	}
}