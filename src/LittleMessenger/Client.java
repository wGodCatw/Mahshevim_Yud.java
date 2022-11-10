package LittleMessenger;

public class Client extends Data{
    private final String name;
    Client(String name){
        this.name = name;
    }

    public String getName(Client client) {
        return client.name;
    }
}
