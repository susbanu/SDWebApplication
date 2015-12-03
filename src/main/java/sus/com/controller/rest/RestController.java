package sus.com.controller.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sus.com.model.UserModel;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	@RequestMapping(value = "/getMessage.json", method = RequestMethod.GET)
	public String getMessage() {
		return "Tarkik Shah";
	}
	
	/*@RequestMapping(value = "/getObj.json", method = RequestMethod.GET)
	public UserModel getObj() {
		return new UserModel("tarkik","tarkik") ;
		
	}
	
	@RequestMapping(value = "/getList.json", method = RequestMethod.GET)
	public List<UserModel> listUsers() {
		List<UserModel> listUsers = new ArrayList<UserModel>();
		listUsers.add(new UserModel("tarkik","tarkik"));
		listUsers.add(new UserModel("sushant","sushant"));
		return listUsers;
	}*/
	
	@RequestMapping(value = "/storeObj.json", method = RequestMethod.POST, produces={"application/json", "application/xml"})
	public @ResponseBody UserModel storeObj(@RequestBody UserModel user) {
		 
		/*User myUser = user ;*/
		System.out.println(user.getUserId());
		System.out.println(user.getUserName());
//		myUser.setFirstName("test from java");
		return user;
	}
	
}
	
