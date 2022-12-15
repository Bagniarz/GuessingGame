package Game.Core;

import Game.Core.Number.Number;
import Game.User.UserInput;

public class GameCore {
    public GameCore() {}

    public static String compare(int randomNumber, int input, int chances, int tries) {
        String result = "";
        if (randomNumber == input) {
            result = "You guessed right! Congratulations :)";
        } else if (tries == chances && randomNumber != input) {
            result = "Sorry you didn't guessed! Correct answer was " + randomNumber;
        } else if (randomNumber > input) {
            result = "Aim Higher!";
        } else if (randomNumber < input){
            result = "Aim Lower!";
        }
        return result;
    }

    public void Game(int range, int chances) {
        boolean endGame = false;
        while (!endGame) {
            Number random = new Number();
            int randomNumber = random.generateNumber(range);
            System.out.println("You have " + chances + " chances in total" + " and maximum generated number is " + range);

                for (int tries = 1; tries <= chances; tries++) {
                System.out.println("Guess a number. :)");
                int input = UserInput.askUserNumber();
                String result = compare(randomNumber, input, chances, tries);
                System.out.println(result);
                if (result.equalsIgnoreCase("You guessed right! Congratulations :)")) {
                    break;
                } else if (result.equalsIgnoreCase("Sorry you didn't guessed! Correct answer was " + randomNumber)) {
                    break;
                }
                int remaining = chances - tries;
                System.out.println("You have " + remaining + " remaining chances");
            }
            System.out.println("Do you wanna play again?");
            String input2 = UserInput.askUserString();
            if (input2.equalsIgnoreCase("no") || input2.equalsIgnoreCase("n")) {
                endGame = true;
            }
        }
    }
}
