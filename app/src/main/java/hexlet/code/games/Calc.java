package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void playCalc() {
        String question = "What is the result of the expression?";

        String[][] outPutDate = new String[2][Engine.NUMBER_OF_QUESTIONS];
        String[] result;
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            result = defineData();
            outPutDate[0][i] = result[0];
            outPutDate[1][i] = result[1];
        }
        Engine.playGame(question, outPutDate[0], outPutDate[1]);
    }

    public static String[] defineData() {
        int firstOperand = Utils.getRandomNumber(0, Engine.MAX);
        int secondOperand = Utils.getRandomNumber(0, Engine.MAX);

        String[] arr = new String[2];
        int j = Utils.getRandomNumber(0, 2);
        switch (j) {
            case 0 -> {
                arr[0] = firstOperand + " + " + secondOperand;
                arr[1] = String.valueOf(firstOperand + secondOperand);
            }
            case 1 -> {
                arr[0] = firstOperand + " - " + secondOperand;
                arr[1] = String.valueOf(firstOperand - secondOperand);
            }
            case 2 -> {
                arr[0] = firstOperand + " * " + secondOperand;
                arr[1] = String.valueOf(firstOperand * secondOperand);
            }
            default -> throw new IllegalArgumentException("Wrong number!");
        }
        return arr;
    }
}
