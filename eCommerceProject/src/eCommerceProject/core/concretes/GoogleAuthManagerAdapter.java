package eCommerceProject.core.concretes;

import eCommerceProject.business.abstracts.AuthService;
import eCommerceProject.entities.concretes.User;
import eCommerceProject.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

	@Override
	public void register(User user) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.register(user.getEmail(), user.getPassword());
	}

	@Override
	public void login(String email, String password) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(email, password);
	}

}
