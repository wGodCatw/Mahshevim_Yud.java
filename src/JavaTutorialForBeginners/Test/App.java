package JavaTutorialForBeginners.Test;

public class App implements Example1, Example2{

    public static void main(String[] args) {
        App app = new App();
        app.stop();
    }

    @Override
    public void stop() {
        Example1.super.stop();
    }
}
