import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;

public class BinarySearchTreePhoneBook<T>{
	static Contact firstNumber;
	static int size = 0;

	public BinarySearchTreePhoneBook(Contact firstNumber) {
		this.firstNumber = firstNumber;
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	long startTimeInsert; 
	long endTimeInsert;
	long totalTimeInsert;
	long startTimeFind; 
	long endTimeFind;
	long totalTimeFind;
	
	Contact firstNumber = new Contact("271bc6f4-b964-4f9a-90f4-31fc831a56e9",6515718694L);
	BinarySearchTreePhoneBook<Contact> phonebook = new BinarySearchTreePhoneBook<>(firstNumber);
	
	
	startTimeInsert = System.currentTimeMillis();
	phonebook.readFile();
	endTimeInsert = System.currentTimeMillis();
	
	
	totalTimeInsert = endTimeInsert - startTimeInsert;
	System.out.println("Insert took " + totalTimeInsert + " ms.");
	System.out.println("The size of the PhoneBook is " + size + ".");

	//System.out.println(phonebook.find("cfa6424f-b586-40fa-85c7-91b0d6d32cc3"));
	
	startTimeFind = System.currentTimeMillis();
	System.out.println("Find() was called " +phonebook.readSearch()+ " times.");
	endTimeFind = System.currentTimeMillis();
	totalTimeFind = endTimeFind - startTimeFind;
	System.out.println("Search took " + totalTimeFind + "ms.");
	
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
			insert(name,number);
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
	
	public void insert(String name, long number)
	{
		
		findPosition( firstNumber, name,number);
		
		
	}
	
	public void findPosition(Contact entry,String name, long number)
	{
		if(entry == null)
		{
			System.out.println("here");
			entry = new Contact(name,number);
		}else {
			
			if(entry.number > number)
			{
				if(entry.left == null)
				{
					entry.left = new Contact(name,number);
					size++;
				}else {
					
					findPosition(entry.left,name,number);
				}
			}else {
				
				if(entry.right == null)	
				{
					entry.right = new Contact(name,number);
					size++;
				}else {
					findPosition(entry.right,name,number);
			}
			
		}
	  }
			
	}
		
	public static void print(Contact root)
	{
		Contact rootContact = root;
		
		if(rootContact == null) 
		{
			
		}else {
	
			System.out.println("Name:"+rootContact.name+"Phone:"+rootContact.number);
			rootContact = root.left;
			print(rootContact);
			rootContact = root.right;
			print(rootContact);
		}
	}
	
	
	//Incorrect
	public long find(String name)
	{	
		return finderHelper(firstNumber, name);
		
	}
	
	public long finderHelper(Contact root, String name)
	{
		long num = 0;
		if(root == null)
		{
			return -1;
		}else {
		
		if(root.name.equals(name))
		{
			num = root.number;
		}else {
			
			if(root.right != null)
			{	
				num = finderHelper(root.right,name);
			}else if(root.left != null)
			{
				num = finderHelper(root.left,name);
			}
	
		}
		return num;
		}
	}
}
