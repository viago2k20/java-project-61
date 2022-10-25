package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void playPrime() {
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] outPutData = new String[2][Engine.NUMBER_OF_QUESTIONS];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int number = Utils.getRandomNumber(1, Engine.MAX);

            outPutData[0][i] = String.valueOf(number);
            outPutData[1][i] = isPrime(number) ? "yes" : "no";
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
