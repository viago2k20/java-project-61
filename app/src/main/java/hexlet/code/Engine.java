package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_QUESTIONS = 3;
    public static final int MAX = 100;

    public static void playGame(String task, String[][] outPutData) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(task);

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.println("Question: " + outPutData[i][0]);
            String answer = scanner.next();
            if (answer.equals(outPutData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + outPutData[i][1] + "'.\n"
                        + "Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
