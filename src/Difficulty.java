public class Difficulty {
    // Primitives Data Types
    byte numDiff;
    byte amountOfTries;
    short genNumRange;

    // Methods
    public byte getAmountOfTries() {
        return amountOfTries;
    }

    public void setAmountOfTries(byte amountOfTries) {
        this.amountOfTries = (byte) (amountOfTries-1);
    }

    public short getGenNumRange() {
        return genNumRange;
    }

    public void setGenNumRange(short genNumRange) {
        this.genNumRange = genNumRange;
    }
}
