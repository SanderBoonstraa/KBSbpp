import java.util.ArrayList;
import java.util.Collections;

public class FirstFitDecreasing extends Algorithm {
    private ArrayList<Product> products;
    public FirstFitDecreasing(ArrayList<Product> products) {
        Algorithm.selectedAlgorithm = "FirstFitDecreasing";
        this.products=new ArrayList<Product>(products);
    }

    public void startCalculation(){
        Collections.sort(products, Collections.reverseOrder());

        for(int i = 0; i < products.size(); i++) {
            calculate(products.get(i));
        }
    }

    @Override
    protected void calculate(Product product) {
        //Working code


        boolean isStored = false;
        for(Storage box: boxes) {
            if(!isStored && box.addProduct(product)) {
                isStored = true;
                break;
            }
        }

        //IF there is no place for storage in the old boxes create a new one
        if(!isStored) {
            Storage box = createNewBox();
            box.addProduct(product);
        }
    }

}
