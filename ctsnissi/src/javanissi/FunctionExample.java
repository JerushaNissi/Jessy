package javanissi;
import java.util.function.*;
class User{
	String uid;
	String pwd;
	
	public User(String uid,String pwd) 
 	{
	 Super();
	 this.uid=uid;
	 this.pwd=pwd;
 	}

	private void Super() {
		// TODO Auto-generated method stub
		
	}
}
public class FunctionExample {
	public static void main(String[] args) {
		/*Function<String,Integer> f1 =s ->s.length();
		System.out.println(f1.apply("India"));
		Function<Integer,Integer> f2 =n->n*n;
		System.out.println(f2.apply(7));
		Function<Integer,Integer> fact=x->{
			int f=1;
				for(int i=2;i<=x;i++)
				f=f*i;
				return f;
		};
		System.out.println(fact.apply(6));
		Function<String,Integer> f3 =str ->{
			int count=0;
			for(int i=0;i<str.length();i++)
				if(str.charAt(i)!=' ')
					count++;
			return count;
		};
		System.out.println(f3.apply("Nissi is good"));*/
		
		User u1=new User("admin","1234");
		User u2=new User("Nissi","9977");
		Function<User,String> user=	u->{
			if(u.uid.equals("admin") && u.pwd.equals("1234"))
				//if(user.apply(u2))
				return "Valid";
			else
				return "Invalid";
			
			};
			System.out.println(user.apply(u2));
	}

	}

	