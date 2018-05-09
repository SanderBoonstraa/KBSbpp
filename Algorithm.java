import java.util.ArrayList;

public abstract class Algorithm {
    public final static int maxBoxSize = 100;

    protected ArrayList<ArrayList<Integer>> boxes;

    public static String selectedAlgorithm = "";

    public Algorithm() {
        boxes = new ArrayList<>();
    }

    protected abstract void calculate(int input);

    public void createNewBox(){
        ArrayList<Integer> box = new ArrayList<Integer>();
        boxes.add(box);
    }

    public ArrayList<ArrayList<Integer>> getBoxes() {
        return boxes;
    }

    public void putProductInBox(int productHeight, ArrayList<Integer> box){
        box.add(productHeight);
    }

    public int arraySum(ArrayList<Integer> box) {
        int sum = 0;
        for (int currentProduct : box) {
            sum += currentProduct;
        }
        return sum;
    }


}
