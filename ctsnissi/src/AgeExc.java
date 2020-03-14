
import java.util.Scanner;

 class InvalidAgeException extends Exception{

public InvalidAgeException()
{
super("Age can't be negative...error !!!");
}

}
 class InsufficientAgeException extends Exception
 {

public InsufficientAgeException()
{
super("Age is not sufficient for voting");
}
}

public class AgeExc
{

public static void main(String[] args)
{


Scanner sc =new Scanner(System.in);

System.out.println("Enter your Age ");
int n=sc.nextInt();
try
{

if(n<0)
{
throw new InvalidAgeException();
}
else if(n<18)
{
throw new InsufficientAgeException();
}
else
{
System.out.println("Your are Eligible for Voting ...! Congrats");
}
}


catch(InsufficientAgeException iae)
{
System.out.println(iae);
}
catch(InvalidAgeException e)
{
System.out.println(e);
}


}

}
