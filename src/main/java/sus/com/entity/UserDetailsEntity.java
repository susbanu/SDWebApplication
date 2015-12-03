package sus.com.entity;

public class UserDetailsEntity {

	private long userId;
	private String userName;
	private String country;
	private String email;
	private long totalGamePoints;
	private String achivement;
	private long score;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTotalGamePoints() {
		return totalGamePoints;
	}
	public void setTotalGamePoints(long totalGamePoints) {
		this.totalGamePoints = totalGamePoints;
	}
	public String getAchivement() {
		return achivement;
	}
	public void setAchivement(String achivement) {
		this.achivement = achivement;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
}
