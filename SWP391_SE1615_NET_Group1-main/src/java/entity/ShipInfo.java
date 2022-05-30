package entity;

public class ShipInfo {

    private int ID;

    private int Order_ID;

    private int CustomerName;

    private char ShoppingAddress;

    private int ShipCityID;

    private char PhoneNum;

    private char Note;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(int Order_ID) {
        this.Order_ID = Order_ID;
    }

    public int getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(int CustomerName) {
        this.CustomerName = CustomerName;
    }

    public char getShoppingAddress() {
        return ShoppingAddress;
    }

    public void setShoppingAddress(char ShoppingAddress) {
        this.ShoppingAddress = ShoppingAddress;
    }

    public int getShipCityID() {
        return ShipCityID;
    }

    public void setShipCityID(int ShipCityID) {
        this.ShipCityID = ShipCityID;
    }

    public char getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(char PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public char getNote() {
        return Note;
    }

    public void setNote(char Note) {
        this.Note = Note;
    }

}
