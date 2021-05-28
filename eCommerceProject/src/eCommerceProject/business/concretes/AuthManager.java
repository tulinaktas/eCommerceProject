package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.AuthService;
import eCommerceProject.business.validationRules.Validator;
import eCommerceProject.core.concretes.EmailVerification;
import eCommerceProject.dataAccess.abstracts.AuthDao;
import eCommerceProject.entities.concretes.User;

public class AuthManager implements AuthService{
	
	private AuthDao authDao;
	private EmailVerification emailVerification;
	
	public AuthManager(AuthDao authDao, EmailVerification emailVerification) {
		this.authDao = authDao;
		this.emailVerification = emailVerification;
	}
	
	@Override
	public void register(User user) {
		if(Validator.emailCheck(user.getEmail(), authDao.getEmails()) && 
				Validator.nameCheck(user.getName()) && 
				Validator.nameCheck(user.getLastName()) &&
				Validator.passwordCheck(user.getPassword())){
			
			authDao.register(user);
			emailVerification.verification(user);
		}else {
			System.out.println("Registration is failed.");
		}
	}

	@Override
	public void login(User user) {
		authDao.login(user);
	}

}
