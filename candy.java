//Candy
//There are N children standing in a line. Each child is assigned a rating value.
//You are giving candies to these children subjected to the following requirements:
//Each child must have at least one candy.
//Children with a higher rating get more candies than their neighbors.
//What is the minimum candies you must give?

//solution 1
import java.util.Arrays;
class candy {
	static int candy(int[] ratings) {
		if (ratings == null) {
			return 0;
		}
		if (ratings.length == 1) {
			return 1;
		}
		int[] candy = new int[ratings.length];
		Arrays.fill(candy, 1);
		for (int i = 1; i <= ratings.length - 1; i++) {
			if (ratings[i] > ratings[i - 1]) {
				candy[i] = candy[i - 1] + 1;
			}
		}
		for (int i = ratings.length - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1] && candy[i] <= candy[i + 1]) {
				candy[i] = candy[i + 1] + 1;
			}
		}
		int result = 0;
		for (int i = 0; i <= candy.length - 1; i++) {
			result = result + candy[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {5, 7, 6, 8};
		System.out.println(candy(a));
	}
}
