package theGame.elements.pawns;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import theGame.elements.BoardField;

import java.util.List;

public class BluePawn extends Pawn {

    public BluePawn(List<BoardField> boardFields, GridPane grid, int staringColumn, int startingRow, String color) {
        super(boardFields,grid,staringColumn,startingRow,color);
        setGraphic(new ImageView(new Image("file:src/main/resources/Blue-Pawn.png")));

    }
}
