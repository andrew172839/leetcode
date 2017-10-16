//Gas Station
//There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
//You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.
//Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

//solution 1
class gasStation {
	static int canCompleteCircuit(int[] gas, int[] cost) {
		int sum = 0;
		int total = 0;
		int index = 0;
		for (int i = 0; i <= gas.length - 1; i++) {
			sum = sum + gas[i] - cost[i];
			if (sum < 0) {
				sum = 0;
				index = i + 1;
			}
			total = total + gas[i] - cost[i];
		}
		if (total >= 0) {
			return index;
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		int[] gas = {3, 1, 2, 5, 4};
		int[] cost = {4, 1, 1, 2, 3};
		System.out.println(canCompleteCircuit(gas, cost));
	}
}
