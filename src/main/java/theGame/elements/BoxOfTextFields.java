package theGame.elements;

import javafx.scene.control.TextField;


public class BoxOfTextFields {

    static TextField yellowScoreTextField = new TextField("0");
    static TextField blueScoreTextField = new TextField("0");
    static TextField diceNumberTextField = new TextField("Dice: ");


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
