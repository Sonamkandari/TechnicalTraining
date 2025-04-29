public class sudoku1 {
    final int Max=9;
 char[][] board;//Instance variable (when object is created)

 public void  solveSudoku(char[][]board){
      this.board=board;  //avoid ing shadow problem // when local variable and instance variable are same
      helper(0, 0);
}

boolean checkINSubGrid(int row,int col,char digit){
     int startRow=row-row%3;
     int startcol=col-col%3;
for(int i=startRow;i<startRow+3;i++){
    for(int j=startcol;j<startcol+3;j++){
        if(board[i][j]==digit){
            return true;
        }
     }
  }return false;

}
boolean checkINCol(int col,char digit){
    for(int i=0;i<Max;i++){
        if(board[i][col]==digit){
            return true;
        }
    }return false;

}
//check in row 
boolean checkINRow(int row,char digit){
    for(int i=0;i<Max;i++){
        if(board[row][i]==digit){
            return true;
        }
    }return false;

}


boolean canIPlace(int row,int col,char digit){
    //check in row
    //check in col
    //check in sub grid

    return  !checkINRow(row, digit) && !checkINCol(col, digit) && !checkINSubGrid(row,col,digit);
}

boolean helper(int row,int col){
    if(col== Max){
        row=row+1;
        col=0;
    }
     //it means sudoku solved
    if(row==Max){
        return true;

    }
    if(board[row][col]!='.'){// skip if board is already filled
        return helper(row, col+1);

    }
    for(char digit='1';digit<='9';digit++){
        if(canIPlace(row,col,digit)){
            board[row][col]=digit;// place a 
            boolean result=helper(row, col+1);
            if(result){
                return true;
            }
            //if not true (backtrack-reach to base or digit in col end)
            board[row][col]='.'; //undo the digit
        }
    }return false;

}

//print board
static void printBoard(char[][] board) {
    for (char[] row : board) {
        for (char cell : row) {
            System.out.print(cell + " ");
        }
        System.out.println();
    }
}



public static void main(String[] args) {

    char[][]board={
        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };
   sudoku1 solver = new sudoku1();
    solver.solveSudoku(board);
    
    System.out.println("Solved Sudoku:");
    printBoard(board);
}
    
}
