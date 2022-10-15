package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class Gcd {

    public static void playGcd() {
        String question = "Find the greatest common divisor of given numbers.";

        String[] trueAnswer = new String[3];
        String[] outPutExpression = new String[3];
        for (int i = 0; i < 3; i++) {
            int number = GetRandom.getRandomNumber(1, 100);
            int number1 = GetRandom.getRandomNumber(1, 100);

            outPutExpression[i] = "" + number + " " + number1;
            trueAnswer[i] = gcd(number, number1);
        }
        Engine.playGame(question, outPutExpression, trueAnswer);

    }

    public static String gcd(int a, int b) {
        if (a < b) {
            return "" + nod(b, a);
        }
        return "" + nod(a, b);
    }

    public static int nod(int a, int b) {
        int tmp;
        while (a != b) {
            tmp = a % b;
            if (tmp == 0) {
                return b;
            }
            a = b;
            b = tmp;
        }
        return a;
    }
}
