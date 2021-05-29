package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.AuthService;
import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.business.validationRules.Validator;
import eCommerceProject.core.abstracts.Verification;
import eCommerceProject.entities.concretes.User;

public class AuthManager implements AuthService{
	
	private UserService userService;
	private Verification verification;
	
	public AuthManager(UserService userService, Verification verification) {
		this.userService = userService;
		this.verification = verification;
	}
	
	@Override
	public void register(User user) {
		if(Validator.emailCheck(user.getEmail(), this.userService.getEmails()) && 
				Validator.nameCheck(user.getName()) && 
				Validator.nameCheck(user.getLastName()) &&
				Validator.passwordCheck(user.getPassword())){
			
			verification.verification(user);
			this.userService.add(user);
			
		}else {
			System.out.println("Registration is failed.");
		}
	}

	@Override
	public void login(String email, String password) {
		for (User user : this.userService.getAll()) {
			if(email.equals(user.getEmail()) && password.equals(user.getPassword())) {
				System.out.println("Succesfully logged in "+user.getName());
				return;
			}
		}
		System.out.println("Incorrect login. Please try again.");
	}

}
