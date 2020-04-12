package ATS.software.ProjectTracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
  
@Controller 
@RequestMapping(path="/demo")
public class MainController {
  @Autowired
  private UserRepository userRepository;

  
  //Give a form to add user details. 
  @GetMapping(path = "/addUser")
  public String addUser(Model model)
  {
	  model.addAttribute("user", new User());
	  return "user";
  }
  
  //After submitted button is pressed on the user form. 
  @PostMapping(path = "/addUser")
  public @ResponseBody String userFormSubmitted (@ModelAttribute User user) {
	    userRepository.save(user);
	    return "Saved";
	  }


  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userRepository.findAll();
  }
}