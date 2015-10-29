import java.util.HashSet;
import java.util.Set;

/*Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.*/

public class ValidSudoku {
	public static void main(String[] args) {
		char[][] board = 
				{{'1', '2', '3','.','.','.','.','.','.'}, 
				{'4', '5', '6','.','.','.','.','.','.'},
				{'7', '8', '9','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'}};		
		System.out.println("Is Sudoku board valid--->"+isValidSudoku(board));

	}

	public static boolean isValidSudoku(char[][] board) {
		Set<String> set = new HashSet<String>();
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(board[i][j]!='.'){
					String value = "("+board[i][j]+")";
					if(!set.add(i+value) || !set.add(value+j)||!set.add(i/3+value+j/3))
						return false;
				}
			}
		}
		return true;
	}
}










