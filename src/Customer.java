package snackbarApp;

public class Customer
{
    private static int id;
    public String name;
    public double cash;

    public Customer(String name, double cash)
    {
	this.name = name;
	this.cash = cash;
    }

    public String getName()
    {
	return name;
    }

    public String setName(String name)
    {
	this.name = name;
    }

    public double addCash()
    {
	// adds cash
    }

    public double buy()
    {
	// buy given total cash used in purchase
    }

    public double getCash()
    {
	return cash;
    }
}