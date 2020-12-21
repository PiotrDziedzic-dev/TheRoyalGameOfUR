package theGame.buttons;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartingButton1 {

    private final Button button = new Button();
    private final Stage stage;

    public Button getButton() {
        return button;
    }

    public StartingButton1(Stage stage, Scene scene) {
        this.stage = stage;
        button.setText("Player vs PC");
        button.setOnAction(event -> {stage.setScene(scene);
        stage.setTitle("TheRoyalGameOfUr_SelectingGameMode");

        });
    }
}
