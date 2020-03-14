package files;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FileBuffer2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int s1,s2,s3;
		int sum=0,avg;
		try(
				InputStreamReader isr= new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr))
		{
			/*System.out.println("Enter number of students::");
			Integer n=br.read();
			System.out.println("Enter students name:");
			String[] name=new String[n];
			for(int i=0;i<n;i++)
			{
				name[i]=br.readLine();
			}
			System.out.println(name[n]);*/
			System.out.println("Enter subject1 marks ");
			s1=Integer.parseInt(br.readLine());

			System.out.println("Enter subject2 marks ");
			s2=Integer.parseInt(br.readLine());

			System.out.println("Enter subject3 marks ");
			s3=Integer.parseInt(br.readLine());

			sum=(s1+s2+s3);
			avg=sum/3;
			System.out.println("sum is: "+sum+" avg is : "+avg);
			}
		}

	}


