package javanissi;
import java.util.*;

public class AssPrg1 {
	
	public static boolean isPalindrome(String str)
	{
		int i=0,j=str.length()-1;
		if(!((str.charAt(i)==str.charAt(j)))) 
			return false;
		i++;
		j--;
		return true;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string::");
		String str;
		str=sc.nextLine();
		if(isPalindrome(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
