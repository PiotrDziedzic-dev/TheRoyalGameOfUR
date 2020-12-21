package theGame.buttons;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartingButton2 {

    private final Button button = new Button();
    private final Stage stage;

    public Button getButton() {
        return button;
    }

    public StartingButton2(Stage stage, Scene scene) {
        this.stage = stage;
        button.setText("Player vs Player");
        button.setOnAction(event -> { stage.setScene(scene);
        stage.setTitle("TheRoyalGameOfUr 1_VS_1_MODE");

        });
    }
}
