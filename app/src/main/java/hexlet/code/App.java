package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final String GREET = "1";
    private static final String EVEN = "2";
    private static final String CALC = "3";
    private static final String GCD = "4";
    private static final String PROGRESSION = "5";
    private static final String PRIME = "6";
    private static final String EXIT = "0";

    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1. Greet
                2. Even
                3. Calc
                4. GCD
                5. Progression
                6. Prime
                0. Exit
                Your choice:\s""");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        switch (input) {
            case GREET -> Cli.welcome();
            case EVEN -> Even.playEven();
            case CALC -> Calc.playCalc();
            case GCD -> Gcd.playGcd();
            case PROGRESSION -> Progression.playProgression();
            case PRIME -> Prime.playPrime();
            case EXIT -> System.out.println("Bye!");
            default -> System.err.println("Wrong number!");
        }
        sc.close();
    }
}
