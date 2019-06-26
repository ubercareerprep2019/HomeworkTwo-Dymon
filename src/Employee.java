import java.util.ArrayList;

public class Employee {

	String name;
	String title;
	ArrayList<Employee> 	managesEmployes;
	
	
	public Employee(String name, String title) {
		this.name = name;
		this.title = title;
		managesEmployes = new ArrayList();
		
	}
	
	
	
}
