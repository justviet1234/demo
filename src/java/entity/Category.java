package entity;

public class Category {

    private int CategoryID;

    private int CategoryName;

    private int icon;

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public int getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(int CategoryName) {
        this.CategoryName = CategoryName;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "CategoryID: "+CategoryID+"  CategoryName: "+CategoryName +" Icon: "+icon;
    }

    
    
}
