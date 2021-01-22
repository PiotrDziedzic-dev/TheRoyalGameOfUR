package theGame.elements;

import javafx.scene.layout.Region;
import theGame.elements.pawns.Pawn;

public class BoardField extends Region {

    private final int columnIndex;
    private final int rowIndex;
    private final int index;
    private Pawn pawn;

    public BoardField(int columnIndex, int rowIndex, int index) {
        this.columnIndex = columnIndex;
        this.rowIndex = rowIndex;
        this.index = index;
    }

    public Pawn getPawn() {
        return pawn;
    }

    public String getPawnColor() {
        if(pawn!= null) {
            return pawn.getColor();
        }
        return "";
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public int getIndex() {
        return index;
    }

    public boolean isBusy() {
        return pawn!=null;
    }
    public void setBusy(Pawn pawn) {
        this.pawn = pawn;
    }
}
