package kodlamaio2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getName()+" eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getName()+" silindi");
	}
}
