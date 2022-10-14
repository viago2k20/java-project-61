package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class EvenTmp {
    public static void playEven() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] trueAnswer = new String[3];
        String[] outPutExpression = new String[3];
        for (int i = 0; i < 3; i++) {
            outPutExpression[i] = "" + GetRandom.getRandomNumber(0, 100);
            trueAnswer[i] = (Integer.parseInt(outPutExpression[i]) % 2 == 0) ? "yes" : "no";
        }
        Engine.playGame(question, outPutExpression, trueAnswer);
    }
}
