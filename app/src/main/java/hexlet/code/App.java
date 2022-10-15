package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenTmp;
import hexlet.code.games.Gcd;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        printMenu();

        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        switch (input) {
            case "1" -> Cli.welcome();
            case "2" -> EvenTmp.playEven();
            case "3" -> Calc.playCalc();
            case "4" -> Gcd.playGcd();
            case "0" -> {
                System.out.println("Bye!");
                System.out.print("\033[H\033[J"); //clear screen
            }
            default -> System.err.println("Wrong number!");
        }
    }

    public static void printMenu() {
        System.out.println("""
                Please enter the game number and press Enter.
                1. Greet\s
                2. Even\s
                3. Calc\s
                4. GCD\s
                0. Exit""");
    }
}
