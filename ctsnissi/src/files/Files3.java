package files;
import java.io.*;
import java.util.*;

public class Files3 {
	public static void main(String[] args) throws IOException , FileNotFoundException{
		char ch;
		int x;
		try(FileReader fin = new FileReader("C:\\Users\\Admin\\Desktop\\files\\file1.txt");
				FileWriter fout = new FileWriter("C:\\Users\\Admin\\Desktop\\files\\file2.txt"))
		{
			x=fin.read();
			while(x!=-1) {
				ch=(char)x;
				fout.write(ch);
				System.out.println(ch);
				x=fin.read();
			}
		}
	}

}
