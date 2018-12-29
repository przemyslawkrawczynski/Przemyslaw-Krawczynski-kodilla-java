package good.patterns.challenges.productOrderService;

public class User {
    private String userName;
    private String adress;
    private int phone;
    private String mail;

    public User(String userName, String adress, int phone, String mail) {
        this.userName = userName;
        this.adress = adress;
        this.phone = phone;
        this.mail = mail;
    }

    public String getUserName() {
        return userName;
    }
}
