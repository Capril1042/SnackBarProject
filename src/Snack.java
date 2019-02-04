package snackbarApp;

public class Snack
{
    private int id = 0;
    public int vendingMachineId;
    public String name;
    public int quantity;
    public double cost;

    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
	this.id = id++;
	this.name = name;
	this.quantity = quantity;
	this.cost = cost;
	this.vendingMachineId = vendingMachineId;
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