
public class ThreadExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{
			for(int i=0;i<10;i++)
				System.out.println(i);
		};
		ThreadExample th = new ThreadExample();
		//th.start();
	}

}
