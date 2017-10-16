//Word Search
//Given a 2D board and a word, find if the word exists in the grid.
//The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
//For example, Given board =
//[
//	["ABCE"],
//	["SFCS"],
//	["ADEE"]
//]
//word = "ABCCED", -> returns true, word = "SEE", -> returns true, word = "ABCB", -> returns false.

//solution 1
class wordSearch {
	static boolean dfs(char[][] board, String word, int i, int j, int count) {
		if (count >= word.length()) {
			return true;
		}
		if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length) {
			return false;
		}
		if (board[i][j] != word.charAt(count) || board[i][j] == '*') {
			return false;
		}
		char c = board[i][j];
		board[i][j] = '*';
		boolean result = dfs(board, word, i - 1, j, count + 1) || dfs(board, word, i + 1, j, count + 1) || dfs(board, word, i, j - 1, count + 1) || dfs(board, word, i, j + 1, count + 1);
		board[i][j] = c;
		return result;
	}
	static boolean exist(char[][] board, String word) {
		for (int i = 0; i <= board.length - 1; i++)
			for (int j = 0; j <= board[0].length - 1; j++) {
				if (dfs(board, word, i, j, 0) == true) {
					return true;
				}
			}
		return false;
	}
	public static void main(String[] args) {
		char[][] a = {
			{'A', 'B', 'C', 'E'},
			{'S', 'F', 'C', 'S'},
			{'A', 'D', 'E', 'E'}
		};
		System.out.println(exist(a, "ABCCED"));
		//System.out.println(exist(a, "ABCB"));
	}
}
