package sudoku;

import javafx.application.Application;
import javafx.stage.Stage;
import sudoku.userinterface.IUserInterfaceContract;
import sudoku.userinterface.UserInterfaceImpl;

import java.io.IOException;

public class SudokuApplication extends Application {
   private IUserInterfaceContract.View uiImpl;

   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {
      uiImpl = new UserInterfaceImpl(stage);

      try {
         SudokuBuildLogic.build(uiImpl);
      } catch (IOException e) {
         e.printStackTrace();
         throw e;
      }
   }
}