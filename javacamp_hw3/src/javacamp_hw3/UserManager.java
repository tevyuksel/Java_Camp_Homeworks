package javacamp_hw3;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " kullan�c�s� eklendi.");
		
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " kullan�c�s� silindi.");

	}
}
