package ATS.software.ProjectTracker;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Update {
	 @EmbeddedId private UpdateId id;
	 
	 @ManyToOne @MapsId("userId")
	 private User user;
	 @ManyToOne @MapsId("projectId")
	 private Project project;
	 @ManyToOne @MapsId("modelId")
	 private Model model;
	 
	 
	public Update() {
		id = new UpdateId();
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	 
}


