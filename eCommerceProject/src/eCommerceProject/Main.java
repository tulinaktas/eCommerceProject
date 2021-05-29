package eCommerceProject;

import eCommerceProject.business.abstracts.AuthService;
import eCommerceProject.business.concretes.AuthManager;
import eCommerceProject.business.concretes.UserManager;
import eCommerceProject.core.concretes.EmailVerification;
import eCommerceProject.core.concretes.GoogleAuthManagerAdapter;
import eCommerceProject.dataAccess.concretes.InMemoryUserDao;
import eCommerceProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Tülin","Aktaþ","tulin-aktas","123456789");
		User user2 = new User(2,"tulin","Aktsdaaþ","tulintulin@hotmail.com","123456789");
		User user3 = new User(3,"Cemre","Özen","cemreozen@gmail.com","1234567890");
		
		AuthService authService = new AuthManager(new UserManager(new InMemoryUserDao()), new EmailVerification());
		AuthService googleAuthService = new GoogleAuthManagerAdapter();
		
		authService.register(user1);
		authService.register(user2);
		googleAuthService.register(user3);
		
		authService.login("tulin-aktas@hotmail.com", "123456789");
		authService.login("tulintulin@hotmail.com", "123456789");
		
		googleAuthService.login("cemreozen@gmail.com", "1234567890");
	}

}
