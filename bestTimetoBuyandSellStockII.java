//Best Time to Buy and Sell Stock II
//Say you have an array for which the ith element is the price of a given stock on day i.
//Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

//solution 1
class bestTimeToBuyAndSellStockII {
	static int maxProfit(int[] price) {
		if (price == null || price.length == 0) {
			return 0;
		}
		int result = 0;
		for (int i = 1; i <= price.length - 1; i++) {
			result = result + Math.max(price[i] - price[i - 1], 0);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 15};
		System.out.println(maxProfit(a));
	}
}
