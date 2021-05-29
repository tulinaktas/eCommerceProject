package eCommerceProject.googleAuth;

public class GoogleAuthManager {
	public void register(String email, String password) {
		System.out.println("Signed up with google account "+ email);
	}
	
	public void login(String email, String password) {
		System.out.println("Signed in with google account "+ email);
	}
}
