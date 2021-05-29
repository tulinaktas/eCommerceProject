package eCommerceProject.business.concretes;

import java.util.List;

import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		this.userDao.add(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
	}

	@Override
	public List<String> getEmails() {
		return this.userDao.getEmails();
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

}
