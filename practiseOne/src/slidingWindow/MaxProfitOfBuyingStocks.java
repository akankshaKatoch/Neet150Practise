package slidingWindow;

public class MaxProfitOfBuyingStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,6,7};
        int maxProfit = findMaxProfit(prices);
        System.out.println(maxProfit);
    }

    private static int findMaxProfit(int[] prices) {
        int profit = 0;
        int left = 0;
        int right = 1;

        while(right<prices.length){
            if(prices[left] <prices[right]){
                profit = Math.max(profit, (prices[right]-prices[left]));
                }
            else{
                left = right;
            }
            right++;
        }
        return profit;
    }
}
