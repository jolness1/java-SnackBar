package snackbarApp;


public class Main
{
	public static void workingWithData()
	{
	
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack ("Chips", 36, 1.75, food.getId(), food.getName());
        Snack chocolate = new Snack ("Chocolate Bar", 36, 1.00, food.getId(), food.getName());
        Snack pretzel = new Snack ("Pretzel", 30, 2.00, food.getId(), food.getName());
		
		Snack soda = new Snack("Soda", 24, 2.50, drink.getId(), drink.getName());
        Snack water = new Snack("Water", 20, 2.75, drink.getId(), drink.getName());
    // #1
        soda.buySnack(3);
        jane.buySnack(soda.getTotalCost(3));

        System.out.println(customerPretext(jane.getName()) + (jane.getCashOnHand()));
        System.out.println(snackPretext(soda.getName()) + soda.getQuantity());


    // #2
        pretzel.buySnack(1);
        jane.buySnack(pretzel.getTotalCost(1));

        System.out.println(customerPretext(jane.getName()) + (jane.getCashOnHand()));
        System.out.println(snackPretext(pretzel.getName()) + pretzel.getQuantity());
	
    // #3 
        soda.buySnack(2);
        bob.buySnack(soda.getTotalCost(2));

        System.out.println(customerPretext(bob.getName()) + (bob.getCashOnHand()));
        System.out.println(snackPretext(soda.getName()) + soda.getQuantity());

    // #4
        jane.addToCashOnHand(10);
        System.out.println(customerPretext(jane.getName()) + (jane.getCashOnHand()));

    // #5
        chocolate.buySnack(1);
        jane.buySnack(chocolate.getTotalCost(1));

    // #6
        pretzel.addQuantity(12);
        System.out.println(snackPretext(pretzel.getName() + pretzel.getQuantity()));

    // #7 
        pretzel.buySnack(3);
        bob.buySnack(pretzel.getTotalCost(3));

        System.out.println(customerPretext(bob.getName()) + (bob.getCashOnHand()));
        System.out.println(snackPretext(pretzel.getName()) + pretzel.getQuantity());
	}

	public static String customerPretext(String customer)
    {
        return customer + "'s cash on hand: ";
    }

    public static String snackPretext(String snack)
    {
        return "Quantity of " + snack + ": ";
    }

    public static void main(String[] args)
    {
        workingWithData();
    }
}