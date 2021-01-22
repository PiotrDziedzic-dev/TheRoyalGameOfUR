package theGame.board;


import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import theGame.buttons.StartingButton1;
import theGame.buttons.StartingButton2;


public class MenuBoard {

    GridPane grid = new GridPane();

    public GridPane getGrid() {
        return grid;
    }

    private Background createStartingBackground() {
        BackgroundSize backgroundSize = new BackgroundSize(1200, 600, true, true, true, true);
        Image imageBack = new Image ("file:src/main/resources/StartingBoard.png");
        BackgroundImage backgroundImage = new BackgroundImage(imageBack, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        return new Background(backgroundImage);
    }

    public MenuBoard(Stage stage, Scene scene1, Scene scene2) {

        StartingButton1 startingButton1 = new StartingButton1(stage,scene1);
        Button button1 = startingButton1.getButton();

        StartingButton2 startingButton2 = new StartingButton2(stage,scene2);
        Button button2 = startingButton2.getButton();

        Background background = createStartingBackground();

        for(int i=0; i<6;i++) {
            RowConstraints row = new RowConstraints(100);
            grid.getRowConstraints().add(row);
        }

        for(int i=0; i<12;i++) {
            ColumnConstraints column = new ColumnConstraints(100);
            grid.getColumnConstraints().add(column);
        }

        grid.add(button1,5,2);
        grid.add(button2,5,4);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setBackground(background);
        grid.setPadding(new Insets(10,10,10,10));
    }
}
