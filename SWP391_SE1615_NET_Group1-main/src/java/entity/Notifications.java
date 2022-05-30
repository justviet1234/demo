package entity;

public class Notifications {

    private int ID;

    private int UserID;

    private int OrderID;

    private char content;

    private char status;

    private char time;

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

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public char getContent() {
        return content;
    }

    public void setContent(char content) {
        this.content = content;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public char getTime() {
        return time;
    }

    public void setTime(char time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
