package javacamp_hw3;

public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " adl� ��renci eklendi.");
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adl� ��renci silindi.");
	}
}
