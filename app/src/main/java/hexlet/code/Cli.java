package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void welcome() {
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
