package auditory_exercise_2;

import java.math.BigDecimal;

public class BigComplex2020 {
    private BigDecimal realPart;
    private BigDecimal imaginaryPart;

    public BigComplex2020(BigDecimal realPart, BigDecimal imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // addition
    public BigComplex2020 add(BigComplex2020 complexNumber) {
        BigDecimal realPart = this.realPart.add(complexNumber.realPart);
        BigDecimal imaginaryPart = this.imaginaryPart.add(complexNumber.imaginaryPart);
        return new BigComplex2020(realPart, imaginaryPart);
    }

    // subtraction
    public BigComplex2020 subtract(BigComplex2020 complexNumber) {
        BigDecimal realPart = this.realPart.subtract(complexNumber.realPart);
        BigDecimal imaginaryPart = this.imaginaryPart.subtract(complexNumber.imaginaryPart);
        return new BigComplex2020(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return String.format("%d + %dj", realPart.intValue(), imaginaryPart.intValue());
    }

    public static void main(String[] args) {
        BigComplex2020 first = new BigComplex2020(new BigDecimal(3), new BigDecimal(4));
        BigComplex2020 second = new BigComplex2020(new BigDecimal(5), new BigDecimal(6));
        System.out.println(first.add(second));
        System.out.println(first.subtract(second));
    }
}
