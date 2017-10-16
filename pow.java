//Pow(x, n)
//    Implement pow(x, n).

//solution 1
class pow {
	static double pow(double x, int n) {
		double result = 0;
		if (n == 0) {
			result = 1;
		}
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				result = result * x;
			}
		}
		if (n < 0) {
			for (int i = 1; i <= Math.abs(n); i++) {
				result = result * (1 / x);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(pow(2, -2));
	}
}

//solution 2
class pow {
	static double pow(double x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return x;
		}
		if (n == -1) {
			return 1 / x;
		}
		if (n > 0) {
			return (pow(x, n / 2) * pow(x, n - n / 2));
		}
		else {
			return (pow(x, n / 2) * pow(x, n - n / 2));
		}
	}
	public static void main(String[] args) {
		System.out.println(pow(2, -4));
	}
}
