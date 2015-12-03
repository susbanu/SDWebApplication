package sus.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sus.com.dao.UserDao;
import sus.com.entity.UserEntity;
import sus.com.model.RoleModel;
import sus.com.model.UserModel;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserModel getUserById(int id) {
		System.out.println("Inside getUserById(int id) ");
		UserEntity userEntity = (UserEntity) userDao.getById(id);
		UserModel userModel = convertEntityToModel(userEntity);
		return userModel;
	}

	@Override
	public String getUserNameByUserId(int id) {
		String userName = userDao.getUserNameByUserId(id);
		return userName;
	}

	@Override
	public UserModel findByUserName(String username) {
		UserEntity userEntity = userDao.findByUserName(username);
		UserModel userModel = convertEntityToModel(userEntity);
		return userModel;
	}
	
	private UserModel convertEntityToModel(UserEntity userEntity) {
		UserModel userModel = null;
		
		if (userEntity != null) {
			userModel = new UserModel();
			
			userModel.setUserId(userEntity.getUserId());
			userModel.setUserName(userEntity.getUsername());
			userModel.setPassword(userEntity.getPassword());
			userModel.setEnabled(userEntity.isEnabled());
			//userModel.setCity(userEntity.getCity());
			//userModel.setCountry(userEntity.getCountry());
			List<RoleModel> roleModels = new ArrayList<RoleModel>();
			if (userEntity.getRoleEntity() != null) {
				for (int i=0; i < userEntity.getRoleEntity().size(); i++) {
					RoleModel roleModel = new RoleModel();
					roleModel.setRoleName(userEntity.getRoleEntity().get(i).getRoleName());
					roleModel.setRoleId(userEntity.getRoleEntity().get(i).getRoleId());
					roleModels.add(roleModel);
				}
			}
			userModel.setRoleModels(roleModels);
		}
		userEntity = null;
		return userModel;
	}
	
	 @Override
	 public UserModel getCurrentUser() {
	        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	        UserModel userModel = null;
	        if (principal instanceof UserModel) {
	        	userModel = (UserModel) principal;
	        }
	        return userModel;
	 }

	 @Override
	 public UserModel lostPassword(String email){
		return null;

	 }

	@Override
	public void saveUser(UserModel userModel) {
		
		
		
	}
	 
	 
	 
}
