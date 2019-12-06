package sample;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.Stream;

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

    @Override
    public String toString(){
        return ("Enter in the data provided by Guest class");

    }
}
