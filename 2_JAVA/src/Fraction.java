
public final class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("The denominator is zero.");
        }
        if (numerator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        if (denominator < 0) {
            this.numerator = -1 * this.numerator;
            this.denominator = -1 * this.denominator;
        }
    }

    public Fraction(int num) {
        this.numerator = num;
        this.denominator = 1;
    }

    @Override
    public String toString() {
        if (denominator != 1) {
            return numerator + "/" + denominator;
        } else {
            return Integer.toString(numerator);
        }
    }


    public static Fraction add(Fraction f1, Fraction f2) {
        return new Fraction(f1.numerator * f2.denominator + f2.numerator * f1.denominator,
                f1.denominator * f2.denominator);
    }

    public static Fraction sub(Fraction f1, Fraction f2) {
        return new Fraction(f1.numerator * f2.denominator - f2.numerator * f1.denominator,
                f1.denominator * f2.denominator);
    }

    public static Fraction mul(Fraction f1, Fraction f2) {
        return new Fraction(f1.numerator * f2.numerator,
                f1.denominator * f2.denominator);
    }

    public static Fraction div(Fraction f1, Fraction f2) {
        return new Fraction(f1.numerator * f2.denominator,
                f1.denominator * f2.numerator);
    }
}

