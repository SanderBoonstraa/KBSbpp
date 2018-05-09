import java.util.ArrayList;

public abstract class Algorithm {
    public final static int boxSize = 100;

    protected ArrayList<ArrayList<Integer>> boxes;

    public static String selectedAlgorithm = "";

    public Algorithm() {
        boxes = new ArrayList<>();
    }

    public void createNewBox(){
        ArrayList<Integer> box = new ArrayList<Integer>();
        boxes.add(box);
    }

    public ArrayList<ArrayList<Integer>> getBoxes() {
        return boxes;
    }

    public void putPackageInBox(int packageHeight, ArrayList<Integer> box){
        box.add(packageHeight);
    }
}
