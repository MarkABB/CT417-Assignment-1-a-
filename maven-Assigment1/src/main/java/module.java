import java.util.ArrayList;
import java.util.List;

public class module {
	 private String Name;
	 private int ID;
	 private  List<Course> course = new ArrayList<Course>();
	 private  List<Student> students = new ArrayList<Student>();
	 
	  public module(String name, int id , String username ){
	        this.Name = name;
	        this.ID =  id;
	        
	    }

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	 
}
