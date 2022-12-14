package Menu;

import Game.Menu.Settings.DifficultySettings.Difficulty;
import User.UserInput;

public class MainMenu {
    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public MainMenu(String in) {
    }

    public MainMenu() {}

    public void displayMenu() {
        System.out.println(" Hello! You are playing GuessNumber :) ");
        System.out.println("\n     Menu: " + "\n   ---------- " + "\n    |Start|"
                + "\n    |Settings.DifficultySettings.Difficulty|" + "\n    |Settings.LanguageSettings.Language|WIP" + "\n    |Quit| ");
    }

    public void menu(String input) {
        MainMenu m = new MainMenu();
        switch (input.toLowerCase()) {
            case "s":
            case "start":
                m.startGame();
                break;
            case "d":
            case "difficulty":
                m.difficultySettings();
                break;
            case "l":
            case "language":
                m.languageSettings();
            default:
                break;
        }
    }

    public void difficultySettings() {
        System.out.println("Choose difficulty from below: "
                + "\n|Hard|\n|Normal|\n|Easy|\n|Custom|");
        String input = UserInput.askUserString();
        Difficulty d = new Difficulty();
        switch (input.toLowerCase()) {
            case "h":
            case "hard":
                d.setDifficulty("hard");
                break;
            case "n":
            case "normal":
                d.setDifficulty("normal");
            case "e":
            case "easy":
                d.setDifficulty("easy");
            case "c":
            case "custom":
                d.setDifficulty("custom");
        }
    }

    public void languageSettings() {

    }
    public void startGame() {

    }
}
