package LittleMessenger;

public class Data {
    static StringBuilder history = new StringBuilder();

    public void addMessage(Client cl, String msg) {
        history.append('/').append(cl.getName(cl)).append(":").append(msg);
        System.out.println("Chat history: " + history);
    }

    public String getMessage() {
        System.out.print("Last message: ");
        return history.substring(history.lastIndexOf("/") + 1, history.length());
    }
}
