package userOperations.core.abstracts;

import userOperations.entities.concretes.User;

public interface EmailValidationServices {

	void sendValidationEmailForUser(User user);
	
}
