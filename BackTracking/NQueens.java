public class NQueens {
    public static boolean isSafe(char board[][], int row,int col){
        //vertical up 
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++ ){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    // Column loop
    public static void nQueens(char board[][], int row) {
        // Base case: If all rows are filled, print the board
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // Try placing a queen in each column of the current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Place the queen
                nQueens(board, row + 1); // Recur to place queens in the next row
                board[row][j] = 'x'; // Backtrack by removing the queen
            }

        }
    }

    // Function to print the chessboard
    public static void printBoard(char board[][]) {
        System.out.println("---------- chess board --------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main function to execute the program
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        // Initialize the board with empty cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        // Start solving the N-Queens problem
        nQueens(board, 0);
    }
}
