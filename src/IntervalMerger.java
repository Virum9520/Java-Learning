import java.util.ArrayList;
import java.util.Arrays;

public class IntervalMerger {
    public static ArrayList<ArrayList<Integer>> merger(ArrayList<ArrayList<Integer>> intervals){
        ArrayList<ArrayList<Integer>> merged = new ArrayList<ArrayList<Integer>>();

        for (int i = 1; i < intervals.size(); i++) {
            int a1 = intervals.get(i-1).get(0);
            int a2 = intervals.get(i-1).get(1);
            int b1 = intervals.get(i).get(0);
            int b2 = intervals.get(i).get(1);

            if(a2>b1){
                merged.add(new ArrayList<Integer>(Arrays.asList(a1,b2)));
                i++;
            }
            else{
                merged.add(intervals.get(i-1));
            }
        }
        merged.add(intervals.get(intervals.size()-1));
        return merged;
    }

    public static void main(String[] args) {
        int[][] twoDArray = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        // Convert the 2D array to an ArrayList
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for (int[] row : twoDArray) {
            ArrayList<Integer> rowList = new ArrayList<>();
            for (int value : row) {
                rowList.add(value);
            }
            arrayList.add(rowList);
        }

        ArrayList<ArrayList<Integer>> sol = merger(arrayList);

        for (ArrayList<Integer> rowList : sol) {
            for (Integer value : rowList) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
