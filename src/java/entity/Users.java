package entity;

public class Users {

    private int UserID;

    private char Username;

    private char Password;

    private char email;

    private char ActiveCode;

    private int isSeller;

    private int isAdmin;

    private int StatusID;

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public char getUsername() {
        return Username;
    }

    public void setUsername(char Username) {
        this.Username = Username;
    }

    public char getPassword() {
        return Password;
    }

    public void setPassword(char Password) {
        this.Password = Password;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getActiveCode() {
        return ActiveCode;
    }

    public void setActiveCode(char ActiveCode) {
        this.ActiveCode = ActiveCode;
    }

    public int getIsSeller() {
        return isSeller;
    }

    public void setIsSeller(int isSeller) {
        this.isSeller = isSeller;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getStatusID() {
        return StatusID;
    }

    public void setStatusID(int StatusID) {
        this.StatusID = StatusID;
    }

    @Override
    public String toString() {
        return "Users{" + "UserID=" + UserID + ", Username=" + Username + ", Password=" + Password + ", email=" + email + ", ActiveCode=" + ActiveCode + ", isSeller=" + isSeller + ", isAdmin=" + isAdmin + ", StatusID=" + StatusID + '}';
    }

}
