package theGame.buttons;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MediumButton {
    private final Button button = new Button();
    private final Stage stage;

    public Button getButton() {
        return button;
    }

    public MediumButton(Stage stage, Scene scene) {
        this.stage = stage;
        button.setText("Medium Mode");
        button.setOnAction(event -> {stage.setScene(scene);
            stage.setTitle("TheRoyalGameOfUr_Medium_Mode");

        });
    }

}
