package Game.User;

import java.util.Scanner;
public class UserInput {

    public static String askUserString() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
            return input;
    }

    public static int askUserNumber() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean error = false;
        try {
            input = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("This is not a number!");
            error = true;
        }
        if (!error && input > 0) {
            return input;
        } else {
            error = false;
            return 0;
        }
    }
}
