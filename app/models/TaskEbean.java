package models;

import java.util.Date;

import javax.persistence.Id;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

public class TaskEbean extends Model {
	  @Id
	  @Constraints.Min(10)
	  public Long id;
	  
	  @Constraints.Required
	  public String name;
	  
	  public boolean done;
	  
	  @Formats.DateTime(pattern="dd/MM/yyyy")
	  public Date dueDate = new Date();
	  
	  public static Finder<Long,Task> find = new Finder<Long,Task>(
	    Long.class, Task.class
	  ); 

}
