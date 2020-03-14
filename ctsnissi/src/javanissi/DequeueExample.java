package javanissi;
import java.util.*;

public class DequeueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue();
		PriorityQueue<Student> pq1=new PriorityQueue<Student>();
		Student s1=new Student("nissi",97);
		Student s2=new Student("jermy",77);
		Student s3=new Student("joel",27);
		Student s4=new Student("johanna",87);
		pq1.add(s1);
		pq1.add(s2);
		pq1.add(s3);
		pq1.add(s4);
		System.out.println(pq1);
		pq.add(10);
		pq.add(17);
		pq.add(7);
		pq.add(36);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.add(1);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		}

}
