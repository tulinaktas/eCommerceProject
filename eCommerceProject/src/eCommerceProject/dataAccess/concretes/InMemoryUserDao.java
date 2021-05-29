package eCommerceProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	List<String> emails = new ArrayList<String>();
	
	/*@Override
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
*/
	@Override
	public List<String> getEmails() {
		System.out.println(users);
		for (int i=0; i<users.size(); i++) {
			this.emails.add(users.get(i).getEmail());
		}
		return this.emails;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("User added "+user.getName());
	}

	@Override
	public void delete(User user) {
		for (User _user : users) {
			if(user.equals(_user)) {
				users.remove(user);
			}
		}
		System.out.println("User deleted.");
	}

	@Override
	public void update(User user) {
		System.out.println("User updated.");
	}


}
