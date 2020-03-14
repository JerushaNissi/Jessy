package javanissi;

import java.util.Scanner;

public class AssPrg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string::");
	    String s1 = sc.nextLine();
	    sumInSting(s1);
	  }
	  public static void sumInSting(String str) {
	    int sum=0;
	    for (int i = 0; i < str.length(); i++) 
	    {
	      char a = str.charAt(i);
	      if (Character.isDigit(a)) 
	      {
	        int temp = Integer.parseInt(String.valueOf(a));
	        sum = sum + temp;
	      }
	    }
	    if (sum == 0) {
	      System.out.println(-1);
	    } else
	      System.out.println(sum);

	}

}
