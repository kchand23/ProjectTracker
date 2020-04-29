package ATS.software.ProjectTracker;

import javax.annotation.PostConstruct;
import javax.swing.JButton;


//Placeholder class to initialize JPanel whihc is controlled by Spring.
public class MainFrame extends javax.swing.JFrame {
	
    public MainFrame() {
        initComponents();
    }
    
    private void initComponents() {
    	
    	jPanel1 = new CustomJPanel();
    	add(jPanel1);

    }
    private CustomJPanel jPanel1;
}
