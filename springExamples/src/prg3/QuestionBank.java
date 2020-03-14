package prg3;

import java.util.Iterator;
import java.util.List;

public class QuestionBank {
	int id;
	String questions;
	List<String> answers;
	
	public QuestionBank(int id, String questions, List<String> answers) {
		super();
		this.id = id;
		this.questions = questions;
		this.answers = answers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public void showAnswers() {
		// TODO Auto-generated method stub
		 System.out.println(id+" "+questions);  
		 System.out.println("answers are:");  
		    Iterator<String> itr=answers.iterator();  
		    while(itr.hasNext()){  
		        System.out.println(itr.next());  
		    }  
	}
	

}
