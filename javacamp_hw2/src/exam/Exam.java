package exam;

public class Exam {
	
	public Exam() { 
		System.out.println("+++");
	}	
	
	public Exam(int id, String name, String status ) { 
				
		this.id = id;
		this.name = name;		
		this.status = status;
	}
	
	int id;
	String name;
	String status;

}
