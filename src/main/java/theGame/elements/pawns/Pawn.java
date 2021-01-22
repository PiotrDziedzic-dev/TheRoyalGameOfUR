package theGame.elements.pawns;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import theGame.elements.AlertBox;
import theGame.elements.BoardField;
import theGame.elements.BoxOfTextFields;
import theGame.elements.Dice;

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
    private final BoxOfTextFields boxOfTextFields = new BoxOfTextFields();

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

    public final void calculatePosition(GridPane grid) {

        BoardField currentField = findFieldByIndex(boardFieldList, index);
        BoardField incomingField = findFieldByIndex(boardFieldList, index + Dice.getDiceNumber());

        if(!Dice.getCanMove()) {

            AlertBox.display("Dice First","You must roll the dice first");

        } else {

            if(incomingField.getIndex() == 20) {
                grid.getChildren().remove(this);
                currentField.setBusy(null);
                Dice.setCanMove(false);
                Dice.setCanRoll();
                if (this.getColor().equals("blue")) {
                    bluePlayerScore++;
                    boxOfTextFields.getBlueScoreTextField().setText(Integer.toString(bluePlayerScore));
                    if(bluePlayerScore>=4) {
                        AlertBox.display("Blue player won", "Blue player won");
                    }
                } else {
                    yellowPlayerScore++;
                    boxOfTextFields.getYellowScoreTextField().setText(Integer.toString(yellowPlayerScore));
                    if(yellowPlayerScore>=4) {
                        AlertBox.display("Yellow player won", "Yellow player won");
                    }
                }
            } else {
                if(!incomingField.isBusy()) {
                    currentField.setBusy(null);
                    incomingField.setBusy(this);
                    Dice.setCanMove(false);
                    index = index + Dice.getDiceNumber();
                    grid.getChildren().remove(this);
                    grid.add(this,incomingField.getColumnIndex(),incomingField.getRowIndex());
                    Dice.setCanRoll();
                } else if (!this.getColor().equals(incomingField.getPawnColor())) {
                    currentField.setBusy(null);
                    Dice.setCanMove(false);
                    index = index + Dice.getDiceNumber();
                    grid.getChildren().remove(this);
                    grid.getChildren().remove(incomingField.getPawn());
                    grid.add(this,incomingField.getColumnIndex(), incomingField.getRowIndex());
                    grid.add(incomingField.getPawn(), incomingField.getPawn().startingColumn, incomingField.getPawn().startingRow);
                    incomingField.getPawn().setIndex(0);
                    incomingField.setBusy(this);
                    Dice.setCanRoll();
                } else {
                    AlertBox.display("Field is busy","Field is busy");
                }
            }

        }

    }

}
