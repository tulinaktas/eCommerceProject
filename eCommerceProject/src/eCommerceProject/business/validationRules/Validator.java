package eCommerceProject.business.validationRules;

import java.util.regex.Pattern;
import java.util.List;
import java.util.regex.Matcher;

public class Validator {
	
	static String emailRegex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	
	public static <T> boolean emailCheck(String email, List<T> usersEmail) {
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			if(!usersEmail.isEmpty()) {
				for (T _email : usersEmail) {
					if(!_email.equals(email)) {
						return true;
					}
				}
			}else {
				return true;
			}
		}
		return false;
	}
	
	public static boolean nameCheck(String name) {
		if(name.length()>=2) {
			return true;
		}
		return false;
	}
	
	public static boolean passwordCheck(String password) {
		if(password.length()>=6) {
			return true;
		}
		return false;
	}
}
