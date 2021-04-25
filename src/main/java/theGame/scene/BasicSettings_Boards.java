package theGame.scene;

import javafx.scene.layout.GridPane;
import theGame.elements.BoardField;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BasicSettings_Boards {

    List<BoardField> yellowPlayerFields;
    List<BoardField> bluePlayerFields;

    public List<BoardField> getYellowPlayerFields() {
        return yellowPlayerFields;
    }

    public List<BoardField> getBluePlayerFields() {
        return bluePlayerFields;
    }

    private List<BoardField> createPath(BoardField ...fields) {
        return new LinkedList<>(Arrays.asList(fields));
    }

    public void addingBoardsOnGrid(GridPane grid, BoardField ...fields) {
        for(BoardField f : fields) {
            grid.add(f,f.getColumnIndex(),f.getRowIndex());
        }
    }

    public void prepare_Board(GridPane gridPane) {

        BoardField boardField1b = new BoardField(5,3,1);
        BoardField boardField2b = new BoardField(4,3,2);
        BoardField boardField3b = new BoardField(3,3,3);
        BoardField boardField4b = new BoardField(2,3,4);
        BoardField boardField13b = new BoardField(9,3,13);
        BoardField boardField14b = new BoardField(8,3,14);

        BoardField boardField5 = new BoardField(2,2,5);
        BoardField boardField6 = new BoardField(3,2,6);
        BoardField boardField7 = new BoardField(4,2,7);
        BoardField boardField8 = new BoardField(5,2,8);
        BoardField boardField9 = new BoardField(6,2,9);
        BoardField boardField10 = new BoardField(7,2,10);
        BoardField boardField11= new BoardField(8,2,11);
        BoardField boardField12 = new BoardField(9,2,12);

        BoardField boardField1y = new BoardField(5,1,1);
        BoardField boardField2y = new BoardField(4,1,2);
        BoardField boardField3y = new BoardField(3,1,3);
        BoardField boardField4y = new BoardField(2,1,4);
        BoardField boardField13y = new BoardField(9,1,13);
        BoardField boardField14y = new BoardField(8,1,14);

        yellowPlayerFields = createPath(boardField1y,boardField2y,boardField3y,boardField4y,boardField5,boardField6,boardField7,boardField8,
                boardField9,boardField10,boardField11, boardField12,boardField13y,boardField14y);

        bluePlayerFields = createPath(boardField1b,boardField2b,boardField3b,boardField4b,boardField5,boardField6,boardField7,boardField8,
                boardField9,boardField10,boardField11, boardField12,boardField13b,boardField14b);

        addingBoardsOnGrid(gridPane,boardField1b,boardField2b,boardField3b,boardField4b,boardField13b,boardField14b,boardField5,boardField6,boardField7,
                boardField8,boardField9,boardField10,boardField11,boardField12,boardField1y,boardField2y,boardField3y,boardField4y,boardField13y,boardField14y);

    }
}
