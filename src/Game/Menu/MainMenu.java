package Game.Menu;

import Game.Menu.Settings.DifficultySettings.Difficulty;
import Game.Menu.Settings.DifficultySettings.DifficultySettings;
import Game.User.UserInput;

public class MainMenu {
    private int range, chances;
    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getChances() {
        return chances;
    }

    public void setChances(int chances) {
        this.chances = chances;
    }

    public MainMenu(int range, int chances) {
        this.range = range;
        this.chances = chances;
    }

    public MainMenu() {}

    public void displayMenu() {
        System.out.println(" Hello! You are playing GuessNumber :) ");
        System.out.println("\n     Game.Menu: " + "\n   ---------- " + "\n    |Start|"
                + "\n    |Difficulty|" + "\n    |Language|WIP" + "\n    |Quit| ");
    }

    public void menu() {
        MainMenu m = new MainMenu();
        Difficulty d = new Difficulty(0, 0);
        boolean isMenuOf = false;
        while (isMenuOf == false) {
            m.displayMenu();
            String input = UserInput.askUserString();
            switch (input.toLowerCase()) {
                case "s":
                case "start":
                    if (d.getChances() == 0 && d.getRandomNumberRange() == 0) {
                        m.startGame(50, 10);
                        System.out.println("RangeD: " + d.getRandomNumberRange());
                        System.out.println("ChancesD: " + d.getChances());
                    } else {
                        m.startGame(d.getRandomNumberRange(), d.getChances());
                        System.out.println("Range: " + d.getRandomNumberRange());
                        System.out.println("Chances: " + d.getChances());
                    }
                    break;
                case "d":
                case "difficulty":
                    d = DifficultySettings.difficultySettings();
                    break;
                case "l":
                case "language":
                case "q":
                case "quit":
                default:
                    break;
            }
        }
    }

    public void startGame(int range, int chances) {
        System.out.println("Have fun! :) ");
        System.out.println(range + ":" + chances);
    }
}
