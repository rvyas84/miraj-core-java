import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfEveryChar {
    public Map<Character, Integer> countChar(String input) {
        Map<Character, Integer> result = new HashMap<>();

        for(int i = 0; i < input.length(); i++) {
            result.put(input.charAt(i), result.getOrDefault(input.charAt(i), 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        CountOccurenceOfEveryChar count = new CountOccurenceOfEveryChar();
        System.out.println(count.countChar("Thisisateststring"));
    }
}


// Output
// {a=1, r=1, s=4, T=1, t=3, e=1, g=1, h=1, i=3, n=1}