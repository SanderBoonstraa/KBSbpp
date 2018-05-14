import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        NextFit nextFit = new NextFit();
        for(int i = 0; i < 10; i++) {
            String name = "Hoi " + i;
            nextFit.calculate(new Product(name, 25 + i));
        }


        /*AbstractScreen screen = new AbstractScreen();
        screen.setVisible(true);*/
    }
}
