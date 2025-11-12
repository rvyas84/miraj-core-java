import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateNumber {

    public boolean hasDuplicateUsingSet(int[] input) {
        Set<Integer> output = new HashSet<>();

        for(int n : input) {
            if(!output.add(n)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasDuplicateViaSort(int[] input) {
        Arrays.sort(input);

        for(int i = 1; i < input.length; i++) {
            if(input[i] == input[i-1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,1};
        CheckDuplicateNumber checkDuplicateNumber = new CheckDuplicateNumber();
        System.out.println(checkDuplicateNumber.hasDuplicateUsingSet(input));
        System.out.println(hasDuplicateViaSort(input));
    }
}
