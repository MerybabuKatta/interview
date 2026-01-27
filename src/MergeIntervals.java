import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};

        // sort intervals
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        // create a result list
        List<int[]> result = new ArrayList<>();

        // start with fist interval
        int[] current = intervals[0];  // current [1,3]

        // loop second interval
        for (int i = 1; i < intervals.length; i++) {

            // first iteration interval[i] = 1  -> 2,3  , current 1, 3

            // overlap
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);

            } else {
                result.add(current);
                current = intervals[i];
            }
        }

            // add last interval
            result.add(current);
            // print result
            for(int[] in : result){
                System.out.println(Arrays.toString(in));
            }

        }


}
