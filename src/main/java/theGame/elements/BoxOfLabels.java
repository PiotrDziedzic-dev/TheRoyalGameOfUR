package theGame.elements;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class BoxOfLabels {

    private final Label yellowPawnsLabel = new Label("Player 1");
    private final Label bluePawnsLabel = new Label("Player 2");
    private final Label yellowScoreLabel = new Label("Score: ");
    private final Label blueScoreLabel = new Label("Score: ");

    public BoxOfLabels() {

        yellowPawnsLabel.setFont(new Font("Arial",24));
        yellowPawnsLabel.setTextFill(Color.web("#0000FF"));

        bluePawnsLabel.setFont(new Font("Arial",24));
        bluePawnsLabel.setTextFill(Color.web("#0000FF"));

        yellowScoreLabel.setFont(new Font("Arial",24));
        yellowScoreLabel.setTextFill(Color.web("#0000FF"));

        blueScoreLabel.setFont(new Font("Arial",24));
        blueScoreLabel.setTextFill(Color.web("#0000FF"));

    }

    public Label getYellowPawnsLabel() {
        return yellowPawnsLabel;
    }

    public Label getBluePawnsLabel() {
        return bluePawnsLabel;
    }

    public Label getYellowScoreLabel() {
        return yellowScoreLabel;
    }

    public Label getBlueScoreLabel() {
        return blueScoreLabel;
    }
}
