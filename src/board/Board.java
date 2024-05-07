package board;
import java.util.*;
import triplet.Triplets;
public class Board {
    int size;
    int [][] board ;

    Board(int size) {
        this.board = new int [size][size];
    }

    public void printBoard() {
        for (int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }


    }

    public void setupBoardConfig(int row,int col,int val) {
        this.board[row][col] = val;
    }

    public void setBoardColVise (int row,List<Integer>Col,List<Integer>val) {
        for (int i =0;i<Col.size();i++) {
            this.board[row][Col.get(i)] = val.get(i);
        }
    }

    public void setBoardTriplet (List<Triplets> triple) {
        for (int i =0;i<triple.size();i++) {
            this.board[triple.get(i).row][triple.get(i).col] = triple.get(i).val;
        }
    }
}

