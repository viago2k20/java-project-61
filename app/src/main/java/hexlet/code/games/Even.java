package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void playEven() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] outPutDate = new String[2][Engine.NUMBER_OF_QUESTIONS];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            outPutDate[0][i] = String.valueOf(Utils.getRandomNumber(0, Engine.MAX));
            outPutDate[1][i] = (Integer.parseInt(outPutDate[0][i]) % 2 == 0) ? "yes" : "no";
        }
        Engine.playGame(question, outPutDate[0], outPutDate[1]);
    }
}
