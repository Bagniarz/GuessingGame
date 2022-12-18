package game.core;

import game.menu.settings.difficultySettings.Difficulty;

public class Game {
    private int chancesLeft;
    private int randomNumber;
    private void initGame(int range) {
        this.randomNumber = (int) Math.floor(Math.random() * range);
    }
    public int getChancesLeft() {
        return chancesLeft;
    }
    public int getRandomNumber() {
        return randomNumber;
    }
    public Game(Difficulty difficulty) {
        this.chancesLeft = difficulty.getChances();
        initGame(difficulty.getRandomNumberRange());
    }
    public boolean guessNumber(int number) {
        if (chancesLeft > 0 && number == randomNumber) {
            chancesLeft--;
            return true;
        }
        chancesLeft--;
        return false;
    }
    public static boolean isHigher(int randomNumber, int input) {
        if (randomNumber > input) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Game{" +
                "chancesLeft=" + chancesLeft +
                ", randomNumber=" + randomNumber +
                '}';
    }
}
