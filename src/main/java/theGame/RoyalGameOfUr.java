package theGame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import theGame.board.GameBoard;
import theGame.board.MenuBoard;


public class RoyalGameOfUr extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GameBoard gameBoard = new GameBoard();
        Scene playerVsPlayerScene = new Scene(gameBoard.getGrid(),1200,600,Color.TRANSPARENT);

        MenuBoard menuBoard = new MenuBoard(primaryStage,playerVsPlayerScene);
        
        Scene scene = new Scene(menuBoard.getGrid(),1200,600, Color.TRANSPARENT);
        primaryStage.setTitle("TheRoyalGameOfUr");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
