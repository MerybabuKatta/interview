import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniquePairSum {
    public static void main(String[] args) {
        int[] arr = {50,50,60,40,70,30,20,80};

        Set<Integer> set = new HashSet<>();
        Set<String> uniquePair = new HashSet<>();

        for (int num : arr){
            int target = 100 - num;
            if (set.contains(target)){
                int first = Math.min(num, target);
                int second = Math.max(num, target);
                uniquePair.add(first + "," + second);
            }
            set.add(num);
        }

        for (String pair : uniquePair){
            String[] nums = pair.split(",");
            System.out.println(nums[0] + " = " +nums[1]);
        }
    }
}
