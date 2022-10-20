package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class Progression {
    //точка старта прогрессии
    static final int START = 1;
    static final int END = 5;
    //длина прогрессии случайным образом от 5 до 15
    static final int MIN_LENGTH = 5;
    static final int MAX_LENGTH = 15;
    //шаг прогрессии от 1 до 5
    static final int MIN_STEP = 1;
    static final int MAX_STEP = 5;

    public static void playProgression() {
        String question = "What number is missing in the progression?";

        String[] trueAnswer = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] outPutExpression = new String[Engine.NUMBER_OF_QUESTIONS];

        String[][] temp = new String[Engine.NUMBER_OF_QUESTIONS][];
        int pos;

        for (int i = 0; i < temp.length; i++) {
            temp[i] = getProgression(GetRandom.getRandomNumber(START, END));
            pos = GetRandom.getRandomNumber(0, temp[i].length - 1);
            trueAnswer[i] = temp[i][pos];
            temp[i][pos] = "..";
        }

        for (int i = 0; i < outPutExpression.length; i++) {
            outPutExpression[i] = String.valueOf(arrayToString(temp[i]));
        }
        Engine.playGame(question, outPutExpression, trueAnswer);
    }

    public static StringBuilder arrayToString(String[] array) {
        StringBuilder tmp = new StringBuilder();
        for (String s : array) {
            tmp.append(s).append(" ");
        }
        return tmp;
    }

    public static String[] getProgression(int start) {
        String[] arr = new String[GetRandom.getRandomNumber(MIN_LENGTH, MAX_LENGTH)];
        int step = GetRandom.getRandomNumber(MIN_STEP, MAX_STEP);
        int j = 0;
        int i = 0;
        while (j < arr.length) {
            arr[j] = "" + (i + start);
            i = i + step;
            j++;
        }
        return arr;
    }
}
