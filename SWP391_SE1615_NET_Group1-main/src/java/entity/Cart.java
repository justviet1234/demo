package entity;

public class Cart {

    private int UserID;

    private int ProductID;

    private int Amount;

    public int getUserID() {
        return UserID;
    }

    public int getProductID() {
        return ProductID;
    }

    public int getAmount() {
        return Amount;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    @Override
    public String toString() {
        return "UserID: "+UserID+"  ProductID: "+ProductID+"  Amount: "+Amount;
    }

    
    
}
