package JavaTutorialForBeginners.InterfaceGuide;

public class App {
    public static void main(String[] args) {
        Changeable obj = new Television(5); //creating interface pointer in Television object
        obj.change(); //it can use implemented Television methods from original Interface

        System.out.printf("Current channel: %d", obj.getter());

        obj = new Auto(3); //changing the same pointer to Auto object
        obj.change(); //it can use Auto class implementation of interface method
        System.out.printf("Current gear: %d", obj.getter());

        Television tele = new Television(10); //creating Television object
        System.out.printf("Television is turned on: %b", tele.turnOnOff(tele.state)); //it can use methods
        System.out.printf("Televisioin is turned on: %b", tele.turnOnOff(tele.state)); //implemented in Television class


    }
}
