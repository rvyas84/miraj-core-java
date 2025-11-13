import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] sum(int[] input, int target) {
        int remaining = 0;

        Map<Integer, Integer> num = new HashMap<>();
        for(int i = 0; i < input.length; i++) {
            int complement = target - input[i];
            if(num.containsKey(complement)) {
                return new int[]{num.get(complement), i};
            }
            num.put(input[i], i);
        }

        throw new IllegalArgumentException("no match found");
    }

    public static void main(String[] args) {
        TwoSum sm = new TwoSum();
        System.out.println(Arrays.toString(sm.sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10)));
    }
}
