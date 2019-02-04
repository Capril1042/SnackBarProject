package snackbarApp;

public class Snack
{
    private int id;
    public int vendingMachine id;
    public String name;
    public int quantity;
    public double cost;

    public Snack(String name, int quantity, double cost)
    {
	this.name = name;
	this.quantity = quantity;
	this.cost = cost;
    }

    public String setName(String name)
    {
	this.name = name;
    }

    public int getQuantity()
    {
	return quantity;
    }

    public int addQuantity(int quantity)
    {
	this.quantity = quantity + quantity;
    }

    public int buySnack(int quantity)
    {
	this.quantity = quantity - quantity;
    }

    public double getTotalCost(int quantity)
    {
	this.cost = quantity * cost;
    }
}