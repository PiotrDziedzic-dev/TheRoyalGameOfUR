package theGame;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import theGame.board.StartingBoard;

import java.awt.*;

public class RoyalGameOfUr extends Application {



    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        StartingBoard startingBoard = new StartingBoard();

        Scene scene = new Scene(startingBoard,1200,600, Color.BLACK);
        primaryStage.setTitle("TheRoyalGameOfUr");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();


    }
}
