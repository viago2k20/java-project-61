package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class EvenTmp {
    public static void playEven() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] trueAnswer = new String[Engine.numberOfQuestions];
        String[] outPutExpression = new String[Engine.numberOfQuestions];

        for (int i = 0; i < Engine.numberOfQuestions; i++) {
            outPutExpression[i] = "" + GetRandom.getRandomNumber(0, Engine.max);
            trueAnswer[i] = (Integer.parseInt(outPutExpression[i]) % 2 == 0) ? "yes" : "no";
        }
        Engine.playGame(question, outPutExpression, trueAnswer);
    }
}
