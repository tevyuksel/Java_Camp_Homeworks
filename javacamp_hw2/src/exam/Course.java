package exam;

public class Course {
	
	int id;
	String name;
	String detail;
	
	public Course() { 
		System.out.println("+++");
	}	
	
	public Course(int id, String name,  String detail ) { 
				
		this.id = id;
		this.name = name;		
		this.detail = detail;
	}
	
	
}
