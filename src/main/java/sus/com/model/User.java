package sus.com.model;

public class User {

	private String userName ;
	private String firstName ;
	
	public User(String userName, String firstName) {
		this.userName = userName;
		this.firstName = firstName;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
