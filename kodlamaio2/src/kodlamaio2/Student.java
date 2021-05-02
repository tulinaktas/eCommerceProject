package kodlamaio2;

public class Student extends User {
	
	private int id;
	private String trainingCourse;
	
	public Student(int id, int userId, String name, String lastName, String email, String trainingCourse) {
		super(userId, name, lastName, email);
		this.id = id;
		this.trainingCourse = trainingCourse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrainingCourse() {
		return trainingCourse;
	}

	public void setTrainingCourse(String trainingCourse) {
		this.trainingCourse = trainingCourse;
	}
	
}
