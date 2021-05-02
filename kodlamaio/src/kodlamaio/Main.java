package kodlamaio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course[] courses = {
				new Course(1,"Java","Engin Demiroğ"), 
				new Course(2,"C#","Engin Demiroğ")
				};
		
		User[] users = {
				new User(1,"Tülin","Aktaş","tulin-aktas@hotmail.com"),
				new User(2,"Halil Can","Yurtman","halilyurtman@gmail.com")
		};
		
		UserManager userManager = new UserManager();
		
		
		for (User user : users) {
			System.out.println(user.getName()+" "+user.getLastName()+" "+user.getEmail());
			userManager.add(user);
		}
		
		for (Course course : courses) {
			System.out.println(course.getName()+" "+course.getInstructorName());
		}
		
		
	}

}
