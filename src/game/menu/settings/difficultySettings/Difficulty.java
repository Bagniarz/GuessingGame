package game.menu.settings.difficultySettings;

public class Difficulty {

    private int randomNumberRange, chances;

    public int getRandomNumberRange() {
        return randomNumberRange;
    }

    public int getChances() {
        return chances;
    }

    public Difficulty(int chances, int range) {
        this.chances = chances;
        this.randomNumberRange = range;
    }
    public Difficulty() {}

    public Difficulty setEasy() {
        return new Difficulty(20,50);
    }
    public Difficulty setNormal() {
        return new Difficulty(10,50);
    }
    public Difficulty setHard() {
        return new Difficulty(5,100);
    }
    public Difficulty setCustom(int chances, int range) {
        return new Difficulty(chances, range);
    }

    @Override
    public String toString() {
        return "Difficulty{" +
                "randomNumberRange=" + randomNumberRange +
                ", chances=" + chances +
                '}';
    }
}
