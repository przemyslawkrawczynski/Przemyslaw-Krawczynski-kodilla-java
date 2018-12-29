package good.patterns.food2door;

public class Client {
    String clientName;
    String clientSurname;
    String clientAdress;
    String clientMail;

    public Client(String clientName, String clientSurname, String clientAdress, String clientMail) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientAdress = clientAdress;
        this.clientMail = clientMail;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public String getClientAdress() {
        return clientAdress;
    }

    public String getClientMail() {
        return clientMail;
    }
}
