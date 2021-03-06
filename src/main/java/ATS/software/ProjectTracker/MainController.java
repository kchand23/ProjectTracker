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
@RequestMapping(path="/admin")
public class MainController {
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private ProjectRepository projectRepository;
  @Autowired
  private ModelRepository modelRepository; 
  
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


  @GetMapping(path="/allUsers")
  public @ResponseBody Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userRepository.findAll();
  }
  
  
  
//Give a form to add user details. 
  @GetMapping(path = "/addProject")
  public String addProject(Model model)
  {
	  model.addAttribute("project", new Project());
	  return "project";
  }
  
  //After submitted button is pressed on the user form. 
  @PostMapping(path = "/addProject")
  public @ResponseBody String projectFormSubmitted (@ModelAttribute Project project) {
	    projectRepository.save(project);
	    return "Saved";
	  }


  @GetMapping(path="/allProjects")
  public @ResponseBody Iterable<Project> getAllProjects() {
    // This returns a JSON or XML with the users
    return projectRepository.findAll();
  }
  
  @GetMapping(path="/addModel")
  public @ResponseBody Iterable<Project> addModel() {
    // This returns a JSON or XML with the users
    return projectRepository.findAll();
  }
  
  
}