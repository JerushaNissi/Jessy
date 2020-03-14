import java.util.Scanner;

public class HexaDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String::");
		String str=sc.next();
		
		Hexa hex=new Hexa();
		hex.validateHexaDec(str);
	}
}
class Hexa{
	public int validateHexaDec(String str) {
		int res=0;
		
		if(str.matches("(#)[A-F0-9]{8}"))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		return res;
		
	}
}
