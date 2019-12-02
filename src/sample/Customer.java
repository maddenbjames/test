package sample;

public class Customer {

    private String accountUsername, password, address, nameofUser;
    private int phoneNumber;

    //public Card userCard
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

}