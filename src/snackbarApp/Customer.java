package snackbarApp;

public class Customer
{
    private static int id = 0;
    public String name;
    public double cash;

    public Customer(String name, double cash)
    {
	this.id = id++;
	this.name = name;
	this.cash = cash;
    }

    public String getName()
    {
	return name;
    }

    public void setName(String name)
    {
	this.name = name;
    }

    public double addCash(double cash)
    {
	this.cash = this.cash + cash;
	return this.cash;
    }

    public double buy(double cash)
    {
	this.cash = this.cash - cash;
	return this.cash;
    }

    public double getCash()
    {
	return this.cash;
    }
}