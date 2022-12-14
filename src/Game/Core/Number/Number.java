package Game.Core.Number;

public class Number {

    private int number;

    private int number2;

    private short randomNumberRange;


    Number(int number, int number2) {
        this.number = number;
        this.number2 = number2;
    }

    public Number() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getUserInput() {
        return number2;
    }

    public void setUserInput(int number2) {
        this.number2 = number2;
    }

    protected Number generateNumber(short randomNumberRange) { // Method to generate random number based on difficulty setting
        this.randomNumberRange = randomNumberRange;
        int randomNumber = (int) Math.floor(Math.random() * randomNumberRange);
        Number generatedNum = new Number(randomNumber, 0);
        return generatedNum;
    }
}
