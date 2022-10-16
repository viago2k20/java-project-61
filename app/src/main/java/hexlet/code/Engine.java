package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void playGame(String question, String[] outPutExpression, String[] trueAnswer) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);

        for (int i = 0; i < 3; i++) {
            System.out.println("Question: " + outPutExpression[i]);
            String answer = scanner.next();
            if (answer.equals(trueAnswer[i])) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + name);
                }
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer[i] + "'.\n"
                        + "Let's try again, " + name + "!");
                break;
            }
        }
    }
}
