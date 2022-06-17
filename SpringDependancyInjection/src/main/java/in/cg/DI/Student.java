package in.cg.DI;

public class Student {
	//Dependancy Injection In Terms Of Literals
	private String Name;
	private int id;
	
	//Dependancy Injection Using Constructor
	public Student(String name, int id) {
		super();
		Name = name;
		this.id = id;
	}
	
	
	
	/*public void setId(int id) {
		this.id = id;
	}

	//Dependancy Injection Using Setters
	public void setName(String name) {
		Name = name;
	}*/

	public void print() {
		System.out.println("The Student Name is "+Name);
		System.out.println("The Student Id is "+id);
	}

	

}
