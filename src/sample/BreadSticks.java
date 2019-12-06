package sample;

public class BreadSticks
{
    private boolean garlic;
    private boolean butter;
    private double price;

    public BreadSticks()
    {
        this.garlic = this.butter = false;
        this.price = 0.0;
    }

    public void addGarlic()
    {
        this.garlic = true;
    }

    public void removeGarlic()
    {
        this.garlic = false;
    }

    public void addButter()
    {
        this.butter=true;
    }

    public void removeButter()
    {
        this.butter=false;
    }

    public void addPrice(double amount)
    {
        this.price += amount;
    }

    public void removePrice(double amount)
    {
        this.price-= amount;
        if(this.price<0.0)
            price=0.0;
    }
}
