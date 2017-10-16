//Add Binary
//Given two binary strings, return their sum (also a binary string).
//For example,
//    a = "11"
//    b = "1"
//    Return "100".

//solution 1
class addBinary {
	static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i1 = a.length() - 1;
		int i2 = b.length() - 1;
		int d1 = 0;
		int d2 = 0;
		int carry = 0;
		while (i1 >= 0 || i2 >= 0) {
			if (i1 < 0) {
				d1 = 0;
			}
			else {
				d1 = Integer.parseInt(Character.toString(a.charAt(i1)));
			}
			if (i2 < 0) {
				d2 = 0;
			}
			else {
				d2 = Integer.parseInt(Character.toString(b.charAt(i2)));
			}
			sb.append((d1 + d2 + carry) % 2);
			carry = (d1 + d2 + carry) / 2;
			i1--;
			i2--;
		}
		if (carry == 1) {
			sb.append(carry);
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		String s1 = "11";
		String s2 = "1";
		System.out.println(addBinary(s1, s2));
	}
}
