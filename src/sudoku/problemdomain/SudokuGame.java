package sudoku.problemdomain;

import java.io.Serializable;

public class SudokuGame implements Serializable {
   private final GameState gameState;
   private final int[][] gridState;
   private static final int GRID_BOUNDARY = 9;

   public SudokuGame(GameState gameState, int[][] gridState) {
      this.gameState = gameState;
      this.gridState = gridState;
   }

   public GameState getGameState() {
      return gameState;
   }

   public int[][] getGridState() {
      return SudokuUtitlity.copyNewArray(gridState);
   }
}
