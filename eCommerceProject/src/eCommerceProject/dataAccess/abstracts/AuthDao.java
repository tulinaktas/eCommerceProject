package eCommerceProject.dataAccess.abstracts;

import java.util.List;

import eCommerceProject.entities.concretes.User;

public interface AuthDao {
	void register(User user);
	void login(User user);
	List<String> getEmails();
	List<User> getAll();
}
