package snackbarApp;

public class Main
{

    private static void workWithData ()
    {
	// Instantiate 2 customers- Jane with $45.25 & Bob with $33.14

	Customer c1 = new Customer("Jane", 45.25);
	Customer c2 = new Customer("Bob", 33.14);
	
	// Instantiate 3 Vending Machines - Food, Drink, Office
	
	VendingMachine vm1 = new VendingMachine("Food");
	VendingMachine vm2 = new VendingMachine("Drink");
	VendingMachine vm3 = new VendingMachine("Office");

	// Instantiate 5 snacks 
	// In Vending Machine Food- 36 Chips at $1.75, 36 Chocolate Bar at $1.00, 30 Pretzel at $2.00
	// In Vending Machine Drink- 24 Soda at $2.50, 20 Water at $2.75


	
    }

    public static void main(String[] args)
    {
	workWithData();
    }

}