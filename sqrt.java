//Sqrt(x)
//    Implement int sqrt(int x).
//    Compute and return the square root of x.

//solution 1
class sqrt {
	static int sqrt(int a) {
		double x = 1.0;
		while (Math.abs(x * x - a) > 1.0E-6) {
			x = (x + a / x) / 2;
		}
		return (int)x;
	}
	public static void main(String[] args) {
		System.out.println(sqrt(16));
	}
}
