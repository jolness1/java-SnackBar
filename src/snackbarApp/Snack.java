package snackbarApp;

public class Snack
{
    private static int maxId = 1;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;
    private String vendingMachineName;

// constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId, String vendingMachineName)
    {
        this.id = maxId++;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
        this.vendingMachineName = vendingMachineName;
    }

// Get and Set


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
		this.name = name;
	}

	public int getQuantity()
	{
		return quantity;
	}


	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public int getVendingMachineId()
	{
		return vendingMachineId;
	}

	public void setVendingMachineID()
	{
		this.vendingMachineId = vendingMachineId;
	}

	   public String getVendingMachineName()
    {
        return vendingMachineName;
    }

    public void setVendingMachineName(String vendingMachineName)
    {
        this.vendingMachineName = vendingMachineName;
    }

// Methods


	// add quantity
		// quantity + newQuantity

	public void addQuantity(int quantity)
	{
		this.quantity += quantity;
		System.out.println("Purchased "+ quantity + "of" + name + "!");		
	}

	// buy a snack

	public void buySnack(int quantity)
	{
		this.quantity -= quantity;
		System.out.println("There is now " + quantity + "remaining.");
	}

	// get total cost of a given qty

	public double getTotalCost(int quantity)
	{
		return cost * quantity;
	}
}