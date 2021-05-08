package exam;

public class Main {
	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C#", "Nitelikli");
		Course course2 = new Course(2, "Java", "Nitelikli");		
		Course[] courses = {course1, course2};
		for (Course course : courses) {
			System.out.println(course.detail + " " + course.name + " kursuna ho�geldin!");
		}	
		
		Exam exam1 = new Exam(1, "Ev �devi", "Yap�ld�!");
		Exam exam2 = new Exam(2, "Kurs �devi", "Yap�l�yor!");		
		Exam[] exams = {exam1, exam2};
		for (Exam exam : exams) {
			System.out.println(exam.id + " numaral� " + exam.name + " " + exam.status);
			
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.courseStatus(course1);
		courseManager.courseCertificate(course1);
		
		courseManager.courseStatus(course2);
		courseManager.courseCertificate(course2);		
	}
}
