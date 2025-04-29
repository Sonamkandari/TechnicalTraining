import java.util.Scanner;

public class nQueens {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  the number");
        int n=sc.nextInt();
        //let we take a chess board
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        //now creating a function where we will pass some values
        nQueens(board,0);
        
       }
        
            private static void nQueens(char[][] board, int row) {// this will decide at which row we have to place a queen
              int n=board.length;
              if(row==n){
                //print the chess board
                for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                 System.out.print(board[i][j]);
            
            }
            System.out.println();
        }
        System.out.println();
        return;

 }
              for(int j=0;j<n;j++){// traversing in a particular row
                if(isSafe(board,row,j)){
                                    board[row][j]='Q';
                                    nQueens(board,row+1);
                                    board[row][j]='.';//backtracking
                       }   
                    }      
                  }
                
        private static boolean isSafe(char[][] board, int row, int col) {
        int n=board.length;
        //check row 
        for(int j=0;j<n;j++){
          if(board[row][j]=='Q')return false;
        }

        //check the col
        for(int i=0;i<n;i++){
          if(board[i][col]=='Q')return false;

        }
        int i=row;
        int j=col;
        while(i>=0 && j<n){
          if(board[i][j]=='Q')return false;
          j++;
          i--;
        }
        //check south East

         i=row;
         j=col;
         while(i<n&&j<n){
          if(board[i][j]=='Q')
         return false;
         i++;
         j++;

         }

         // South west
         i=row;
         j=col;
         while(i<n&&j>=0){
          if(board[i][j]=='Q')
         return false;
         i++;
         j--;

         }

         //North west

         i=row;
         j=col;
         while(i>=0&&j>=0){
          if(board[i][j]=='Q')
         return false;
         i--;
         j--;

         }
         return true;


      }
    
}
