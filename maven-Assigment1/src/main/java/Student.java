import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class Student {
	
 private String Name;
 private int Age;
 private String Username;
 private DateTime DOB;
 private  List<Course> course = new ArrayList<Course>();
 private List<Module> modules = new ArrayList<Module>();

    public Student(String name, int age ,  int BirthD , int BirthM, int BirthY ){
        this.Name = name;
        this.Age =  age;
        this.setDOB(new DateTime(BirthD, BirthM, BirthY, 0, 0));;
       
    }
	
    public String getUsername() {
      Username = Name + Integer.toString(Age);
        return Username;
    }

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	} 
	

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public DateTime getDOB() {
		return DOB;
	}

	public void setDOB(DateTime dOB) {
		DOB = dOB;
	} 
  
}
