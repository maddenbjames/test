package sample;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.Stream;


public class Customer {

    private String accountUsername, password, address, nameofUser;
    private int phoneNumber, txtFileLineNumber;

    //public Card userCard;
    //public Order customOrder;
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


    public void addAccount() {

    }

    public void editAccount(){

    }


    /**
     * public void assignCard(String typeOfCard, String cardHolderName, Long cardNumberInput, int expirationDate, int Zip, int code){
     * userCard.setUserCard();
     * userCard.setNameOfCardHolder();
     * userCard.setCardNumber();
     * userCard.setExpDate();
     * userCard.setSecureCode();
     * userCard.setCardtype();
     * }
     * <p>
     * public void getOrder(){
     * <p>
     * <p>
     * }
     */
    @Override
    public String toString() {
        String out = ("Entered would be the formatted");
        return out;
    }


    /*
    Each customer created will be a new txt file on the desktop screen with the text file named after their username
    That way when they try to login, the code can search for the username txt file and then check if the password saved in the file matches
    A guest txt file will be temporary so deletion after their done will be easy


     */
}