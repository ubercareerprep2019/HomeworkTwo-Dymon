import java.util.LinkedList;
import java.util.Queue;

public class OrganizationStructure {

	static Employee ceo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Employee K = new Employee("K", "Sales Intern");
		Employee J = new Employee("J", "Sales Representative");
		J.managesEmployes.add(K);
		Employee I = new Employee("I", "Director");
		I.managesEmployes.add(J);
		Employee B = new Employee("B", "CFO");
		B.managesEmployes.add(I);
		Employee A = new Employee("A", "CEO");
		A.managesEmployes.add(B);
		Employee F = new Employee("F", "Engineer");
		Employee G = new Employee("G", "Engineer");
		Employee H = new Employee("H", "Engineer");
		Employee D = new Employee("D", "Manager");
		D.managesEmployes.add(F);
		D.managesEmployes.add(G);
		D.managesEmployes.add(H);
		Employee E = new Employee("E", "Manager");
		Employee C = new Employee("C", "CTO");
		C.managesEmployes.add(D);
		C.managesEmployes.add(E);
		A.managesEmployes.add(C);
		
		 printLevelByLevel(A);
	

	}
	
	public static void printLevelByLevel(Employee e)
	{
		Queue<Employee> q = new LinkedList<Employee>();
		Employee headPosition = e;
		q.add(headPosition);
		
		while(!q.isEmpty())
		{
			int size = q.size();
			for(int i = 0; i < size; i++)
			{
				Employee save = q.remove();
				System.out.println("Name: " + save.name + " Title: " + save.title);
				q.addAll(save.managesEmployes);
			}
			System.out.print("\n");
		}

		
	}
	
	
	public void printNumLevels() {
		
	
	}
}
