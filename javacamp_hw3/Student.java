package javacamp_hw3;

public class Student extends User{

	private int studentNo;
	private int score;
	
	public Student() {
		
	}
	
	public Student(int studentNo, int score) {
		this.studentNo = studentNo;
		this.score = score;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
