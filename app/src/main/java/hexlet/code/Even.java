package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void printAnswer(String name, String no, String yes) {
        System.out.println(no + " is wrong answer ;(. Correct answer was " + yes + ".\n"
                + "Let's try again, " + name + "!");
    }

    public static void playEven(String name) {
        int count = 0;
        String answer;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner sc = new Scanner(System.in);
        int num;
        for (;;) {
            num = (int) (Math.random() * (100 + 1)); //from 0 to 100
            System.out.println("Question: " + num);
            answer = sc.next();
            if ((num % 2 == 0 && answer.equals("no"))) {
                printAnswer(name, "no", "yes");
                break;
            } else if ((num % 2 != 0 && answer.equals("yes"))) {
                printAnswer(name, "yes", "no");
                break;
            } else {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + name);
                    break;
                }
            }
        }
    }
}
