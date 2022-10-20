package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class Calc {
    public static void playCalc() {
        String question = "What is the result of the expression?";

        String[] trueAnswer = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] outPutExpression = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] result;
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            result = defineData();
            outPutExpression[i] = result[0];
            trueAnswer[i] = result[1];
        }
        Engine.playGame(question, outPutExpression, trueAnswer);
    }

    public static String[] defineData() {
        int number = GetRandom.getRandomNumber(0, Engine.MAX);
        int number1 = GetRandom.getRandomNumber(0, Engine.MAX);

        String[] arr = new String[2];
        int j = GetRandom.getRandomNumber(0, 2);
        switch (j) {
            case 0 -> {
                arr[0] = "" + number + " + " + number1;
                arr[1] = String.valueOf(number + number1);
            }
            case 1 -> {
                arr[0] = "" + number + " - " + number1;
                arr[1] = String.valueOf(number - number1);
            }
            case 2 -> {
                arr[0] = "" + number + " * " + number1;
                arr[1] = String.valueOf(number * number1);
            }
            default -> System.err.println("Wrong number!");
        }
        return arr;
    }
}
