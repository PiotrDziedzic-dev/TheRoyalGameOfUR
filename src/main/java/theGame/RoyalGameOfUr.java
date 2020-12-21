package theGame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import theGame.board.ChoseGameModeBoard;
import theGame.board.OneVsOneBoard;
import theGame.board.StartingBoard;



public class RoyalGameOfUr extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        ChoseGameModeBoard choosingGameModeBoard = new ChoseGameModeBoard();
        OneVsOneBoard oneVsOneBoard = new OneVsOneBoard();
        Scene choosingGameModeScene = new Scene(choosingGameModeBoard.getGrid(),1200,600,Color.TRANSPARENT);
        Scene playerVsPlayerScene = new Scene(oneVsOneBoard.getGrid(),1200,600,Color.TRANSPARENT);

        StartingBoard startingBoard = new StartingBoard(primaryStage,choosingGameModeScene,playerVsPlayerScene);
        
        Scene scene = new Scene(startingBoard.getGrid(),1200,600, Color.TRANSPARENT);
        primaryStage.setTitle("TheRoyalGameOfUr");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
