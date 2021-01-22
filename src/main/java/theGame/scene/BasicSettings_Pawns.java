package theGame.scene;

import javafx.scene.layout.GridPane;
import theGame.elements.BoardField;
import theGame.elements.pawns.BluePawn;
import theGame.elements.pawns.Pawn;
import theGame.elements.pawns.YellowPawn;

import java.util.List;

public class BasicSettings_Pawns {

    BasicSettings_Boards basicSettings_boards = new BasicSettings_Boards();
    List<BoardField> blueFields = basicSettings_boards.getBluePlayerFields();
    List<BoardField> yellowFields = basicSettings_boards.getYellowPlayerFields();

    public void prepare_Pawns(GridPane grid) {

        Pawn p1Yellow = new YellowPawn(yellowFields,grid,6,1,"yellow");
        Pawn p2Yellow = new YellowPawn(yellowFields,grid,7,1,"yellow");
        Pawn p3Yellow = new YellowPawn(yellowFields,grid,6,0,"yellow");
        Pawn p4Yellow = new YellowPawn(yellowFields,grid,7,0,"yellow");
        Pawn p1Blue = new BluePawn(blueFields,grid,6,3,"blue");
        Pawn p2Blue = new BluePawn(blueFields,grid,7,3,"blue");
        Pawn p3Blue = new BluePawn(blueFields,grid,6,4,"blue");
        Pawn p4Blue = new BluePawn(blueFields,grid,7,4,"blue");

        grid.add(p1Blue,p1Blue.getStartingColumn(),p1Blue.getStartingRow());
        grid.add(p2Blue,p2Blue.getStartingColumn(),p2Blue.getStartingRow());
        grid.add(p3Blue,p3Blue.getStartingColumn(),p3Blue.getStartingRow());
        grid.add(p4Blue,p4Blue.getStartingColumn(),p4Blue.getStartingRow());

        grid.add(p1Yellow,p1Yellow.getStartingColumn(),p1Yellow.getStartingRow());
        grid.add(p2Yellow,p2Yellow.getStartingColumn(),p2Yellow.getStartingRow());
        grid.add(p3Yellow,p3Yellow.getStartingColumn(),p3Yellow.getStartingRow());
        grid.add(p4Yellow,p4Yellow.getStartingColumn(),p4Yellow.getStartingRow());
    }

}
