package ATS.software.ProjectTracker;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity // This tells Hibernate to make a table out of this class
public class User {
  private String name;

  private String email;
  
  @Id
  private String initials;

  public String getInitials() {
	return initials;
  }

  public void setInitials(String initials) {
	this.initials = initials;
  }

  
  @OneToMany(mappedBy = "user")
  private Set<Update> updates;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}