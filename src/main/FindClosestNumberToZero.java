public class FindClosestNumberToZero {
    public int findClosestNum(int[] input) {
        int result = Integer.MAX_VALUE;

        for(int n : input) {
            if(Math.abs(n) < Math.abs(result) || n == Math.abs(result)) {
                result = n;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FindClosestNumberToZero findClosest = new FindClosestNumberToZero();
        System.out.println(findClosest.findClosestNum(new int[]{-10,-2,10,3,5}));
    }
}
