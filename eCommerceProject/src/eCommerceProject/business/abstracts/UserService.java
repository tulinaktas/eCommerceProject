package eCommerceProject.business.abstracts;

import java.util.List;

import eCommerceProject.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	List<String> getEmails();
	List<User> getAll();
}
