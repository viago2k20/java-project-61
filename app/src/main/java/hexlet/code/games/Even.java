package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void playEven() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] outPutData = new String[Engine.NUMBER_OF_QUESTIONS][2];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int number = Utils.getRandomNumber(0, Engine.MAX);
            outPutData[i][0] = String.valueOf(number);
            outPutData[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.playGame(question, outPutData);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
