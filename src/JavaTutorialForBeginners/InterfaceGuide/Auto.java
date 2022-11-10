package JavaTutorialForBeginners.InterfaceGuide;

public class Auto implements Changeable, ITurnOn { //class can implement many interfaces
    int currentGear;
    boolean engine = false;

    Auto(int gear) {
        this.currentGear = gear;
    }
    @Override
    public int getter() { //this method is overridden from the abstract method from interface
        return currentGear;
    }

    @Override
    public void change() {
        currentGear += 1;
        System.out.println("The gear has increased by one!");
    }

    @Override
    public boolean turnOnOff(boolean state) {

        if (!engine) {
            System.out.println("Broom-broom!");
            engine = true;

        } else {
            System.out.println("No broom-broom :(");
            engine = false;

        }
        return engine;
    }
}
