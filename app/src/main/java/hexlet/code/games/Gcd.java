package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    public static void playGcd() {
        String question = "Find the greatest common divisor of given numbers.";

        String[][] outPutDate = new String[2][Engine.NUMBER_OF_QUESTIONS];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int firstOperand = Utils.getRandomNumber(1, Engine.MAX);
            int secondOperand = Utils.getRandomNumber(1, Engine.MAX);

            outPutDate[0][i] = firstOperand + " " + secondOperand;
            outPutDate[1][i] = gcd(firstOperand, secondOperand);
        }
        Engine.playGame(question, outPutDate[0], outPutDate[1]);
    }

    //Большее число должно идти первым
    public static String gcd(int a, int b) {
        if (a < b) {
            return String.valueOf(nod(b, a));
        }
        return String.valueOf(nod(a, b));
    }

    //НОД по алгоритму Евклида
    public static int nod(int a, int b) {
        int tmp;
        while (a != b) {
            tmp = a % b;
            //Большее число поделить на меньшее.
            //Меньшее число поделить на остаток, который получается после деления.
            //Первый остаток поделить на второй остаток.
            //Второй остаток поделить на третий и т. д.
            if (tmp == 0) {
                // Деление продолжается до тех пор, пока в остатке не получится нуль.
                // Последний делитель и есть наибольший общий делитель.
                return b;
            }
            a = b;
            b = tmp;
        }
        return a;
    }
}
