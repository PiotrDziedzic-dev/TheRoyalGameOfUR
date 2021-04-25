package theGame.elements;

import theGame.elements.pawns.Pawn;

import java.util.Random;

public class Dice {

    private static final Random randomGenerator = new Random();
    private static int diceNumber;
    private static boolean canRoll = true;
    private static boolean canMove;
    private static boolean blueMove = true;

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

    public static boolean isBlueMove() {
        return blueMove;
    }

    public static void setBlueMove(boolean blueMove) {
        Dice.blueMove = blueMove;
    }

    public boolean whoseMove(Pawn pawn) {
        if(pawn.getColor().equals("blue") && blueMove==true) {
            return true;
        } else if (pawn.getColor().equals("yellow") && blueMove==false) {
            return true;
        } else {
            return false;
        }
    }
}
