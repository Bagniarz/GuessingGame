package Game.Menu;

import Game.Core.GameCore;
import Game.Menu.Settings.DifficultySettings.Difficulty;
import Game.Menu.Settings.DifficultySettings.DifficultySettings;
import Game.User.UserInput;

public class MainMenu {
    public MainMenu() {}

    public void displayMenu() {
        System.out.println("\n     Main Menu: " + "\n   ---------- " + "\n    |Start|"
                + "\n    |Difficulty|" + "\n    |Language|WIP" + "\n    |Quit| ");
    }

    public void menu() {
        MainMenu m = new MainMenu();
        Difficulty d = new Difficulty(0, 0);
        boolean closeProgram = false;
        while (closeProgram == false) {
            m.displayMenu();
            String input = UserInput.askUserString();
            switch (input.toLowerCase()) {
                case "s":
                case "start":
                    if (d.getChances() == 0 && d.getRandomNumberRange() == 0) {
                        m.startGame(50, 10);
                    } else {
                        m.startGame(d.getRandomNumberRange(), d.getChances());
                    }
                    break;
                case "d":
                case "difficulty":
                    d = DifficultySettings.difficultySettings();
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

    public void startGame(int range, int chances) {
        System.out.println("Have fun! :) ");
        GameCore g = new GameCore();
        g.Game(range, chances);
    }
}
