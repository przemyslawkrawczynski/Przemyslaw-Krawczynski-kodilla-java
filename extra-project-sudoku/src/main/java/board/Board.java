package board;

public class Board {
   private Place[][] board = new Place[17][17];

   public void createBoard() {
       for(int i=0; i<17; i++) {
           for(int j=0; j<17; j++) {
            if (i/2==0 && j/2 == 0 ) {
                board[i][j] = new Place(i, j);
            } else {
                board[i][j] = new Place(i, j);
            }

            }
       }
   }

   public Place[][] getBoard() {
       return board;
   }
}
