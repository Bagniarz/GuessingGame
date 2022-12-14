package Game.Core.Number;

public class GenerateNumber extends Number{

    public int generateNumber(int randomNumberRange) { // Method to generate random number based on difficulty setting
        this.range = randomNumberRange;
        int randomNumber = (int) Math.floor(Math.random() * randomNumberRange);
        return randomNumber;
    }
}
