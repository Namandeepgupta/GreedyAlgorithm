import java.util.*;

public class ActivitySelection{
    public static void main(String args[]){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // initial step
        int maxAct = 0;
        ArrayList<Integer> index = new ArrayList<>();

        //approch
        maxAct = 1;
        index.add(0);
        int lastEnd = end[0];
        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){
                maxAct++;
                index.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activity: " + maxAct);
        for(int i=0; i<index.size(); i++){
            System.out.print("A" +index.get(i) + ", ");
        }
        System.out.println();
    }
}