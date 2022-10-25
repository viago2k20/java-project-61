package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void playEven() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] outPutData = new String[2][Engine.NUMBER_OF_QUESTIONS];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int number = Utils.getRandomNumber(0, Engine.MAX);
            outPutData[0][i] = String.valueOf(number);
            outPutData[1][i] = isEven(number) ? "yes" : "no";
        }
        Engine.playGame(question, outPutData);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
