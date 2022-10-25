package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    //точка старта прогрессии
    private static final int START = 1;
    private static final int END = 5;
    //длина прогрессии случайным образом от 5 до 15
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 15;
    //шаг прогрессии от 1 до 5
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 5;

    public static void playProgression() {
        String question = "What number is missing in the progression?";

        String[][] outPutData = new String[2][Engine.NUMBER_OF_QUESTIONS];
        int pos;
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            String[] temp = getProgression();
            pos = Utils.getRandomNumber(0, temp.length - 1);
            outPutData[1][i] = temp[pos];
            temp[pos] = "..";
            outPutData[0][i] = String.join(" ", temp);
        }

        Engine.playGame(question, outPutData);
    }

    public static String[] getProgression() {
        String[] arr = new String[Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH)];
        int start = Utils.getRandomNumber(START, END);
        int step = Utils.getRandomNumber(MIN_STEP, MAX_STEP);
        int j = 0;
        int i = 0;
        while (j < arr.length) {
            arr[j] = String.valueOf(i + start);
            i = i + step;
            j++;
        }
        return arr;
    }
}
