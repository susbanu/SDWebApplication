package sus.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import sus.com.model.RoleModel;
import sus.com.model.UserModel;

@Component("myUserDetailsService")
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		UserModel users = userService.findByUserName(username);
		List<GrantedAuthority> authorities = null;
		if (users != null) {
			authorities = buildUserAuthority(users.getRoleModels());
		} else {
			throw new UsernameNotFoundException("{user_not_found}");
		}
		return buildUserForAuthentication(users, authorities);
	}
	
	// Converts sus.com.entity.Users users to org.springframework.security.core.userdetails.User
	private User buildUserForAuthentication(UserModel users, List<GrantedAuthority> authorities) {
		return new User(users.getUserName(), users.getPassword(), users.isEnabled(), true, true, true, authorities);
	}

	private List<GrantedAuthority> buildUserAuthority(List<RoleModel> userRoles) {
		List<GrantedAuthority> setAuths = new ArrayList<GrantedAuthority>();

		for (RoleModel userRole : userRoles) {
			setAuths.add(new SimpleGrantedAuthority(userRole.getRoleName()));
		}
		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);
		return Result;
	}
}
