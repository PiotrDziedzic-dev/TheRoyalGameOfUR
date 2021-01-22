package theGame.elements;

import javafx.scene.control.TextField;


public class BoxOfTextFields {

    TextField yellowScoreTextField = new TextField("0");
    TextField blueScoreTextField = new TextField("0");
    TextField diceNumberTextField = new TextField("Dice: ");


    public BoxOfTextFields() {
        yellowScoreTextField.setEditable(false);
        yellowScoreTextField.setPrefSize(90,30);
        blueScoreTextField.setEditable(false);
        blueScoreTextField.setPrefSize(90,30);
        diceNumberTextField.setEditable(false);
        diceNumberTextField.setPrefSize(90,30);
    }

    public TextField getYellowScoreTextField() {
        return yellowScoreTextField;
    }

    public TextField getBlueScoreTextField() {
        return blueScoreTextField;
    }

    public TextField getDiceNumberTextField() {
        return diceNumberTextField;
    }
}
