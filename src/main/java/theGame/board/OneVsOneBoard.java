package theGame.board;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import theGame.elements.BoxOfTextFields;
import theGame.elements.Dice;
import theGame.scene.BasicSetting_Label_PvsP_Mode;
import theGame.scene.BasicSettings_Boards;
import theGame.scene.BasicSettings_Pawns;

public class OneVsOneBoard {

    GridPane grid = new GridPane();
    Button diceTossButton = new Button();
    BoxOfTextFields boxOfTextFields = new BoxOfTextFields();
    int numberOnDice;


    public GridPane getGrid() {
        return grid;
    }

    BasicSettings_Boards basicSettings_boards = new BasicSettings_Boards();
    BasicSettings_Pawns basicSettings_pawns = new BasicSettings_Pawns();
    BasicSetting_Label_PvsP_Mode basicSetting_label_pvsP_mode = new BasicSetting_Label_PvsP_Mode();
    private final Image diceToss = new Image("file:src/main/resources/DiceToss.png");
    ImageView diceTossView = new ImageView(diceToss);

    private Background createOneVsOneBoard() {
        BackgroundSize backgroundSize = new BackgroundSize(1200, 600, true, true, true, true);
        Image imageBack = new Image ("file:src/main/resources/GameBackground.png",true);
        BackgroundImage backgroundImage = new BackgroundImage(imageBack, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        return background;
    }

    public OneVsOneBoard() {

        diceTossButton.setText("Dice Roll");


        for(int i=0; i<6;i++) {
            RowConstraints row = new RowConstraints(90);
            grid.getRowConstraints().add(row);
        }

        for(int i=0; i<12;i++) {
            ColumnConstraints column = new ColumnConstraints(90);
            grid.getColumnConstraints().add(column);
        }

        Background background = createOneVsOneBoard();

        basicSettings_boards.prepare_Board(grid);
        basicSettings_pawns.prepare_Pawns(grid);
        basicSetting_label_pvsP_mode.prepareLabelsAndTextFields(grid);

        diceTossButton.setOnAction(event -> {
            numberOnDice = Dice.diceRoll();
            boxOfTextFields.getDiceNumberTextField().setText(Integer.toString(numberOnDice));
        });

        grid.add(diceTossButton,11,3);
        grid.add(diceTossView,11,2);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setBackground(background);
        grid.setPadding(new Insets(10,10,10,20));
    }
}
