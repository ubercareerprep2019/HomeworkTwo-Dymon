import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.*;
public class ListPhoneBook {
	ArrayList<Contact> phonebook = new ArrayList<>();


	public static void main (String[] args) throws IOException{
		// TODO Auto-generated method stub

		ListPhoneBook contacts = new ListPhoneBook();
		long startTimeInsert;
		long endTimeInsert;
		long totalTimeInsert;
		long startTimeFind;
		long endTimeFind;
		long totalTimeFind;
		
		startTimeInsert = System.currentTimeMillis();
		contacts.readFile();
		endTimeInsert = System.currentTimeMillis();
		
		totalTimeInsert = endTimeInsert - startTimeInsert;
		System.out.println("Insert took " + totalTimeInsert + "ms.");
		System.out.println("The size of the PhoneBook is "+contacts.size()+".");
		
		startTimeFind = System.currentTimeMillis();
		System.out.println("Find() was called" + contacts.readSearch() + "times.");
		endTimeFind = System.currentTimeMillis();
		
		totalTimeFind = endTimeFind - startTimeFind;
		System.out.println("Search took " + totalTimeFind + "ms.");
	
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

	public long find(String name) 
	{
		for(int i = 0; i < phonebook.size(); i++)
		{
			Contact entry = phonebook.get(i);
			if(entry.name.equals(name))
			{
				return entry.number;
			}
		}
		return -1;	
	}
	
	
	public void readFile() throws FileNotFoundException
	{
		File input = new File("data.csv");
	
		
		Scanner fileReader = new Scanner(input);
		while(fileReader.hasNextLine())
		{
			String nextLine = fileReader.nextLine();
			String[] split = nextLine.split(",");
			
			String name = split[0];
			Long number = Long.parseLong(split[1]);
			insert(name, number);
		}
		
	}
	
	
	public int readSearch() throws FileNotFoundException
	{
		File anotherInput = new File("search.txt");
		Scanner fileReader = new Scanner(anotherInput);
	
		int numFind = 0;
		while(fileReader.hasNextLine())
		{
			String name = fileReader.nextLine();
			find(name);
			numFind++;
		}
		
		return numFind;
	
	}

}
