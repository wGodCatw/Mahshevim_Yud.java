package JavaTutorialForBeginners.InheritanceGuide;

public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        machine1.start(); //parent method, written in parent class

        Sportcar sportcar1 = new Sportcar();
        sportcar1.start(); //child class can use all non-private parent methods without declaring them

        machine1.speedUp(); //parent method
        sportcar1.speedUp(); //override method declared and changed in child class, its output differs from method
                                                                                //with the same name from parent class

    }
}
