package kodlamaio2;

public class Instructor extends User {

	private int id;
	private String course;
	
	public Instructor(int id, int userId, String name, String lastName, String email, String course) {
		super(userId, name, lastName, email);
		this.id = id;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	

}
