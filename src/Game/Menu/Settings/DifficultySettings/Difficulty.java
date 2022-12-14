package Game.Menu.Settings.DifficultySettings;

import User.UserInput;

public class Difficulty extends DifficultySettings {
    private String input;

    public Difficulty() {}

    public DifficultySettings setDifficulty(String input) {
        this.input = input.toLowerCase();
        DifficultySettings d = new DifficultySettings();
        switch (input) {
            case "easy":
                d.setChances(20);
                d.setRandomNumberRange(50);
                break;
            case "hard":
                d.setChances(5);
                d.setRandomNumberRange(100);
                break;
            case "normal":
                d.setChances(10);
                d.setRandomNumberRange(50);
                break;
            case "custom":
                System.out.println("Set how many chances you want (Must be higher than 0!)");
                d.setChances(UserInput.askUserNumber());
                if (d.getChances() <= 0) {
                    System.out.println("You entered invalid number! Changing chances to 10");
                    d.setChances(10);
                }
                System.out.println("Set in what range the number should be generated (Must be higher than 0!)");
                d.setRandomNumberRange(UserInput.askUserNumber());
                if (d.getRandomNumberRange() <= 0) {
                    System.out.println("You entered invalid number! Changing range to 50");
                    d.setRandomNumberRange(50);
                }
        }
        return d;
    }
}
