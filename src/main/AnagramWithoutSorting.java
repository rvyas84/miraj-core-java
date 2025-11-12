import java.util.HashMap;
import java.util.Map;

public class AnagramWithoutSorting {
    public boolean isAnagram(String input, String subString) {

        Map<Character, Integer> result = new HashMap<>();

        input = input.replaceAll("[^a-zA-Z0-9]", "");
        subString = subString.replaceAll("[^a-zA-Z0-9]", "");

        if(input.length() != subString.length()) {
            return false;
        }

        input = input.toLowerCase();
        subString = subString.toLowerCase();

        for(char c: input.toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }

        for(char c : subString.toCharArray()) {
            if(!result.containsKey(c)) {
                return false;
            }

            result.put(c, result.get(c) - 1);

            if(result.get(c) == 0) {
                result.remove(c);
            }
        }

        return result.isEmpty();
    }

    public static void main(String[] args) {
        AnagramWithoutSorting ana = new AnagramWithoutSorting();
        System.out.println(ana.isAnagram("Madam*&^123", "    madam 123 "));
    }
}

//Output -- True