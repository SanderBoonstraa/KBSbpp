import java.util.ArrayList;

public class FirstFit extends Algorithm {

    private int indexBox = 0;
    private ArrayList<Product> products;

    public FirstFit(ArrayList<Product> products) {
        Algorithm.selectedAlgorithm = "FirstFit";
        this.products= products;
    }

    public void startCalculation(){
        for(int i = 0; i < products.size() - 1; i++) {
            calculate(products.get(i));
        }
    }

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


        //Test code for learning purposes


//        if (boxes.get(0).addProduct(product)) {
//            // DONE
//        }else{
//            if(0 != boxes.size()-1){
//                for(int i=0; i< boxes.size()-1;i++){
//                    if(boxes.get(i).addProduct(product)){
//                            //done
//                    }
//                }
//            }
//            else{
//                Storage newBox = createNewBox();
//                newBox.addProduct(product);
//            }
//        }
    }


}
