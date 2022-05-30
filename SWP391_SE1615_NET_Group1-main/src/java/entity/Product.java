package entity;

public class Product {

    private int ProductID;

    private char ProductName;

    private char Description;

    private int OriginalPrice;

    private int SellPrice;

    private int SellPercent;

    private char imageLink;

    private int CategoryID;

    private int SellerID;

    private int Amount;

    private int StatusID;

    private int ManufacturerID;

    private float height;

    private float width;

    private float weight;

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public char getProductName() {
        return ProductName;
    }

    public void setProductName(char ProductName) {
        this.ProductName = ProductName;
    }

    public char getDescription() {
        return Description;
    }

    public void setDescription(char Description) {
        this.Description = Description;
    }

    public int getOriginalPrice() {
        return OriginalPrice;
    }

    public void setOriginalPrice(int OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    public int getSellPrice() {
        return SellPrice;
    }

    public void setSellPrice(int SellPrice) {
        this.SellPrice = SellPrice;
    }

    public int getSellPercent() {
        return SellPercent;
    }

    public void setSellPercent(int SellPercent) {
        this.SellPercent = SellPercent;
    }

    public char getImageLink() {
        return imageLink;
    }

    public void setImageLink(char imageLink) {
        this.imageLink = imageLink;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public int getSellerID() {
        return SellerID;
    }

    public void setSellerID(int SellerID) {
        this.SellerID = SellerID;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public int getStatusID() {
        return StatusID;
    }

    public void setStatusID(int StatusID) {
        this.StatusID = StatusID;
    }

    public int getManufacturerID() {
        return ManufacturerID;
    }

    public void setManufacturerID(int ManufacturerID) {
        this.ManufacturerID = ManufacturerID;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
