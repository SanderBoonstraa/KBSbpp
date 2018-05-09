import java.util.ArrayList;

public class NextFit extends Algorithm {

    private int indexBox = 0;
    public NextFit() {
        Algorithm.selectedAlgorithm = "FirstFit";
    }

    protected void calculate(int input){

        ArrayList<Integer> currentBox = boxes.get(indexBox);

        if(arraySum(currentBox) + input <= maxBoxSize){

        } else if (input<= maxBoxSize){
            indexBox++;
            createNewBox();

        }
    }


}
