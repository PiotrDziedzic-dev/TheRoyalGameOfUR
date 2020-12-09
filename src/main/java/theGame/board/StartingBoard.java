package theGame.board;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import theGame.buttons.StartingButton1;
import theGame.buttons.StartingButton2;



public class StartingBoard {

    StartingButton1 startingButton1 = new StartingButton1();
    Button button1 = startingButton1.getButton();

    StartingButton2 startingButton2 = new StartingButton2();
    Button button2 = startingButton2.getButton();

    GridPane grid = new GridPane();

    public GridPane getGrid() {
        return grid;
    }

    private Background createStartingBackground() {
        BackgroundSize backgroundSize = new BackgroundSize(1200, 600, true, true, true, true);
        Image imageBack = new Image ("file:scr/main/resources/TłoStartowe.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(imageBack, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        return background;
    }

    public StartingBoard() {

        Background background = createStartingBackground();

        //wrzucic je na grida

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setBackground(background);
        grid.setPadding(new Insets(10,10,10,10));

    }
}
