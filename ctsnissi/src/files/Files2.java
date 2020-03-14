package files;
import java.io.*;
import java.util.*;

public class Files2 {

	public static void main(String[] args) throws IOException,FileNotFoundException{
		// TODO Auto-generated method stub
		try(InputStreamReader cin = new InputStreamReader(System.in);
				FileOutputStream fout =new FileOutputStream("C:\\Users\\Admin\\Desktop\\files\\file1.txt");)
		{
				System.out.println("Enter character 'q' to exit");
				char c;
				do {
					c=(char)cin.read();
					fout.write(c);
				}while(c!='q');
		}
		catch(FileNotFoundException fn)
		{
			System.out.println("file not exists");
		}catch(IOException io) {
			System.out.println(io);
		}

	}
}