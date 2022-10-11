package hexlet.code;

import java.util.Scanner;

public class Even {

    public static void playEven(String name) {
        String answer;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner sc = new Scanner(System.in);
        int num;
        for (int i = 0; i < 3; i++) {
            num = (int) (Math.random() * (100 + 1)); //from 0 to 100
            System.out.println("Question: " + num);
            answer = sc.next();
            String trueAnswer;
            if (num % 2 == 0) {
                trueAnswer = "yes";
            } else {
                trueAnswer = "no";
            }
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
