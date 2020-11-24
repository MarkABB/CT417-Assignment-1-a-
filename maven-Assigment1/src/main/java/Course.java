import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class Course {
	private String Name;
	 private String Code;
	 private  List<module> module = new ArrayList<module>();
	 private  List<Student> students = new ArrayList<Student>();
	 private DateTime start;
	 private DateTime end;
	 
	  public Course (String name, String code , String username, int startD , int startM, int startY, int endD , int endM, int endY   ){
	        this.Name = name;
	        this.Code =  code;
	        this.start = new DateTime(startD, startM, startY, 0, 0);;
	        this.end = new DateTime(endD, endM, endY, 0, 0);;
       }

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public List<module> getModule() {
		return module;
	}

	public void setModule(List<module> module) {
		this.module = module;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public DateTime getStart() {
		return start;
	}

	public void setStart(DateTime start) {
		this.start = start;
	}

	public DateTime getEnd() {
		return end;
	}

	public void setEnd(DateTime end) {
		this.end = end;
	}
}
