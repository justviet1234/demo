package entity;

public class Feedback {

    private int ID;

    private int UserID;

    private int ProductID;

    private int OrderID;

    private int Star;

    private char FeedbackDetails;

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

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public int getStar() {
        return Star;
    }

    public void setStar(int Star) {
        this.Star = Star;
    }

    public char getFeedbackDetails() {
        return FeedbackDetails;
    }

    public void setFeedbackDetails(char FeedbackDetails) {
        this.FeedbackDetails = FeedbackDetails;
    }

    @Override
    public String toString() {
           return "";
    }

    
    
}
