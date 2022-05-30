package entity;

public class Feedback_Replies {

    private int ID;

    private int FeedbackID;

    private int UserID;

    private char RepliesText;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getFeedbackID() {
        return FeedbackID;
    }

    public void setFeedbackID(int FeedbackID) {
        this.FeedbackID = FeedbackID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public char getRepliesText() {
        return RepliesText;
    }

    public void setRepliesText(char RepliesText) {
        this.RepliesText = RepliesText;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
