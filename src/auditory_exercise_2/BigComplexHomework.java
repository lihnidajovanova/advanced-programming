package auditory_exercise_2;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigComplexHomework {
    private BigDecimal realPart;
    private BigDecimal imaginaryPart;

    public BigComplexHomework(BigDecimal realPart, BigDecimal imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public BigComplexHomework add(BigComplexHomework complex) {
        return new BigComplexHomework(this.realPart.add(complex.realPart), this.imaginaryPart.add(complex.imaginaryPart));
    }

    public BigComplexHomework subtract(BigComplexHomework complex) {
        return new BigComplexHomework(this.realPart.subtract(complex.realPart), this.imaginaryPart.subtract(complex.imaginaryPart));
    }

    public BigComplexHomework multiply(BigComplexHomework complex) {
        BigDecimal real = this.realPart.multiply(complex.realPart).subtract(this.imaginaryPart.multiply(complex.imaginaryPart));
        BigDecimal imaginary = this.realPart.multiply(complex.imaginaryPart).add(this.imaginaryPart.multiply(complex.realPart));
        return new BigComplexHomework(real, imaginary);
    }

    public BigComplexHomework divide(BigComplexHomework complex) {
        BigDecimal denominator = complex.realPart.pow(2).add(complex.imaginaryPart.pow(2));
        BigDecimal real = this.realPart.multiply(complex.realPart).add(this.imaginaryPart.multiply(complex.imaginaryPart)).divide(denominator, MathContext.DECIMAL128);
        BigDecimal imaginary = this.imaginaryPart.multiply(complex.realPart).subtract(this.realPart.multiply(complex.imaginaryPart)).divide(denominator, MathContext.DECIMAL128);
        return new BigComplexHomework(real, imaginary);
    }

    @Override
    public String toString() {
        return String.format("%s + %sj", realPart.toPlainString(), imaginaryPart.toPlainString());
    }

    public static void main(String[] args) {
        BigComplexHomework bigComplex1 = new BigComplexHomework(new BigDecimal(3), new BigDecimal(4));
        BigComplexHomework bigComplex2 = new BigComplexHomework(new BigDecimal(5), new BigDecimal(6));
        System.out.println("Addition: " + bigComplex1.add(bigComplex2));
        System.out.println("Subtraction: " + bigComplex1.subtract(bigComplex2));
        System.out.println("Multiplication: " + bigComplex1.multiply(bigComplex2));
        System.out.println("Division: " + bigComplex1.divide(bigComplex2));
    }
}
