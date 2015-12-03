package sus.com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sus.com.model.UserModel;
import sus.com.service.UserService;


@Controller
@RequestMapping("/home")
public class HomeController {
    

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/showhomepage.htm", method = RequestMethod.GET)
	public String showHomePage(Model model,@RequestParam(value = "error", required = false) String error,
							   @RequestParam(value = "logout", required = false) String logout){

		if (error != null) {
			model.addAttribute("error", "Invalid username and password!");
		}
 
		if (logout != null) {
			model.addAttribute("msg", "You've been logged out successfully.");
		}
		
		return "home";
	}
	
	
	@RequestMapping(value = "/admin**.htm", method = RequestMethod.GET)
	public String adminPage(Model model) {
 
		model.addAttribute("title", "Spring Security Custom Login Form");
		model.addAttribute("message", "This is protected page!");
		
 
		return "admin";
 
	}
	
	@RequestMapping(value = "/403.htm", method = RequestMethod.GET)
	public String errorPage(Model model) {
 
		return "403";
 
	}
	
	@RequestMapping("/registration")
	public String showUserRegistration(@ModelAttribute("userModel") UserModel userModel) {
		return "register";
	}
	
	@RequestMapping("/saveuser")
	public String saveUser(@ModelAttribute("userModel") UserModel userModel, HttpServletRequest request, Model model) {
		
		System.out.println("Save user called");
		/*String userName = userModel.getUserName();
		String loginFailMsg = null;
		boolean checkuser = userService.checkValidateuserName(userName);
		if(checkuser){
			loginFailMsg = "User Already Exist";
			model.addAttribute("loginFailMsg", loginFailMsg);
			return "forward:registration.htm";
		}else{
			userService.addUser(user);
		}		*/
		return "user/login";
	}
	
	
	/*@RequestMapping(value="/showRegisterPage.htm")
	public String showRegisterPage(Model model){
		return "register";
	}
	
	 @RequestMapping("/page.htm")    
     public String page(@RequestParam(value="pageNo") String pageNo,HttpServletRequest request) {  
      System.out.println("PageNo: " + pageNo);
      request.setAttribute("pageNo", pageNo);  
	      if(pageNo.equals("1")){
	    	  return "firstpage";  
	      }else if(pageNo.equals("2")){
	    	  return "secondpage";    
	      }else{
	    	  return "page";    
	      }
     }
	 
	 @RequestMapping(value = "/homeftl", method = RequestMethod.GET)
	 public String index(Model model) {
		 model.addAttribute("username", "Sushant");
		 
         return "indexftl";
	 }
	 
	 @RequestMapping(value = "/submitCkeditor", method = RequestMethod.GET)
	 public String submitCkeditor(Model model,HttpServletRequest request) {
		 System.out.println(" Inside submitCkeditor --"+request.getParameter("editor1"));
		 //CKEditorInsertTag insertTag
		 return "secondpage";
	 }*/
}
