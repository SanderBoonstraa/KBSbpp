import java.util.ArrayList;

public class NextFit extends Algorithm {

    private int indexBox = 0;
    public NextFit() {
        super();
        Algorithm.selectedAlgorithm = "Next-Fit";
    }

    @Override
    protected void calculate(Product product){

        Storage currentBox = boxes.get(boxes.size()-1);
//        Storage currentBox = boxes.get(indexBox);

        if(currentBox.addProduct(product)) {
            // DONE
        } else {
            indexBox++;
            System.out.println("Box " + indexBox);
            Storage newBox = createNewBox();
            newBox.addProduct(product);
            System.out.println(currentBox);
        }

    }




}
