
import java.util.Scanner;


 class User {
public static int validatePAN(String s){

	int res=0;
	if(s.length()==10)
	{
	if(s.matches("[A-Z]{3}[0-9]{5}[A-Z]{2}"))
		res=1;
	else
		res=2;
	}
	return res;
}
}
public class Main1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s=sc.next();
int res=User.validatePAN(s);
if(res==1)
	System.out.println("Valid");
else
	System.out.println("Invalid");

}
}





