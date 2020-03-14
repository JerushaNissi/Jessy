import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String::");
		String str=sc.next();
		validatePassword(str);

	}
	public static void validatePassword(String str) {
		boolean input=false;
		input=Pattern.matches("(?=.*[a-z])(?=.*\\d)(?=.*[@#$])(?=.*[A-Z]).{6,16}",str);
		
		if(input==true)
		{
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");

	
		
		
	}

}
