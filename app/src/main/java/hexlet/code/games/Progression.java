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

        String[][] outPutData = new String[Engine.NUMBER_OF_QUESTIONS][2];
        int pos;
        int start;
        int step;
        int lengthProgression;
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            start = Utils.getRandomNumber(START, END);
            step = Utils.getRandomNumber(MIN_STEP, MAX_STEP);
            lengthProgression = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);

            String[] temp = getProgression(start, step, lengthProgression);

            pos = Utils.getRandomNumber(0, temp.length - 1);
            outPutData[i][1] = temp[pos];
            temp[pos] = "..";
            outPutData[i][0] = String.join(" ", temp);
        }

        Engine.playGame(question, outPutData);
    }

    public static String[] getProgression(int start, int step, int lengthProgression) {
        String[] arr = new String[lengthProgression];
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
