package javanissi;

import java.util.Scanner;

public class Assprg4 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		System.out.println("Enter a integer value");
		int n=s.nextInt();
		StringBuffer sb=new StringBuffer();
		sb.append(str.substring(0,n));
		sb.append(str.substring(str.length()-n));
		System.out.println("the first n and last n string is "+sb.toString());
	}
}



