import java.util.Arrays;
import java.util.List;

public class StockBuySell {

    public int stockBuySell(List<Integer> nums) {
        int l = 0; // buy pointer
        int r = 1; // sell pointer
        int maxProfit = 0;

        while (r < nums.size()) {
            if (nums.get(l) < nums.get(r)) {
                int profit = nums.get(r) - nums.get(l);
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r;
            }
            r++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        StockBuySell stockBuySell = new StockBuySell();
        List<Integer> prices = Arrays.asList(7, 1, 4, 5, 6, 7, 8, 9, 3, 11);
        int result = stockBuySell.stockBuySell(prices);
        System.out.println("Maximum Profit: " + result);
    }
}


//Output -- Maximum Profit: 10