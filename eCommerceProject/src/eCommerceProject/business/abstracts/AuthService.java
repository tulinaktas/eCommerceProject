package eCommerceProject.business.abstracts;

import eCommerceProject.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(User user);
}
