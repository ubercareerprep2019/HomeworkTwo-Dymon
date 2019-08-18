public class Contact {
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	String name;
	long number;
	
	public Contact(String name, long number)
	{
		this.name = name;
		this.number = number;
	}
	
//	  @Override
//	    public boolean equals(Object obj) {
//	        if (obj == this)
//	            return true;
//	        if (!(obj instanceof Contact))
//	            return false;
//	        Contact entry = (Contact) obj;
//	        return entry.name == entry.getName()
//	                && entry.number == entry.getNumber();
//	    }
}
