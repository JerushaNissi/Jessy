package javanissi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mapex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of entries::");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		 System.out.println("Enter the year");
		 int year=sc.nextInt();
		 System.out.println("Enter no.of admissions");
		 int noad=sc.nextInt();
		 hm.put(year,noad);
		}
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		int max=0;
		Integer tyear=0,temp=0;
		while(itr.hasNext())
		{
		Map.Entry entry = (Map.Entry)itr.next();
		temp=(Integer) entry.getValue();
		if(temp>max)
		{
		max=temp;
		tyear= (Integer)entry.getKey();

		}
		}
		System.out.println("The details of maximum admission are:");
		System.out.println("year::"+tyear+" " +"number of admissions::"+max);

		}
	}


