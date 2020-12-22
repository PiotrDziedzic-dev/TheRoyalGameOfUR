package theGame.board;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import theGame.buttons.HardButton;
import theGame.buttons.MediumButton;

public class ChoseGameModeBoard {

    GridPane grid = new GridPane();

    public GridPane getGrid() {
        return grid;
    }

    private Background createChoosingBackground() {
        BackgroundSize backgroundSize = new BackgroundSize(1200, 600, true, true, true, true);
        Image imageBack = new Image ("file:src/main/resources/GameMode.png");
        BackgroundImage backgroundImage = new BackgroundImage(imageBack, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        return background;
    }

    public ChoseGameModeBoard(Stage stage, Scene scene) {

        MediumButton mediumButtonObject = new MediumButton(stage,scene);
        Button mediumButton = mediumButtonObject.getButton();
        HardButton hardButtonObject = new HardButton(stage,scene);
        Button hardButton = hardButtonObject.getButton();

        Background background = createChoosingBackground();

        for(int i=0; i<6;i++) {
            RowConstraints row = new RowConstraints(100);
            grid.getRowConstraints().add(row);
        }

        for(int i=0; i<12;i++) {
            ColumnConstraints column = new ColumnConstraints(100);
            grid.getColumnConstraints().add(column);
        }

        grid.add(mediumButton,5,2);
        grid.add(hardButton,5,4);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setBackground(background);
        grid.setPadding(new Insets(10,10,10,10));
    }
}

