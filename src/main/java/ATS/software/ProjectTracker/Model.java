package ATS.software.ProjectTracker;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Model {
  @Id @GeneratedValue long id;
  private String name;

  private String projectId;

  @OneToMany(mappedBy = "model")
  private Set<Update> updates;

	public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public Set<Update> getUpdates() {
	return updates;
}

public void setUpdates(Set<Update> updates) {
	this.updates = updates;
}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProjectId() {
		return projectId;
	}
	
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
}