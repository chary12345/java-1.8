package practice;

public class StudentPojo {
	
	private int id;
	private String name;
	private String college;
	@Override
	public String toString() {
		return  id +" " + name+" " + college+" " + marks ;
	}
	private int marks;
	public int getId() {
		return id;
	}
	public StudentPojo(int id, String name, String college, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.marks = marks;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	

}
