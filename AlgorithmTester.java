import java.util.ArrayList;

public class AlgorithmTester {

    private ArrayList<Product> products;

    private ArrayList<Storage> boxes;

    public AlgorithmTester() {

        this.products = ProductGenerator.generateRandomProducts(10);
    }

    public void startFirstFit() {
        FirstFit FirstFit = new FirstFit(products);
        FirstFit.startCalculation();


        this.boxes = FirstFit.getBoxes();
    }

    public void printBoxes() {
        System.out.println("------------------------------------------");
        System.out.println("Amount of boxes: " + boxes.size());
        System.out.println("Amount of products: " + products.size());
        for (Storage box : boxes) {
            System.out.println(box.toString());
        }
    }

    public void startFirstFitDecreasing() {
        FirstFitDecreasing firstFitDecreasing = new FirstFitDecreasing(products);
        firstFitDecreasing.startCalculation();

        this.boxes = firstFitDecreasing.getBoxes();

    }

    public void startNextFit() {
        NextFit nextFit = new NextFit(products);
        nextFit.startCalculation();
        this.boxes = nextFit.getBoxes();
    }

    public void startWorstFit() {

        WorstFit WorstFit = new WorstFit(products);
        WorstFit.startCalculation();
        this.boxes = WorstFit.getBoxes();
    }

}
