package javanissi;
import java.util.Scanner;

public class AssPrg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number::");
		int num=sc.nextInt();
		int sum = 0,rem=0;
		while(num>0)
		{
			rem=num%10;
			if((rem%2)==0)
			{
				sum=sum+rem;
			}
			num=num/10;
		}
		if(sum%2==0)
			System.out.println("The sum of given even numbers is:"+sum);
		else
			System.out.println("The sum of given odd numbers is:"+sum);
	}

	}


