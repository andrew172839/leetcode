//Sort Colors
//Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
//Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
//Note:
//You are not suppose to use the library's sort function for this problem.
//Follow up:
//A rather straight forward solution is a two-pass algorithm using counting sort.
//First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
//Could you come up with an one-pass algorithm using only constant space?

//solution 1
import java.util.Arrays;
class sortColors {
	static void sortColor(int[] A) {
		int i = 0;
		int red = 0;
		int white = 0;
		int blue = 0;
		for (i = 0; i <= A.length - 1; i++) {
			if (A[i] == 0) {
				red++;
			}
			else if (A[i] == 1) {
				white++;
			}
			else {
				blue++;
			}
		}
		for (i = 0; i <= red - 1; i++) {
			A[i] = 0;
		}
		for (i = red; i <= red + white - 1; i++) {
			A[i] = 1;
		}
		for (i = red + white; i <= A.length - 1; i++) {
			A[i] = 2;
		}
	}
	public static void main(String[] args) {
		int[] a = {2, 1, 0, 1, 2, 0};
		sortColor(a);
		System.out.print(Arrays.toString(a));
	}
}

//solution 2
import java.util.Arrays;
class sortColors {
	static void sortColor(int[] A) {
		int red = 0;
		int blue = A.length -1;
		int i = 0;
		int temp = 0;
		if ((A.length == 0) || (A.length == 1)) {
			return;
		}
		while (i <= blue) {
			if (A[i] == 0) {
				if (i >= red + 1) {
					temp = A[i];
					A[i] = A[red];
					A[red] = temp;
					red++;
				}
				else {
					red++;
					i++;
				}
			}
			if (A[i] == 2) {
				if (i <= blue - 1) {
					temp = A[blue];
					A[blue] = A[i];
					A[i] = temp;
					blue--;
				}
				else {
					return;
				}
			}
			else {
				i++;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {1, 0, 2, 1, 0, 2};
		sortColor(a);
		System.out.println(Arrays.toString(a));
	}
}
