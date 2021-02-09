package snackbarApp;

public class VendingMachine
{
	private static int maxId = 1;

	private int id;
	private String name;

// Constructor
	public VendingMachine(String name)
	{
		maxId++;
		id = maxId;

		this.name = name;
	}


// Methods
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		String nameCopy = this.name;
		this.name = name;
		System.out.println("Name was " + nameCopy + " now it is " + name);
	}
}