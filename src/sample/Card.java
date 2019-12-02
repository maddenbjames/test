<<<<<<< Updated upstream
public class Card{

    private String cardtype, nameOfCardHolder;
    private long cardNumber;
    private int expDate, zipCode, secureCode;

    public Card(String newCardType, String newName, long newCardNum, int newExpiration, int newZip, int newSecureCode){

        cardtype = newCardType;
        nameOfCardHolder = newName;
        cardNumber = newCardNum;
        expDate = newExpiration;
        zipCode = newZip;
        secureCode = newSecureCode;

    }

    public String getUserCard(){

        return cardtype;
    }

    public String getNameOfCardHolder() {
        return nameOfCardHolder;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getExpDate() {
        return expDate;
    }

    public int getSecureCode() {
        return secureCode;
    }

    public int getZipCode(){
        return zipCode;
    }

    public void setUserCard(String updateUserCard){
        cardtype = updateUserCard;
    }

    public void setNameOfCardHolder(String updateUserName){
        cardNumber = updateUserName;
    }

    public void setExpDate(int expDate) {
        this.expDate = expDate;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setSecureCode(int secureCode) {
        this.secureCode = secureCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString(){

        return ("This is where you would format the card info");
    }
=======
public class Card{

    private String cardtype, nameOfCardHolder;
    private long cardNumber;
    private int expDate, zipCode, secureCode;

    public Card(String newCardType, String newName, long newCardNum, int newExpiration, int newZip, int newSecureCode){

        cardtype = newCardType;
        nameOfCardHolder = newName;
        cardNumber = newCardNum;
        expDate = newExpiration;
        zipCode = newZip;
        secureCode = newSecureCode;

    }

    public String getUserCard(){

        return cardtype;
    }

    public String getNameOfCardHolder() {
        return nameOfCardHolder;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getExpDate() {
        return expDate;
    }

    public int getSecureCode() {
        return secureCode;
    }

    public int getZipCode(){
        return zipCode;
    }

    public void setUserCard(String updateUserCard){
        cardtype = updateUserCard;
    }

    public void setNameOfCardHolder(String updateUserName){
        cardNumber = updateUserName;
    }

    public void setExpDate(int expDate) {
        this.expDate = expDate;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setSecureCode(int secureCode) {
        this.secureCode = secureCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString(){

        return ("This is where you would format the card info");
    }
>>>>>>> Stashed changes
}