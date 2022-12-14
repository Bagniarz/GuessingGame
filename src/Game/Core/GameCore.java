package Game.Core;

import Game.Core.Number.GenerateNumber;
import Game.Core.Number.Number;
import Game.User.UserInput;

public class GameCore {
    public GameCore() {}

    public static String compare(int randomNumber, int input) {
        String result = "";
        if (randomNumber == input) {
            result = "You guessed right! Congratulations :)";
        } else if (randomNumber > input) {
            result = "Aim Higher!";
        } else {
            result = "Aim Lower!";
        }
        System.out.println("compare(): " + result);
        return result;
    }

    public void Game(int range, int chances) {
        System.out.println("You have " + chances + " in total" + " and maximum number generated number is " + range);
        boolean endGame = false;
        GenerateNumber random = new GenerateNumber();
        int randomNumber = random.generateNumber(range);
        System.out.println(randomNumber);
        int tries = 0;
        while (!endGame || tries >= chances) {
            System.out.println("Guess a number. :)");
            int input = UserInput.askUserNumber();
            String result = compare(randomNumber, input);
            if (result.equalsIgnoreCase("You guessed right! Congratulations :)")) {
                System.out.println(result);
                endGame = true;
            } else if (randomNumber > input || randomNumber < input) {
                System.out.println(result);
            }
            tries++;
            if (tries < chances && !endGame) {
                int remaining = chances - tries;
                System.out.println("You have " + remaining + " remaining chances");
            }
            if (!endGame) {
                System.out.println("Sorry you didn't guessed! Correct asnwer was " + randomNumber);
            }
        }
    }
}
