import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfEveryInteger {
    public Map<Integer, Integer> countOccurrences(int[] input) {
        Map<Integer, Integer> result = new HashMap<>();

        for(int i : input) {
            result.put(i, result.getOrDefault(i, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        CountOccurencesOfEveryInteger countInt = new CountOccurencesOfEveryInteger();
        System.out.println(countInt.countOccurrences(new int[]{1,2,3,4,5,5,5,6,6,7,4,3,2,8,9,10}));
    }
}


//Output
//{1=1, 2=2, 3=2, 4=2, 5=3, 6=2, 7=1, 8=1, 9=1, 10=1}