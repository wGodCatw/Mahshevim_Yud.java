package JavaTutorialForBeginners.InheritanceGuide;

public class Machine { //parent class
    public void start(){
        System.out.println("Machine started");
    }

    public void speedUp(){
        int coefficient = 0;
        for (int i = 0, j = 0; i < 160 && j < 51; i+=10, j+=5) {
            System.out.println("Speed: " + (i+j));
        }
    }
}
