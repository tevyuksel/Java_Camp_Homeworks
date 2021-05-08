package javacamp_hw3;

public class Instructor extends User {
	
	private int instructorNo;
	private int salary;
	
	public Instructor() {
		
	}
	
	public Instructor(int instructorNo, int salary) {
		this.instructorNo = instructorNo;
		this.salary = salary;
	}

	public int getInstructorNo() {
		return instructorNo;
	}

	public void setInstructorNo(int instructorNo) {
		this.instructorNo = instructorNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
