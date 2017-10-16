//Best Time to Buy and Sell Stock
//Say you have an array for which the ith element is the price of a given stock on day i.
//If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

//solution 1
class bestTimeToBuyAndSellStock {
	static int maxProfit(int[] prices) {
		int bottom = Integer.MAX_VALUE;
		int result = 0;
		for (int i = 0; i <= prices.length - 1; i++) {
			bottom = Math.min(prices[i], bottom);
			result = Math.max(prices[i] - bottom, result);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 34, 15};
		System.out.println(maxProfit(a));
	}
}
