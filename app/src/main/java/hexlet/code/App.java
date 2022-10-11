package hexlet.code;

import java.util.Scanner;

public class App {
    public static String name;

    public static void welcome(Scanner scanner) {
        System.out.print("May I have your name? ");
        scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        boolean inGame = true;
        //while (inGame) {
        printMenu();
        input = sc.nextLine();
        switch (input) {
            case "1" -> welcome(sc);
            case "2" -> {
                System.out.println("Playing Even");
                welcome(sc);
                Even.playEven(name);
            }
            case "0" -> {
                System.out.println("Bye!");
                //inGame = false;
                System.out.print("\033[H\033[J"); //очистка экрана
            }
            default -> System.err.println("Wrong number!");
        }
        //}
    }

    public static void printMenu() {
        System.out.println("""
                Please enter the game number and press Enter.
                1. Greet\s
                2. Even\s
                0. Exit""");
    }
}
