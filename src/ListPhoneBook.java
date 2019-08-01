import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListPhoneBook {
	ArrayList phonebook = null;
	
	public ListPhoneBook()
	{
		phonebook = new ArrayList();
	}

	public static void main (String[] args) throws IOException{
		// TODO Auto-generated method stub

		ListPhoneBook contacts = new ListPhoneBook();
		contacts.insert("Dymon", 302507156);
		contacts.insert("Dyn", 302547156);
		System.out.println(contacts.size());
		
		File input = new File("search.txt");
		Scanner fileReader = new Scanner(input);
		
		while(fileReader.hasNextLine())
		{
			contacts.insert(fileReader.nextLine(), 0);
		}
		
		System.out.println(contacts.size());
	}
	
	public void insert(String name, long number)
	{
		Contact newContact = new Contact(name, number);
		phonebook.add(newContact);
	}
	
	public int size()
	{
		return phonebook.size();
	}

	//public void find()
}
