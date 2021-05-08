package javacamp_hw3;

public class Main {

	public static void main(String[] args) {

		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Tevhid");
		user1.setLastName("Yüksel");
		user1.setEmail("ty@ty.com");
		user1.setPassword("123");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setFirstName("Şevval");
		instructor1.setLastName("Yüksel");
		instructor1.setInstructorNo(1);
		instructor1.setEmail("sy@sy.com");
		instructor1.setPassword("456");
		instructor1.setSalary(1000);
		
		Student student1 = new Student();
		student1.setId(3);
		student1.setFirstName("Evra");
		student1.setLastName("Yüksel");
		student1.setStudentNo(1);
		student1.setEmail("ey@ey.com");
		student1.setPassword("789");
		student1.setScore(99);
		
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		userManager.delete(user1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.delete(student1);
		
	}

}
