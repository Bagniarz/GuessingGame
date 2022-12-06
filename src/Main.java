import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Primitives Data Types
        boolean userWin = false;
        int userNumber;
        byte amountOfTries;
        short genNumRange;

        Scanner input = new Scanner(System.in); // Scanner for user input

        diffAgain:
        for ( ; ; ) { // Main loop to start up game

            // Difficulty setting
            System.out.println("""
                    Choose Difficulty:\s
                    Hard
                    Normal
                    Easy
                    Custom
                    Or type quit to close program""");

            Difficulty difficulty = new Difficulty();
            String userInput = input.nextLine().toLowerCase();
            if (userInput.equalsIgnoreCase("quit")) break;

            switch (userInput) {
                case "hard":
                    difficulty.setAmountOfTries((byte) 5);
                    difficulty.setGenNumRange((short) 100);
                    System.out.println("HARD");
                    break;
                case "normal":
                    difficulty.setAmountOfTries((byte) 10);
                    difficulty.setGenNumRange((short) 50);
                    System.out.println("NORMAL");
                    break;
                case "easy":
                    difficulty.setAmountOfTries((byte) 10);
                    difficulty.setGenNumRange((short) 25);
                    System.out.println("EASY");
                    break;
                case "custom":
                    try {
                        System.out.println("Select how many tries you want to have (e.g. 10)");
                        amountOfTries = Byte.parseByte(input.nextLine());
                        difficulty.setAmountOfTries(amountOfTries);
                        System.out.println("Select the range in which number should be generated (e.g. 50)");
                        genNumRange = Short.parseShort(input.nextLine());
                        difficulty.setGenNumRange(genNumRange);
                        System.out.println("CUSTOM");
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println("This is not a number!");
                        continue;
                    }
                default:
                    System.err.println("Wrong Input! Please use correct names of difficulties");
                    continue;
            }
            //System.out.println("End Of Difficulty Setting");


            // Game core
            for (; ; ) { // Loop to generate random number
                //System.out.println("Game Core");
                GenNumber game = new GenNumber();
                Number nr = game.generateNumber(difficulty.getGenNumRange());


                for (int i = 0; i <= difficulty.getAmountOfTries(); i++) { // loop for user to guess a number based on difficulty
                    ;
                    if (i > 1) System.out.println("Remaining number of tries " + (difficulty.getAmountOfTries()-i+1));
                    System.out.println("Guess a number from 0 to " + difficulty.getGenNumRange());
                    try {
                        userNumber = Integer.parseInt(input.nextLine()); // here program reads input from player
                        nr.setUserInput(userNumber);
                    } catch (NumberFormatException e) {
                        System.err.println("This is not a number!");
                        continue;
                    }

                    if (nr.getNumber() == nr.getUserInput()) { // here program checks if generated number equals player input
                        System.out.println("Congratulations! You guessed right"); // and gives notification that he won
                        //System.out.println(nr.getNumber() + "" + nr.getUserInput());
                        userWin = true;
                    } else if (nr.getNumber() > userNumber && difficulty.getAmountOfTries()-1 >= i) System.out.println("Higher!"); // notification to player that he needs to aim Higher
                    else if (nr.getNumber() < userNumber && difficulty.getAmountOfTries()-1 >= i) System.out.println("Lower!"); // to aim lower

                    else if (i >= difficulty.getAmountOfTries()) { // Here program checks if we are out of tries and if yes
                        System.out.println("Game Over!" + "\nCorrect number was " + nr.getNumber()); // we are notified about our lose
                    }

                    if (userWin || i >= difficulty.getAmountOfTries()) { // Here program asks if player wants to play again
                        try {
                            System.out.println("You wanna play again?");
                            String again = input.nextLine();
                            if (again.equalsIgnoreCase("yes")) {
                                continue diffAgain;
                            } else System.exit(0); // and if not here is exit from program
                        } catch (NumberFormatException e) {
                            System.err.println("Invalid input! Use letters not something else!");
                            break diffAgain;
                        }
                    }
                }
            }
        }
    }
}

