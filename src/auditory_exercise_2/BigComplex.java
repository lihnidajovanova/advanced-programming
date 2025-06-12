// 2023, 2022, 2021

package auditory_exercise_2;

import java.math.BigDecimal;

public class BigComplex {
    private BigDecimal realPart;
    private BigDecimal imaginaryPart;

    public BigComplex(BigDecimal realPart, BigDecimal imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // addition
    public BigComplex add(BigComplex complex) {
        return new BigComplex(this.realPart.add(complex.realPart), this.imaginaryPart.add(complex.imaginaryPart));
    }

    public BigComplex subtract(BigComplex complex) {
        return new BigComplex(this.realPart.subtract(complex.realPart), this.imaginaryPart.subtract(complex.imaginaryPart));
    }

    /*@Override
    public String toString() {
        return "BigComplex { " + "realPart = " + realPart + ", imaginaryPart = " + imaginaryPart + " }";
    }*/

    /*@Override
    public String toString() {
        return String.format("%d + %dj", realPart.intValue(), imaginaryPart.intValue());
    }*/

    @Override
    public String toString() {
        return String.format("%si + %sj", realPart.toString(), imaginaryPart.toString());
    }

    public static void main(String[] args) {
        BigComplex first = new BigComplex(new BigDecimal(3), new BigDecimal(4));
        BigComplex second = new BigComplex(new BigDecimal(5), new BigDecimal(6));
        System.out.println(first.add(second));
        System.out.println(first.subtract(second));
    }
}