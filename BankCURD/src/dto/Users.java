package dto;

public class Users {
	String uname;
	String passwd;
	//constructer
	public Users(String uname, String passwd) {
		super();
		this.uname = uname;
		this.passwd = passwd;
	}
	//getters and setters
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	//to string
	@Override
	public String toString() {
		return "Users [uname=" + uname + ", passwd=" + passwd + "]";
	}
}
