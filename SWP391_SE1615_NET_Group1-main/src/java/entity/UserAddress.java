package entity;

public class UserAddress {

    private int ID;

    private int UserID;

    private char ShipName;

    private char ShipAddress;

    private int ShipCityID;

    private char PhoneNum;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public char getShipName() {
        return ShipName;
    }

    public void setShipName(char ShipName) {
        this.ShipName = ShipName;
    }

    public char getShipAddress() {
        return ShipAddress;
    }

    public void setShipAddress(char ShipAddress) {
        this.ShipAddress = ShipAddress;
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

}
