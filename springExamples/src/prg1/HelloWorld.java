package prg1;

public class HelloWorld {
	
	String message;

	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Message:"+message);
	}

	
	public void stopMethod() {
		System.out.println("stopped");
	}
}
