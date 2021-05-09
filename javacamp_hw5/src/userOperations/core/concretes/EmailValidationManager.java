package userOperations.core.concretes;

import userOperations.core.abstracts.EmailValidationServices;
import userOperations.entities.concretes.User;

public class EmailValidationManager implements EmailValidationServices {

	@Override
	public void sendValidationEmailForUser(User user) {
		
		System.out.println(user.getEmail() + " adresinize doðrulama maili gönderildi.");	
        
        System.out.println(user.getEmail() + " adresinize gönderilen doðrulama mailine týklayýnýz.");		
	}

}
