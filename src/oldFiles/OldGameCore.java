package oldFiles;

public class OldGameCore {
    public OldGameCore() {}

/*
    public static String compare(int randomNumber, int input, int chances, int tries) {
        if (randomNumber == input) {
            return "You guessed right! Congratulations :)";
        } else if (tries == chances) {
            return "Sorry you didn't guessed! Correct answer was " + randomNumber;
        } else if (randomNumber > input) {
            return "Aim Higher!";
        } else {
            return "Aim Lower!";
        }
    }
    public void game(int range, int chances) {
        boolean endGame = false;
        while (!endGame) {
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
    } */
}
