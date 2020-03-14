package javanissi;

import java.util.Scanner;

public class AssPrg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array::");
		int num = sc.nextInt();
		long sum=0;
		int[]arr=new int[num];
	 	System.out.println("Enter the elements::");
		for(int i=0;i<num;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			sum=(long)(sum+Math.pow(arr[i],i));
		}
		System.out.println("Sum of elements is::"+sum);

	}
}

