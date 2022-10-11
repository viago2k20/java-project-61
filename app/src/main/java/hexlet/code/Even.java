package hexlet.code;

import java.util.Scanner;

public class Even {

    public static void playEven(String name) {
        String answer;
        String trueAnswer;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        int number;
        for (int i = 0; i < 3; i++) {
            number = (int) (Math.random() * (100 + 1));
            System.out.println("Question: " + number);
            answer = scanner.next();
            trueAnswer = (number % 2 == 0) ? "yes" : "no";
            if (answer.equals(trueAnswer)) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + name);
                    break;
                }
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.\n"
                        + "Let's try again, " + name + "!");
                break;
            }
        }
    }
}
