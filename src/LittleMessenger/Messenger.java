package LittleMessenger;

public interface Messenger {
    void addMessage(Client cl, String msg);
    String getMessage();
}
