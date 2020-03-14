package BookMain;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dto.Book;
import net.codejava.javaee.bookstore.BookDao;

public class TestBook {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BookDao dao=new BookDao("jdbc:mysql://localhost:3306/nissi","root","root");
		dao.connect();
		Book book = new Book(1007,"Jav","James",5670);
		int ch=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("************CURD OPERATIONS***********");
			System.out.println("1.Insert Book");
			System.out.println("2.Update Book");
			System.out.println("3.Delete Book");
			System.out.println("4.Show All Books");
			System.out.println("5.Exit");
			System.out.println("Enter your choice::");
			ch=sc.nextInt();
			switch(ch) {
			case 1: 
				int id=sc.nextInt();
				String name=sc.next();
				String auth=sc.next();
				Float price =sc.nextFloat();
				Book book2 =new Book(id,name,auth,price);
				dao.insertBook(book2);
				System.out.println("Book Inserted");
				break;
			case 2:
				System.out.println("Enter id u want to change::");
				int idd=sc.nextInt();
				int id1=sc.nextInt();
				String name1=sc.next();
				String auth1=sc.next();
				Float price1 =sc.nextFloat();
				Book book3 =new Book(id1,name1,auth1,price1);
				dao.updateBook(book3);
				System.out.println("Book Updated");
				break;
			case 3:
				System.out.println("Enter id u want to change::");
				int id2=sc.nextInt();
				Book book4 =new Book(id2);
				dao.deleteBook(book4);
				System.out.println("Book Deleted");
				break;
			case 4: 
				List<Book> books=dao.listAllBooks();
		        for(Book b:books)
		        {
		        	System.out.println(b.getTitle()+" "+b.getAuthor());
		        }
		       break;
			case 5: System.exit(0);
			default:System.out.println("Enter a avlid option");
		       break;

			}
		}
	}
}
