import java.util.Scanner;
import java.util.regex.Pattern;

public class FormValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String::");
		String str=sc.next();
		formValidation(str);
		System.out.println("sucessfully validated");
	}
	public static void formValidation(String str) {
		 /*if((Pattern.matches("PRO[A-Za-z]{4}[0-9]{3}",str))||
				 (Pattern.matches("FIN[A-Za-z]{4}[0-9]{3}",str))||
				 (Pattern.matches("Test[A-Za-z]{4}[0-9]{3}",str)))*/
			 if((str.matches("PRO[A-Za-z]{4}[0-9]{3}"))||
					 (str.matches("FIN[A-Za-z]{4}[0-9]{3}"))||
					 (str.matches("Test[A-Za-z]{4}[0-9]{3}"))){
			 System.out.println("valid");
		 }
		 else
			 System.out.println("invalid");
		
		
	}

}
