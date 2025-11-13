import java.util.*;

public class FindMedian {
    /**
     * A class to find the median of two sorted arrays.
     *
     * Methods
     * -------
     * findMedian(List<Integer> l1, List<Integer> l2): double
     *     Returns the median of two sorted arrays l1 and l2.
     */

    public double findMedian(List<Integer> l1, List<Integer> l2) {
        int len1 = l1.size();
        int len2 = l2.size();

        // Ensure l1 is the smaller list
        if (len1 > len2) {
            return findMedian(l2, l1);
        }

        int start = 0, end = len1;

        while (start <= end) {
            int midL1 = (start + end) / 2;
            int midL2 = ((len1 + len2 + 1) / 2) - midL1;

            double maxLeftL1 = (midL1 == 0) ? Double.NEGATIVE_INFINITY : l1.get(midL1 - 1);
            double minRightL1 = (midL1 == len1) ? Double.POSITIVE_INFINITY : l1.get(midL1);

            double maxLeftL2 = (midL2 == 0) ? Double.NEGATIVE_INFINITY : l2.get(midL2 - 1);
            double minRightL2 = (midL2 == len2) ? Double.POSITIVE_INFINITY : l2.get(midL2);

            if (maxLeftL1 <= minRightL2 && maxLeftL2 <= minRightL1) {
                if ((len1 + len2) % 2 != 0) {
                    return Math.max(maxLeftL1, maxLeftL2);
                } else {
                    return (Math.max(maxLeftL1, maxLeftL2) + Math.min(minRightL1, minRightL2)) / 2.0;
                }
            } else if (maxLeftL1 > minRightL2) {
                end = midL1 - 1;
            } else {
                start = midL1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted or invalid");
    }

    public static void main(String[] args) {
        FindMedian medianFinder = new FindMedian();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list2 = Arrays.asList(8, 9, 10);

        double median = medianFinder.findMedian(list1, list2);
        System.out.println("Median: " + median);
    }
}

// Output -- 5.5