package Game.Core;

import User.UserInput;
import Menu.MainMenu;

public class NewMain {
    public static void main(String[] args) {
        // for ( ; ; ) { // Main Menu
            MainMenu m = new MainMenu();
            m.displayMenu();
            m.menu(UserInput.askUserString());
    }
}
