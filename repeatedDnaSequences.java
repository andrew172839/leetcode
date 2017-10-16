//Repeated DNA Sequences (without bit operation)

//solution 1    
import java.util.ArrayList;
class repeatedDnaSequences {
	static ArrayList<String> findRepeatedDnaSequences(String s) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i + 10 <= s.length(); i++) {
			if (list.contains(s.substring(i, i + 10))) {
				result.add(s.substring(i, i + 10));
			}
			else {
				list.add(s.substring(i, i + 10));
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		System.out.println(findRepeatedDnaSequences(str));
	}
}

//solution 2
import java.util.ArrayList;
import java.util.HashMap;
class repeatedDnaSequences {
	static ArrayList<String> findRepeatedDnaSequences(String s) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i + 10 <= s.length(); i++) {
			if (map.containsValue(s.substring(i, i + 10)) && result.contains(s.substring(i, i + 10)) == false) {
				result.add(s.substring(i, i + 10));
			}
			else {
				map.put(i, s.substring(i, i + 10));
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTTCCCCCAAAAA";
		System.out.println(findRepeatedDnaSequences(str));
	}
}
