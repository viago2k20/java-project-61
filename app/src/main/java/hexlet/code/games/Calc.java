package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class Calc {
    public static void playCalc() {
        String question = "What is the result of the expression?";

        String[] trueAnswer = new String[3];
        String[] outPutExpression = new String[3];
        String[] result;
        for (int i = 0; i < 3; i++) {
            result = defineData();
            outPutExpression[i] = result[0];
            trueAnswer[i] = result[1];
        }
        Engine.playGame(question, outPutExpression, trueAnswer);
    }

    public static String[] defineData() {
        int number = GetRandom.getRandomNumber(0, 100);
        int number1 = GetRandom.getRandomNumber(0, 100);

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
