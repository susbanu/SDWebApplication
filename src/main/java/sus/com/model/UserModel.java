package sus.com.model;

import java.util.List;

public class UserModel {

	private long userId;
	private String userName;
	private String password;
	private boolean enabled;
	private String city;
	private String country;
	private List<RoleModel> roleModels; 
	
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
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<RoleModel> getRoleModels() {
		return roleModels;
	}
	public void setRoleModels(List<RoleModel> roleModels) {
		this.roleModels = roleModels;
	}
	
}
