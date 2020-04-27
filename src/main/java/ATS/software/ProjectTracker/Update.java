package ATS.software.ProjectTracker;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Update {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "project_id", referencedColumnName = "id")
	 private Project project;
}
