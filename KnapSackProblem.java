import java.util.*;

public class KnapSackProblem {
    public static void main(String args[]){
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio [][] = new double[val.length][2];

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = (double)val[i]/weight[i];  
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int capacity = W;
        int MaxValue = 0;

        for(int i=ratio.length-1; i>=0; i--){
            int index = (int)ratio[i][0];
            if(capacity >= weight[index]){
                MaxValue += val[index];
                capacity -= weight[index]; 
            }
            else{
                MaxValue += ratio[i][1]*capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("Max Value: " + MaxValue);
    }
}
