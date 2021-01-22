package theGame.scene;

import javafx.scene.layout.GridPane;
import theGame.elements.BoxOfLabels;
import theGame.elements.BoxOfTextFields;

public class BasicSetting_Label_PvsP_Mode {

    BoxOfLabels boxOfLabels = new BoxOfLabels();
    BoxOfTextFields boxOfTextFields = new BoxOfTextFields();

    public void prepareLabelsAndTextFields(GridPane grid) {

        grid.add(boxOfLabels.getBluePawnsLabel(),4,0);
        grid.add(boxOfLabels.getYellowPawnsLabel(),6,5);

        grid.add(boxOfLabels.getBlueScoreLabel(),0,4);
        grid.add(boxOfLabels.getYellowScoreLabel(),0,0);

        grid.add(boxOfTextFields.getBlueScoreTextField(),1,4);
        grid.add(boxOfTextFields.getYellowScoreTextField(),1,0);

        grid.add(boxOfTextFields.getDiceNumberTextField(),4,4);

    }


}
