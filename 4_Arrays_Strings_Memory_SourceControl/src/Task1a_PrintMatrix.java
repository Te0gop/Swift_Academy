
public class Task1a_PrintMatrix {
	public static void main(String[] args) {
		
		int[][] board = new int[5][5];
		
		
		for (int rows = 1; rows < 5; rows++) {
			for (int cols= 0; cols <4; cols++) {
				board[rows][cols] = cols+rows;
				
				
			}

		}
		
		for (int rows = 1; rows < 5; rows++) {
			for (int cols = 0; cols < 4; cols++) {
				board[rows][cols] = cols+rows;
				System.out.print(board[rows][cols] + " ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
