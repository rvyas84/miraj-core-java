public class CountOccurrenceOfGivenChar {

    public int countGivenChar(String input, char target) {
        int count = 0;

        for(char c : input.toCharArray()) {
            if (c == target) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountOccurrenceOfGivenChar charCount = new CountOccurrenceOfGivenChar();
        char target = 't';
        System.out.println("Count of character \'" +target + "\' is " + charCount.countGivenChar("Thisisateststring", target));
    }
}
