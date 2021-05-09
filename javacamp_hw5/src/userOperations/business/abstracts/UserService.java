package userOperations.business.abstracts;

import userOperations.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void login(String email, String password);
	void checkMail(String email);

}
