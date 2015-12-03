package sus.com.service;

import sus.com.model.UserModel;

public interface UserService {

	public UserModel getUserById(int id);
	
	public String getUserNameByUserId(int id);

	public UserModel findByUserName(String username);
	
	public UserModel getCurrentUser();
	
	public UserModel lostPassword(String email);
	
	public void saveUser(UserModel userModel);
	
}
