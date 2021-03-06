package ATS.software.ProjectTracker;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity // This tells Hibernate to make a table out of this class
public class Project {
  private String name;
  
  @Id
  private String id;

  private java.sql.Date startDate;
  private java.sql.Date endDate;
  
  @OneToMany(mappedBy = "project")
  private Set<Update> updates;
  
  
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
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public java.sql.Date getStartDate() {
	return startDate;
}
public void setStartDate(java.sql.Date startDate) {
	this.startDate = startDate;
}
public java.sql.Date getEndDate() {
	return endDate;
}
public void setEndDate(java.sql.Date endDate) {
	this.endDate = endDate;
}
  
}
