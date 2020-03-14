package files;
import java.io.*;

public class Files1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
		FileInputStream fis=new FileInputStream("test.txt");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop");
		char ch;
		int i;
		while((i=fis.read())!=-1)
		{
			ch=(char)i;
			System.out.println(ch);
		}
		fis.close();
		fos.close();
		}catch(FileNotFoundException fn)
		{
			System.out.println("file not exists");
		}catch(IOException io) {
			System.out.println(io);
		}
	}

}
