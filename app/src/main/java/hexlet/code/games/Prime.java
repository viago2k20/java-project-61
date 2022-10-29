package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void playPrime() {
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] outPutData = new String[Engine.NUMBER_OF_QUESTIONS][2];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int number = Utils.getRandomNumber(1, Engine.MAX);

            outPutData[i][0] = String.valueOf(number);
            outPutData[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.playGame(question, outPutData);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int count = (int) Math.sqrt(number);
        for (int i = 2; i <= count; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
