package theGame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import theGame.board.ChoseGameModeBoard;
import theGame.board.OneVsOneBoard;
import theGame.board.MenuBoard;


public class RoyalGameOfUr extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        OneVsOneBoard oneVsOneBoard = new OneVsOneBoard();
        Scene playerVsPlayerScene = new Scene(oneVsOneBoard.getGrid(),1200,600,Color.TRANSPARENT);
        ChoseGameModeBoard choosingGameModeBoard = new ChoseGameModeBoard(primaryStage,playerVsPlayerScene);
        Scene choosingGameModeScene = new Scene(choosingGameModeBoard.getGrid(),1200,600,Color.TRANSPARENT);

        MenuBoard menuBoard = new MenuBoard(primaryStage,choosingGameModeScene,playerVsPlayerScene);
        
        Scene scene = new Scene(menuBoard.getGrid(),1200,600, Color.TRANSPARENT);
        primaryStage.setTitle("TheRoyalGameOfUr");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
