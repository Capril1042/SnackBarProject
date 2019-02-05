package snackbarApp;

public class VendingMachine
{
    public static int id = 0;
    public String name;

    public VendingMachine (String name)
    {
	this.id = id++;
	this.name = name;
    }

    public String getName()
    {
	return name;
    }

    public void setName(String name)
    {
	this.name = name;
    }
}