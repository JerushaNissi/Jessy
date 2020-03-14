package prg3;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QBMap {
	private int id;  
	private String question;  
	private Map<String,String> answers;
	
	public QBMap(int id, String question, Map<String, String> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return question;
	}
	public void setName(String name) {
		this.question = name;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}  

	public void showAnswers() {
		// TODO Auto-generated method stub
		System.out.println("question id:"+id);  
	    System.out.println("question name:"+question);  
	    System.out.println("Answers....");  
	    Set set=answers.entrySet();
	    Iterator itr=set.iterator();
		    while(itr.hasNext()){  
		    	Map.Entry e=(Map.Entry) itr.next();
		    	System.out.println("Answer:"+e.getKey()+" Posted By:"+e.getValue());  
		    }        
		}  
}
