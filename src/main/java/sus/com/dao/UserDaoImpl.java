package sus.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import sus.com.entity.UserEntity;


@Repository("userDao")
public class UserDaoImpl extends AbstractDao<UserDao, Integer> implements UserDao {

	private static final long serialVersionUID = 1L;
	
	public UserDaoImpl(){
		setClazz(UserDao.class);
	}

	@Override
	public String getUserNameByUserId(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from UserEntity u where u.id = :id");
		query.setParameter("id",id);
		List<UserEntity> userList = query.list();
		if(userList != null && userList.size()>0){
			return userList.get(0).getUsername();
		}
		return null;
	}

	@Override
	public UserEntity findByUserName(String username) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from UserEntity u where u.username= :username");
		query.setParameter("username",username);
		List<UserEntity> userList = query.list();
		if(userList != null && userList.size()>0){
			return userList.get(0);
		}
		return null;
	}

	
}
