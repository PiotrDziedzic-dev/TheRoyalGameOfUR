package theGame.elements.pawns;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import theGame.elements.BoardField;
import theGame.elements.BoxOfLabels;

import java.util.List;

public abstract class Pawn extends Button {

    private int index;
    private final int startingColumn;
    private final int startingRow;
    private final List<BoardField> boardFieldList;
    private final String color;
    private static int yellowPlayerScore = 0;
    private static int bluePlayerScore = 0;

    private final BoardField outsideBoardField = new BoardField(0,0,20);
    BoxOfLabels boxOfLabels = new BoxOfLabels();

    public Pawn(List<BoardField> boardFields, GridPane grid, int startingColumn, int startingRow, String color) {
        setStyle("-fx-background-color: transparent;");
        this.boardFieldList = boardFields;
        this.startingColumn = startingColumn;
        this.startingRow = startingRow;
        this.color = color;
        setOnAction(e->calculatePosition(grid));
    }

    public int getStartingColumn() {
        return startingColumn;
    }

    public int getStartingRow() {
        return startingRow;
    }

    public String getColor() {
        return color;
    }

    private BoardField findFieldByIndex(List<BoardField> fields, int index) {
        for(BoardField f : fields) {
            if(f.getIndex() == index) {
                return f;
            }
        }
        return outsideBoardField;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
