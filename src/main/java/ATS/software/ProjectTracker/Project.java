package ATS.software.ProjectTracker;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Project {
  private String name;
  
  @Id
  private String id;

  private java.sql.Date startDate;
  private java.sql.Date endDate;
 
}
