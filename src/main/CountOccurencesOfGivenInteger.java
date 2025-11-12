public class CountOccurencesOfGivenInteger {
    public int countIntegerOccurrences(int[] input, int target) {
        int count = 0;
        for (int j : input) {
            if (j == target) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountOccurencesOfGivenInteger countInt = new CountOccurencesOfGivenInteger();

        System.out.println(countInt.countIntegerOccurrences(new int[]{1, 2, 3, 4, 5, 5, 5, 5, 6}, 5));
    }
}
