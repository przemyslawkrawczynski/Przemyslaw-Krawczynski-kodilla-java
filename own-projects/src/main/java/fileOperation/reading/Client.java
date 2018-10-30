package fileOperation.reading;

public class Client {
    private int id;
    private String forName;
    private String name;
    private int phoneNumber;
    private String city;


    public Client (int id, String forName, String name, int phoneNumber, String city) {
        this.id = id;
        this.forName = forName;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    @Override
    public String toString() {
        return forName + " | " + name;
    }
}