//Valid Sudoku
//Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
//The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
//A partially filled sudoku which is valid.
//Note:
//A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

//solution 1
import java.util.HashSet;
class validSudoku {
	static boolean isSudoku(char[][] broad) {
		for (int i = 0; i <= 8; i++) {
			HashSet<Character> set1 = new HashSet<Character>();
			for (int j = 0; j <= 8; j++) {
				if (broad[i][j] != '.' && set1.contains(broad[i][j])) {
					return false;
				}
				else {
					set1.add(broad[i][j]);
				}
			}
		}
		for (int j = 0; j <= 8; j++) {
			HashSet<Character> set2 = new HashSet<Character>();
			for (int i = 0; i <= 8; i++) {
				if (broad[i][j] != '.' && set2.contains(broad[i][j])) {
					return false;
				}
				else {
					set2.add(broad[i][j]);
				}
			}
		}
		for (int i = 0; i <= 8; i = i + 3)
			for (int j = 0; j <= 8; j = j + 3) {
				HashSet<Character> set3 = new HashSet<Character>();
				for (int m = i; m < i + 3; m++)
					for (int n = j; n < j + 3; n++) {
						if (broad[m][n] != '.' && set3.contains(broad[m][n])) {
							return false;
						}
						else {
							set3.add(broad[m][n]);
						}
					}
			}
		return true;
	}
	public static void main(String[] args) {
		char[][] a = {
			{'1', '2', '3', '4', '5', '6', '7', '8', '9'},
			{'1', '2', '3', '4', '5', '6', '7', '8', '9'},
			{'1', '2', '3', '4', '5', '6', '7', '8', '9'},
			{'1', '2', '3', '4', '5', '6', '7', '8', '9'},
			{'1', '2', '3', '4', '5', '6', '7', '8', '9'},
			{'1', '2', '3', '4', '5', '6', '7', '8', '9'},
			{'1', '2', '3', '4', '5', '6', '7', '8', '9'},
			{'1', '2', '3', '4', '5', '6', '7', '8', '9'},
			{'1', '2', '3', '4', '5', '6', '7', '8', '9'}
		};
		System.out.println(isSudoku(a));
	}
}
