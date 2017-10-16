//Container With Most Water
//Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//Note: You may not slant the container.

//solution 1
class containerWithMostWater {
	static int maxArea(int height[]) {
		int start = 0;
		int end = height.length - 1;
		int maxArea = 0;
		while (start < end) {
			maxArea = Math.max(maxArea, Math.min(height[start], height[end]) * (end - start));
			if (height[start] < height[end]) {
				start++;
			}
			else {
				end--;
			}
		}
		return maxArea;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		System.out.println(maxArea(a));
	}
}
