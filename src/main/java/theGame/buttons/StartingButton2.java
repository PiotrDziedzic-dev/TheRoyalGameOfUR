package theGame.buttons;


import javafx.scene.control.Button;

public class StartingButton2 {

    private Button button = new Button();

    public Button getButton() {
        return button;
    }

    public StartingButton2() {

        button.setText("Player vs Player");
        button.setOnAction(event -> {

        });
    }
}
