package theGame.elements;

import java.util.Random;

public class Dice {

    private static final Random randomGenerator = new Random();
    private static int diceNumber;
    private static boolean canRoll = true;
    private static boolean canMove;

    public static int diceRoll() {

        if(canRoll) {
            canRoll = false;
            diceNumber = randomGenerator.nextInt(4)+1;
            canMove = true;
        }
        return diceNumber;
    }

    public static int getDiceNumber() {
        return diceNumber;
    }

    public static boolean getCanMove() {
        return canMove;
    }

    public static boolean isCanRoll() {
        return canRoll;
    }

    public static void setCanRoll() {
        canRoll = true;
    }

    public static void setCanMove(boolean canMove) {
        Dice.canMove = canMove;
    }
}
