public class Money {
    private int wholePart; // ціла частина (долари, євро, гривні)
    private int fractionalPart; // копійки (центи, євроценти, копійки)

    public Money(int wholePart, int fractionalPart) {
        this.wholePart = wholePart;
        this.fractionalPart = fractionalPart;
    }

    public int getWholePart() {
        return wholePart;
    }

    public void setWholePart(int wholePart) {
        this.wholePart = wholePart;
    }

    public int getFractionalPart() {
        return fractionalPart;
    }

    public void setFractionalPart(int fractionalPart) {
        this.fractionalPart = fractionalPart;
    }

    public void display() {
        System.out.println("Price: " + wholePart + "." + String.format("%02d", fractionalPart));
    }
}
