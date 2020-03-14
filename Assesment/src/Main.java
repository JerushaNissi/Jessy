import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Associate associate=new Associate();
		    Scanner sc=new Scanner(System.in);
		    int id,no_of_days;
		    String associateName;
		    System.out.println("Enter the associate id:");
		    id=sc.nextInt();
		    System.out.println("Enter the associate name:");
		    associateName=sc.next();
		    System.out.println("Enter the number of days:");
		    no_of_days=sc.nextInt();
		    
		    associate.trackAssociateStatus(no_of_days);
	}

}
