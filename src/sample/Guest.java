package sample;

public class Guest{

    private String nameofUser, address;
    private int phoneNumber;
    //public Card userCard;
    //public Order customOrder;

    public Guest(String nameofUser, String address, int phoneNumber){
        this.nameofUser = nameofUser;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void addGuest(){

    }

    @Override
    public String toString(){
        return ("Enter in the data provided by Guest class");

    }
}
