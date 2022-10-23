package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void playPrime() {
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] outPutDate = new String[2][Engine.NUMBER_OF_QUESTIONS];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int number = Utils.getRandomNumber(1, Engine.MAX);

            outPutDate[0][i] = String.valueOf(number);
            outPutDate[1][i] = definePrime(number) ? "yes" : "no";
        }
        Engine.playGame(question, outPutDate[0], outPutDate[1]);

    }

    public static boolean definePrime(int number) {
        boolean isPrime = true;
        if (number < 2) {
            return false;
        }
        int count = (int) Math.sqrt(number);
        for (int i = 2; i <= count; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
