package sample;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;


public class Customer {

    private String accountUsername, password;
    private String address, nameofUser;
    private int phoneNumber, txtFileLineNumber;

    public Customer(){
        accountUsername = "FillerText";
        password = "FillerPassword";
        address = "FillerAddress";
        nameofUser = "FillerText";
        phoneNumber = 999999999;
        txtFileLineNumber = 99;

    }
    public Customer(String Username, String Psswrd, String addrss, String Name, int phone) {
        accountUsername = Username;
        password = Psswrd;
        address = addrss;
        nameofUser = Name;
        phoneNumber = phone;
    }

    public void setAccountUsername(String newInput) {
        accountUsername = newInput;
    }

    public void setPassword(String newPsswrd) {
        password = newPsswrd;
    }

    public void setAddress(String newAddrs) {
        address = newAddrs;
    }

    public void setPhoneNumber(int newPhone) {
        phoneNumber = newPhone;
    }

    public void setNameofUser(String newName) {
        nameofUser = newName;
    }

    public boolean checkValidUser(String usernameInput, String passwordInput) {

        if (usernameInput.equals(accountUsername)) {
            if (passwordInput.equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String out = ("Entered would be the formatted");
        return out;
    }

}