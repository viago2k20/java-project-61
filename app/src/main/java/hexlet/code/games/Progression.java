package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class Progression {
    public static void playProgression() {
        String question = "What number is missing in the progression?";

        String[] trueAnswer = new String[3];
        String[] outPutExpression = new String[3];

        String[][] temp = new String[3][];
        int pos;
        for (int i = 0; i < temp.length; i++) {
            temp[i] = getProgression(GetRandom.getRandomNumber(1, 5));
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
        String[] arr = new String[GetRandom.getRandomNumber(5, 15)]; //длина случайным образом от 5 до 15
        int step = GetRandom.getRandomNumber(1, 5); //случайным образом от 1 до 5
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
