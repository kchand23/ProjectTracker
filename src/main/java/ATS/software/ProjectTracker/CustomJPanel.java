package ATS.software.ProjectTracker;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JLabel;

import org.springframework.beans.factory.annotation.Autowired;




//Panel which is controlled by Spring, and therefore repositories can be used. 
public class CustomJPanel extends javax.swing.JPanel{
    @Autowired
    private UserRepository userRepository;
    private JComboBox c1;
    
    private String[] getNames(List<User> lst)
    {
    	
    	
    	List<User> users = userRepository.findAll();
    	String[] s= new String[users.size()];
    	
    	for(int i = 0; i < users.size(); i++)
    	{
    		s[i] = users.get(i).getName();
    	}
    	
    	return s;
    }
    
    public CustomJPanel(){
    	
    	
    	BeanProvider.autowire(this); //use someRepository somewhere after this line.
    	c1 = new JComboBox(getNames(userRepository.findAll()));
        
        setLayout(new GridLayout());
        add(c1);
        
    }
}