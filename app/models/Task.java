package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
@Table(name="tasks222")
public class Task extends Model{
	@Id
	public Long id;

	public String name;

	public boolean done;

	public static Finder<Long,Task> find = new Finder<Long,Task>(
			Long.class, Task.class
			); 

	@Required
	public String label;


	public static List<Task> all() {
		return find.all();
	}

	public static void create(Task task) {
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}
	


}
