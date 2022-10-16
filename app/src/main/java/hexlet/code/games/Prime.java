package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class Prime {

    public static void playPrime() {
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] trueAnswer = new String[3];
        String[] outPutExpression = new String[3];
        for (int i = 0; i < 3; i++) {
            int number = GetRandom.getRandomNumber(1, 100);

            outPutExpression[i] = "" + number;
            trueAnswer[i] = definePrime(number);
        }
        Engine.playGame(question, outPutExpression, trueAnswer);

    }

    public static String definePrime(int number) {
        if (number < 2) {
            return "no";
        }
        double count = Math.sqrt(number);
        for (int i = 2; i <= count; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
