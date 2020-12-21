package theGame.board;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class OneVsOneBoard {

    GridPane grid = new GridPane();

    public GridPane getGrid() {
        return grid;
    }

    private Background createOneVsOneBoard() {
        BackgroundSize backgroundSize = new BackgroundSize(1200, 600, true, true, true, true);
        Image imageBack = new Image ("file:src/main/resources/finalTlo.png",true);
        BackgroundImage backgroundImage = new BackgroundImage(imageBack, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        return background;
    }

    public OneVsOneBoard() {

        Background background = createOneVsOneBoard();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setBackground(background);
        grid.setPadding(new Insets(10,10,10,10));
    }
}
