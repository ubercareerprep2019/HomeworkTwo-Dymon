import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListPhoneBook {
	static ArrayList phonebook = null;
	static HashMap map = new HashMap();
	public ListPhoneBook()
	{
		phonebook = new ArrayList<Contact>();
	}

	public static void main (String[] args) throws IOException{
		// TODO Auto-generated method stub

		ListPhoneBook contacts = new ListPhoneBook();
	
		System.out.println(contacts.size());
		
		File input = new File("data.csv");
		File anotherInput = new File("search.txt");
		
		Scanner fileReader = new Scanner(input);
		while(fileReader.hasNextLine())
		{
			String nextLine = fileReader.nextLine();
			String[] split = nextLine.split(",");
			
			String name = split[0];
			Long number = Long.parseLong(split[1]);
			contacts.insert(name, number);
			map.put(name, number);
		}
		
		fileReader = new Scanner(anotherInput);
		while(fileReader.hasNextLine())
		{
			System.out.println(find(fileReader.nextLine()));
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

	public static long find(String name) 
	{
		long entry = 0;
		
		if(map.containsKey(name))
		{	entry = (long) map.get(name);
			//System.out.println(entry);
		}else {
			entry = -1;
		}
	
		return entry;
	}
	

}
