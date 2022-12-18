package game.menu;

import game.core.Game;
import game.menu.settings.difficultySettings.Difficulty;
import game.user.UserInput;

public class MainMenu {
    public MainMenu() {}

    public static void greeting() {
        System.out.println("Hello! You are playing GuessNumber :)");
    }

    public static void displayMenu() {
        System.out.println("\n     Main Menu: " + "\n   ---------- " + "\n    |Start|"
                + "\n    |Difficulty|" + "\n    |Language|WIP" + "\n    |Quit| ");
    }

    public static void printRemainingChances(int chances) {
        if (chances > 0) {
            System.out.println("You have " + chances + " chances left");
        }
    }
    public static boolean playAgain(String input) {
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("Yes")) {
            return true;
        } else {
            return false;
        }
    }

    public static void startGame(Difficulty difficulty) {
        System.out.println("Have fun! :) ");
        boolean endGame = false;
        System.out.println("You have " + difficulty.getChances()
                + " chances in total, and maximum number generated is " + difficulty.getRandomNumberRange());
        while (!endGame) {
            Game game = new Game(difficulty);
            boolean gameOver = false;
            while (!gameOver) {
                System.out.println("Guess a Number!");
                int input = UserInput.askUserNumber();
                if (game.guessNumber(input)) {
                    System.out.println("Congratulations! You won!");
                    break;
                } else if (game.getChancesLeft() == 0) {
                    System.out.println("Game over! You used your last remaining chance.");
                    gameOver = true;
                } else if (Game.isHigher(game.getRandomNumber(), input)) {
                    System.out.println("Higher!");
                } else {
                    System.out.println("Lower!");
                }
                printRemainingChances(game.getChancesLeft());
            }
            System.out.println("Do you wanna play again?");
            if (!playAgain(UserInput.askUserString())) {
                break;
            }
        }
    }

    public static Difficulty askUserCustom() {
        System.out.println("How many chances you want to have? (Must be higher than 0 and lower than 1000!)");
        int chances = UserInput.askUserNumber();
        if (chances <= 0) {
            chances = 1;
        } else if (chances >= 1000) {
            chances = 999;
        }
        System.out.println("Set in what range the number should be generated (Must be higher than 0 and lower than 5000!)");
        int range = UserInput.askUserNumber();
        if (range <= 0) {
            range = 1;
        } else if (range >= 5000) {
            range = 4999;
        }
        return new Difficulty(chances, range);
    }

    public static Difficulty difficultySettings() {
        String input = UserInput.askUserString();
        Difficulty d = new Difficulty();
        switch (input.toLowerCase()) {
            case "h":
            case "hard":
                d = d.setHard();
                break;
            case "n":
            case "normal":
                d = d.setNormal();
                break;
            case "e":
            case "easy":
                d = d.setEasy();
                break;
            case "c":
            case "custom":
                Difficulty custom = askUserCustom();
                d = d.setCustom(custom.getChances(), custom.getRandomNumberRange());
                break;
        }
        return d;
    }

    public static void printDifficultySettings() {
        System.out.println("Choose difficulty from below: "
                + "\n|Hard|\n|Normal|\n|Easy|\n|Custom|");
    }

    public static void menu() {
        Difficulty d = new Difficulty(0, 0);
        boolean closeProgram = false;
        while (closeProgram == false) {
            displayMenu();
            String input = UserInput.askUserString();
            switch (input.toLowerCase()) {
                case "s":
                case "start":
                    if (d.getChances() == 0 && d.getRandomNumberRange() == 0) {
                        d = d.setNormal();
                        startGame(d);
                    } else {
                        startGame(d);
                    }
                    break;
                case "d":
                case "difficulty":
                    printDifficultySettings();
                    d = difficultySettings();
                    break;
                case "l":
                case "language":
                    break;
                case "q":
                case "quit":
                    closeProgram = true;
                default:
                    break;
            }
        }
    }
}
