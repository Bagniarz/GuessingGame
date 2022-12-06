public class GenNumber {
    short genNumRange;
    protected Number generateNumber(short genNumRange) { // Method to generate random number based on difficulty setting
        this.genNumRange = genNumRange;
        int randomNumber = (int) (Math.random()*genNumRange);
        Number generatedNum = new Number(randomNumber, 0);
        //System.out.println("RandomNumber: " + randomNumber);
        return generatedNum;
    }
}
