package userOperations;

import userOperations.business.concretes.UserManager;
import userOperations.core.concretes.EmailValidationManager;
import userOperations.core.concretes.LoginControllerManager;
import userOperations.core.concretes.jGoogleAdapter;
import userOperations.dataAccess.concretes.DataUserDao;
import userOperations.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "Tevhid", "Yüksel", "tev@gmail.com", "24240000");
		User user2 = new User(2, "Þevval", "Yüksel", "sev@gmail.com", "24240000");
		User user3 = new User(3, "Erva", "Yüksel", "er@gmail.com", "24240000");
		User user4 = new User(4, "Çarli", "Yüksel", "car@gmail.com", "24240000");

	

		UserManager userManager =  new UserManager(new LoginControllerManager(),new DataUserDao(),new EmailValidationManager(),new jGoogleAdapter());
		
		userManager.register(user1);
		
		System.out.println("--------------------------");
		
		userManager.login("tev@gmail.com", "24240000");
		
		DataUserDao dataUserDao = new DataUserDao();
		dataUserDao.update(user4);
		dataUserDao.delete(user4);
		
		System.out.println("--------------------------");

	}

}
