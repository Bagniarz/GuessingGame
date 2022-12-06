public class Number {

    private int number;

    private int number2;

    Number(int number, int number2) {
        this.number = number;
        this.number2 = number2;
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
}
