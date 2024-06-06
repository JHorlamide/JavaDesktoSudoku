package sudoku.userinterface;

import sudoku.problemdomain.SudokuGame;

public interface IUserInterfaceContract {
   interface EventLister {
      void onSudokuInput(int x, int y, int input);
      void onDialogClick();
   }

   interface View {
      void setListener(IUserInterfaceContract.EventLister listener);
      void updateSquare(int x, int y);
      void updateBoard(SudokuGame game);
      void showMessage(String message);
      void showError(String message);
   }
}
