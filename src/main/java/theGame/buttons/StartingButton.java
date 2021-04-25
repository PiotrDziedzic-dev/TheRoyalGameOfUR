package theGame.buttons;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartingButton {

    private final Button button = new Button();
    private final Stage stage;

    public Button getButton() {
        return button;
    }

    public StartingButton(Stage stage, Scene scene) {
        this.stage = stage;
        button.setText("Start game");
        button.setOnAction(event -> {stage.setScene(scene);
        stage.setTitle("TheRoyalGameOfUr_Menu");

        });
    }
}
