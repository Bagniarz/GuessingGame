package Game.Core.Number;

public class GenerateNumber extends Number{

    protected Number generateNumber(short randomNumberRange) { // Method to generate random number based on difficulty setting
        this.randomNumberRange = randomNumberRange;
        int randomNumber = (int) Math.floor(Math.random() * randomNumberRange);
        Number generatedNum = new Number(randomNumber, 0);
        return generatedNum;
    }
}
