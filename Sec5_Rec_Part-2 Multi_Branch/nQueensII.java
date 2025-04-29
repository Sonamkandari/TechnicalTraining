import java.util.Scanner;

public class nQueensII {
    static boolean[][] board; // Define the board as a class variable

 // Check if there's a queen in the left diagonal (↖)
 static boolean checkInLeft(int row, int col) {
  for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j]) {
          return false;
      }
  }
  return true;
}

// Check if there's a queen in the right diagonal (↗)
static boolean checkInRight(int row, int col) {
  for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j]) {
          return false;
      }
  }
  return true;
}


  // Check if there's a queen in the same column above
  static boolean checkInAboveRow(int row, int col) {
    for (int i = row; i >= 0; i--) {
        if (board[i][col]) { // Queen found
            return false;
        }
    }
    return true;
}

    // Check if a queen can be placed at board[row][col]
    static boolean canIPlaceQueen(int row, int col) {
      return checkInAboveRow(row, col) && checkInLeft(row, col) && checkInRight(row, col);
  }


     // Recursive backtracking function
     static int helper(int row, int n) {
      // Base case: If all queens are placed
      if (row == n) {
          return 1;
      }

      int count = 0;
      for (int col = 0; col < n; col++) {
          if (canIPlaceQueen(row, col)) {
              board[row][col] = true;  // Place the queen

              count += helper(row + 1, n); // Recursive call to place the next queen
              
              board[row][col] = false; // Backtrack (undo the placement)
          }
      }
      return count;
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        board = new boolean[n][n]; // Initialize the board
        int count = helper(0, n);
        System.out.println("Total number of ways to place queens: " + count);
        sc.close();
    }
}
