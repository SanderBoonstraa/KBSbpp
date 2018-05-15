import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> test = new ArrayList<Product>();


//        ArrayList<Product> products = ProductGenerator.generateRandomProducts(5);
//        NextFit nextFit = new NextFit(products);

        System.out.println("-----------------------------------------------------");
        ArrayList<Product> products = ProductGenerator.generateRandomProducts(10);
//        FirstFit firstFit = new FirstFit(products);
//        firstFit.startCalculation();
        FirstFitDecreasing firstFitDecreasing = new FirstFitDecreasing(products);
        firstFitDecreasing.startCalculation();

        ArrayList<Storage> boxes = firstFitDecreasing.getBoxes();
        System.out.println(boxes.size());
        for (Storage box : boxes) {
            System.out.println(box.toString());

        }



        /*AbstractScreen screen = new AbstractScreen();
        screen.setVisible(true);*/
    }
}
