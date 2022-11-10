package JavaTutorialForBeginners.InheritanceGuide;

public class Sportcar extends Machine { //child class, inherits its parent class (Machine)
    @Override //annotation, that the parent method is overridden
    public void speedUp() {
        for (int i = 0; i < 22; i += 3) {
            System.out.println("Speed: " + i * i);
        }
    }
}
