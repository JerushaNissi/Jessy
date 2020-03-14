package files;
import java.io.*;

public class FileBuffer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(
				InputStreamReader isr= new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr))
		{
			System.out.println("Enter your name::");
			String name=br.readLine();
			System.out.println("Enter your city::");
			String city=br.readLine();
			System.out.println("Name::"+name);
			System.out.println("city::"+city);
		}
	}

}
