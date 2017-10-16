//Two Sum III - Data structure design

//solution 1
import java.util.HashMap;
class twoSumIII-DataStructureDesign {
	static class TwoSum {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		void add(int number) {
			if (map.containsKey(number)) {
				map.put(number, map.get(number) + 1);
			}
			else {
				map.put(number, 1);
			}
		}
		boolean find(int value) {
			for (int key: map.keySet()) {
				if (map.containsKey(value - key)) {
					if (value == 2 * key) {
						if (map.get(key) == 1) {
							continue;
						}
						else {
							return true;
						}
					}
					else {
						return true;
					}
				}
			}
			return false;
		}
	}
	public static void main(String[] args) {
		TwoSum a = new TwoSum();
		a.add(1);
		a.add(3);
		a.add(5);
		System.out.println(a.find(4));
		System.out.println(a.find(6));
		System.out.println(a.find(8));
		System.out.println(a.find(10));
	}
}

//solution 2
import java.util.ArrayList;
class twoSumIII-DataStructureDesign {
	static class TwoSum {
		ArrayList<Integer> list = new ArrayList<Integer>();
		void add(int number) {
			list.add(number);
		}
		boolean find(int value) {
			for (int i = 0; i <= list.size() - 1; i++) {
				if (list.contains(value - list.get(i))) {
					if (list.indexOf(value - list.get(i)) == i) {
						continue;
					}
					else {
						return true;
					}
				}
			}
			return false;
		}
	}
	public static void main(String[] args) {
		TwoSum a = new TwoSum();
		a.add(1);
		a.add(3);
		a.add(5);
		System.out.println(a.find(4));
		System.out.println(a.find(6));
		System.out.println(a.find(8));
		System.out.println(a.find(10));
	}
}
