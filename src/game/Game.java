package game;
import board.Board;
import player.Player;
public class Game {
    Board board ;
    Player player;


  public Game(Board board,Player player) {
      this.board  = board;
      this.player = player;
  }

  public void play() {
      sudokusolver(0,0);
  }

  public void sudokusolver(int row,int col) {
   if(row == board.size) {
       System.out.println("Sudoku solved");
       board.printBoard();

       return;
   }

   int nrow = 0;
   int ncol = 0;
   if(col == board.size-1) {
       ncol =0;
       nrow = row +1;
   } else {
       ncol = col +1;
       nrow = row;
   }

   if(board.board[row][col] !=0) {
       sudokusolver(nrow,ncol);
   } else {

       for (int i=1;i<=9;i++) {
           if(validPath(board.board,row,col,i)==true) {
               board.board[row][col] = i;
               sudokusolver(nrow,ncol);
               board.board[row][col] = 0;
           }

       }
   }
  }


    private boolean validPath(int [][]matrix ,int row ,int col,int val) {
        for (int i =0;i<board.size;i++) {
            if(matrix[row][i] == val) return false;
        }

        for (int i =0;i<board.size;i++) {
            if(matrix[i][col] == val) return false;
        }

        int nrow = (row/3)*3;
        int ncol = (col/3)*3;

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(board.board[nrow + i][ncol+ i]==val) return false;
            }
        }
        return true;
    }
}
