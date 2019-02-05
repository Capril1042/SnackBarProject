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
	
	Snack s1 = new Snack("Chips", 36, 1.75, vm1.id);
	Snack s2 = new Snack("Chocolate Bar",36, 1.00, vm1.id);
	Snack s3 = new Snack("Pretzel", 30, 2.00, vm1.id);

	Snack s4 = new Snack("Soda", 24, 2.50, vm2.id);
	Snack s5 = new Snack("Water", 20, 2.75, vm2.id);

	// Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
	c1.buy(s4.getTotalCost(3));
	s4.buySnack(3);

	System.out.println("Customer 1, " + c1.name + " now has $" + c1.getCash() + " on hand.");
	System.out.println("The quantity of "+ s4.name + " left is now, " + s4.getQuantity());

	// Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
	c1.buy(s3.getTotalCost(1));
	s3.buySnack(1);

	System.out.println("Customer 1, " + c1.name + " now has $" + c1.getCash() + " on hand.");
	System.out.println("The quantity of "+ s3.name + " left is now " + s3.getQuantity());
	
	// Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
	c2.buy(s4.getTotalCost(2));
	s4.buySnack(2);

	System.out.println("Customer 2, " + c2.name + " now has $" + c2.getCash() + " on hand.");
	System.out.println("The quantity of "+ s4.name + "left is now " + s4.getQuantity());
	

	// Customer 1 finds $10. Print Customer 1 Cash on Hand.
	c1.addCash(10.00);
	System.out.println("Customer 1, " + c1.name + " now has $" + c1.getCash() + " on hand.");

	// Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
	c1.buy(s2.getTotalCost(1));
	s2.buySnack(1);
	System.out.println("Customer 1, " + c1.name + " now has $" + c1.getCash() + " on hand.");
	System.out.println("The quantity of "+ s2.name + "left is now " + s2.getQuantity());

	// Snack 3 gets 12 more. Print quantity of snack 3.
	s3.addQuantity(12);
	System.out.println("The quantity of "+ s3.name + "is now " + s3.getQuantity());


	// Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
	c2.buy(s3.getTotalCost(3));
	s3.buySnack(3);
	System.out.println("Customer 2, " + c2.name + " now has $" + c2.getCash() + " on hand.");
	System.out.println("The quantity of "+ s3.name + "is now " + s3.getQuantity());

    }

    public static void main(String[] args)
    {
	workWithData();
    }

}