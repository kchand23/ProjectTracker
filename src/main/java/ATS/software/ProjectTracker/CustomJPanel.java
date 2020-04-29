package ATS.software.ProjectTracker;

import java.awt.GridLayout;

import javax.swing.JLabel;

import org.springframework.beans.factory.annotation.Autowired;


//Panel which is controlled by Spring, and therefore repositories can be used. 
public class CustomJPanel extends javax.swing.JPanel{
    @Autowired
    private UserRepository userRepository;
    
    public CustomJPanel(){
        BeanProvider.autowire(this); //use someRepository somewhere after this line.
        setLayout(new GridLayout());
        add( new JLabel(userRepository.findAll().iterator().next().getName()) );
        
    }
}