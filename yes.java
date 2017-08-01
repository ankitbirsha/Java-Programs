import java.util.Scanner;
import java.io.*;
class yes
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	toLowerCase(s);

}

public static void toLowerCase(String a){

    String newStr = "";

    for (int i = 0; i< a.length(); i++){

        char aChar = a.charAt(i);
        if (65 <= aChar && aChar<=90){
            aChar = (char)( (aChar + 32) ); 
        }
        newStr = newStr + aChar;    
    }
    System.out.println(newStr);
}
}