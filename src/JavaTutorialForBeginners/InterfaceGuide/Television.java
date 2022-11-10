package JavaTutorialForBeginners.InterfaceGuide;

public class Television implements Changeable, ITurnOn {
    private int channel;
    boolean state = false;

    Television(int currentChannel) {
        this.channel = currentChannel;
    }

    public int getter() {
        return channel;
    }

    @Override
    public void change() {
        channel += 1;
        System.out.println("The channel is increased by one!");
    }

    @Override
    public boolean turnOnOff(boolean state) {
        if (!state) {
            state = true;
            System.out.println("Turned on!");
        } else {
            state = false;
            System.out.println("Turned off!");
        }
        return state;
    }
}
