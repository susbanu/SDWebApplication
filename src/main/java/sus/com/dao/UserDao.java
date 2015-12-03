package sus.com.dao;

import sus.com.entity.UserEntity;

public interface UserDao extends GenericDao<UserDao, Integer> {

	public String getUserNameByUserId(int id);
	
	public UserEntity findByUserName(String username);
}
