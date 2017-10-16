//Best Time to Buy and Sell Stock III
//Say you have an array for which the ith element is the price of a given stock on day i.
//Design an algorithm to find the maximum profit. You may complete at most two transactions.
//Note:
//You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

//solution 1
class bestTimeToBuyAndSellStockIII {
	static int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int buy = prices[0];
		int[] profitLeft = new int[prices.length];
		for (int i = 1; i <= prices.length - 1; i++) {
			profitLeft[i] = Math.max(profitLeft[i - 1], prices[i] - buy);
			buy = Math.min(buy, prices[i]);
		}
		int sell = prices[prices.length - 1];
		int[] profitRight = new int[prices.length];
		for (int i = prices.length - 2; i >= 0; i--) {
			profitRight[i] = Math.max(profitRight[i + 1], sell - prices[i]);
			sell = Math.max(sell, prices[i]);
		}
		int result = 0;
		for (int i = 0; i <= prices.length - 1; i++) {
			result = Math.max(result, profitLeft[i] + profitRight[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {3, 5, 0, 3, 1, 10};
		System.out.println(maxProfit(a));
	}
}
