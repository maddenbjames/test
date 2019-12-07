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

    //Returns the portion of the string line that specifies the username
    public String getAccountUsername(String fileLine){
        return fileLine;
    }
    //Returns the portion of the string line that specifies the user's password
    public String getPassword(String fileLine){
        return fileLine;
    }

    //Returns the portion of the string that specifies the user's address
    public String getAddress(String fileLine){
        return fileLine;
    }
    //Returns the portion of the string that specifies the user's phone number
   /* public int getPhoneNumber(String fileLine){
        return fileLine;
    }
    */
    //Returns the portion of the string that specifies the user's name
    public String getNameofUser(String fileLine){
        return fileLine;
    }

    public boolean checkValidUser(String usernameInput, String passwordInput) {

        if (usernameInput.equals(accountUsername)) {
            return passwordInput.equals(password);
        }
        return false;
    }

    @Override
    public String toString() {
        return ("Email: " + accountUsername + "|| Password: " + password + "|| Address: " + address + "|| Name: " + nameofUser + "|| PhoneNumber: "+ phoneNumber + "|| TextLine#: "+ txtFileLineNumber);
    }

}