package Game.Menu.Settings.DifficultySettings;

public class DifficultySettings {
    private int randomNumberRange, chances;

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

}
