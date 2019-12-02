public class Cookie
{
    private double price;

    public Cookie()
    {
        this.price=0.0;
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
