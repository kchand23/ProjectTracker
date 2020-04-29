package ATS.software.ProjectTracker;

import java.awt.EventQueue;

import javax.annotation.PostConstruct;
import javax.swing.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SwingApp implements CommandLineRunner  {
	
	public static void main(String[] args) {

		
		new SpringApplicationBuilder(SwingApp.class)
        .headless(false).run(args);

    }
	
	@Override
    public void run(String... args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
	
}
