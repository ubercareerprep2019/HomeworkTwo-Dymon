import sun.misc.Queue;

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
		Employee root = e;
		System.out.println(root.name);
		Queue<Employee> corporation= new Queue();
		
		for(int i=0; i <= e.managesEmployes.size()-1; i++)
		{
			Employee save = root.managesEmployes.get(i);
			corporation.enqueue(save);
			System.out.println(save.name);
			if(save.managesEmployes.size() > 0)
			{
				System.out.println(save.managesEmployes.get(i).name);
			}
			
		}

		
	}
}
