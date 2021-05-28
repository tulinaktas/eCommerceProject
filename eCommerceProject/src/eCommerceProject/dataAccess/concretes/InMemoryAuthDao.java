package eCommerceProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceProject.dataAccess.abstracts.AuthDao;
import eCommerceProject.entities.concretes.User;

public class InMemoryAuthDao implements AuthDao{
	
	List<User> users = new ArrayList<User>();
	List<String> emails;
	
	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Registration is successfully."+user.getName());
	}
	
	@Override
	public void login(User user) {
		for (int i=0; i<users.size(); i++) {
			if(users.get(i).getEmail().equals(user.getEmail()) && users.get(i).getPassword().equals(user.getPassword())) {
				System.out.println("Login to system "+ users.get(i).getName());
				return;
			}
			System.out.println("Couldn't login, try again");
		}
	}

	@Override
	public List<String> getEmails() {
		for (int i=0; i<users.size(); i++) {
			emails.add(users.get(i).getEmail());
		}
		return emails;
	}

	@Override
	public List<User> getAll() {
		return null;
	}


}
