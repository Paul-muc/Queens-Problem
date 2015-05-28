public class task {

	public static final int LENGHT = 4;

	public static void main(String... args) {

		boolean[][] board = initBoard();

		board[0][0] = true;

		printBoard(board);

		System.out.println(validateVertical(0, board));

	}

	/**
	 * init a new board
	 * 
	 * @return a new board
	 */
	public static boolean[][] initBoard() {
		return new boolean[LENGHT][LENGHT];

	}

	/**
	 * Print given board.
	 * 
	 * @param board
	 */
	public static void printBoard(boolean[][] board) {
		String output = "";

		for (boolean[] arr : board) {
			for (boolean val : arr) {
				output += val + "\t";
			}
			output += "\n";
		}
		System.out.println(output);
	}

	/**
	 * 
	 * 
	 * 
	 * @param x
	 * @param board
	 * @return
	 */
	public static boolean validateVertical(int x, boolean[][] board) {
		for (int y = 0; y < board.length; y++) {
			if (board[y][x]) {
				return false;
			}
		}
		return true;
	}

}