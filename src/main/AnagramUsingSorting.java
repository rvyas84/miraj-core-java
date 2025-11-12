import java.util.Arrays;

public class AnagramUsingSorting {
    public boolean isAnangram(String input, String subString) {

        input = input.replaceAll("[^a-zA-Z0-9]", "");
        subString = subString.replaceAll("[^a-zA-Z0-9]", "");

        input = input.toLowerCase();
        subString = subString.toLowerCase();

        char[] c = input.toCharArray();
        char[] out = subString.toCharArray();

        Arrays.sort(c);
        Arrays.sort(out);

        input = new String(c);
        subString = new String(out);

        return input.equals(subString);
    }

    public static void main(String[] args) {
        AnagramUsingSorting ana = new AnagramUsingSorting();
        System.out.println(ana.isAnangram("Madam*&^123", "    madam 123 "));
    }
}

//Output -- True