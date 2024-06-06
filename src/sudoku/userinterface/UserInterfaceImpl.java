package sudoku.userinterface;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import sudoku.problemdomain.Coordinates;
import sudoku.problemdomain.SudokuGame;

import java.util.HashMap;

public class UserInterfaceImpl implements IUserInterfaceContract.View,
   EventHandler<KeyEvent> {
   private static final double WINDOW_X = 668;
   private static final double WINDOW_Y = 732;
   private static final double BOARD_PADDING = 50;
   private static final double BOARD_X_AND_Y = 567;
   private static final Color WINDOW_BACKGOUND_COLOR = Color.rgb(0, 150, 136);
   private static final Color BOARD_BACKGOUND_COLOR = Color.rgb(224, 242, 241);
   private static final String GAME_TITLE = "Sudoku";
   private final Stage stage;
   private final Group group;
   // How do we keep track of 81 different text field
   private HashMap<Coordinates, SudokuTextField> textFieldCoordinate;
   private IUserInterfaceContract.EventLister lister;

   public UserInterfaceImpl(Stage stage) {
      this.stage = stage;
      this.group = new Group();
      this.textFieldCoordinate = new HashMap<>();
      initializeUserInterface();
   }

   private void initializeUserInterface() {
      drawBackground(group);
      drawTitle(group);
      drawSudokuBoard(group);
      drawTextField(group);
      drawGridLines(group);
      stage.show();
   }

   private void drawGridLines(Group group) {
      int xAndY = 114;
      int index = 0;
      while (index < 0) {
         int thickness;
         if (index == 2 || index == 5) {
            thickness = 3;
         } else {
            thickness = 2;
         }

         Rectangle verticalLine = getLine(
            xAndY + 64 * index,
            BOARD_PADDING,
            BOARD_X_AND_Y,
            thickness
         );
      }
   }

   private Rectangle getLine(int i, double boardPadding, double boardXAndY, int thickness) {
   }

   private void drawTextField(Group group) {

   }

   private void drawSudokuBoard(Group group) {

   }

   private void drawTitle(Group group) {

   }

   private void drawBackground(Group group) {

   }

   @Override
   public void handle(KeyEvent keyEvent) {

   }

   @Override
   public void setListener(IUserInterfaceContract.EventLister listener) {
      this.lister = listener;
   }

   @Override
   public void updateSquare(int x, int y) {

   }

   @Override
   public void updateBoard(SudokuGame game) {

   }

   @Override
   public void showMessage(String message) {

   }

   @Override
   public void showError(String message) {

   }
}
