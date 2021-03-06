import java.util.ArrayList;
import java.util.Collections;

public abstract class Algorithm {
    public final static int maxBoxSize = 100;


    protected ArrayList<Storage> boxes;

    public static String selectedAlgorithm = "";

    public Algorithm() {

        boxes = new ArrayList<Storage>();
        boxes.add(new Storage());
    }
    protected abstract void startCalculation();


    public Storage createNewBox(){
        Storage box = new Storage();
        boxes.add(box);
        return box;
    }

    public ArrayList<Storage> getBoxes(){
        return boxes;
    }


}
