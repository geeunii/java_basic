package Welcome;

public class Customer {
    private String userName;
    private String userCell;

    public Customer(String userName, String userCell) {
        this.userName = userName;
        this.userCell = userCell;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserCell() {
        return userCell;
    }

}
