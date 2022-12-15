package Game.Menu.Settings.DifficultySettings;

import Game.User.UserInput;

public class DifficultySettings {
    protected int randomNumberRange, chances;

    public DifficultySettings() {}

    public int getRandomNumberRange() {
        return randomNumberRange;
    }

    protected void setRandomNumberRange(int randomNumberRange) {
        this.randomNumberRange = randomNumberRange;
    }

    public int getChances() {
        return chances;
    }

    protected void setChances(int chances) {
        this.chances = chances;
    }
    public static Difficulty difficultySettings() {
        System.out.println("Choose difficulty from below: "
                + "\n|Hard|\n|Normal|\n|Easy|\n|Custom|");
        String input = UserInput.askUserString();
        Difficulty d = new Difficulty();
        switch (input.toLowerCase()) {
            case "h":
            case "hard":
                d = d.setDifficulty("hard");
                break;
            case "n":
            case "normal":
                d = d.setDifficulty("normal");
                break;
            case "e":
            case "easy":
                d = d.setDifficulty("easy");
                break;
            case "c":
            case "custom":
                d = d.setDifficulty("custom");
                break;
        }
        return d;
    }
}
