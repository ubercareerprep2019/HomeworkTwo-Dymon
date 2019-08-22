public class Contact {
	String name;
	long number;
	Contact left;
	Contact right;
	public Contact(String name, long number)
	{
		this.name = name;
		this.number = number;
		left = null;
		right = null;
	}
	

}