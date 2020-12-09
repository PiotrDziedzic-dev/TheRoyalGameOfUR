package theGame.buttons;


import javafx.scene.control.Button;

public class StartingButton1 {

    private Button button = new Button();

    public Button getButton() {
        return button;
    }

    public StartingButton1() {

        button.setText("Player vs PC");
        button.setOnAction(event -> {

        });
    }
}
