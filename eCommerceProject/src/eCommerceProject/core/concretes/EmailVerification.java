package eCommerceProject.core.concretes;

import eCommerceProject.core.abstracts.Verification;
import eCommerceProject.entities.concretes.User;

public class EmailVerification implements Verification{

	@Override
	public void verification(User user) {
		// TODO Auto-generated method stub
		String link ="www.asdasdasd.com";
		System.out.println("Verification e-mail sended from "+user.getEmail()+"and link: "+link);
	}

}
