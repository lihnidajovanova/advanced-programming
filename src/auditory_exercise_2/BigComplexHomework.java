package auditory_exercise_2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class BigComplexHomework {
    private BigDecimal realPart;
    private BigDecimal imaginaryPart;

    public BigComplexHomework(BigDecimal realPart, BigDecimal imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // addition
    public BigComplexHomework add(BigComplexHomework complex) {
        return new BigComplexHomework(this.realPart.add(complex.realPart), this.imaginaryPart.add(complex.imaginaryPart));
    }

    // subtraction
    public BigComplexHomework subtract(BigComplexHomework complex) {
        return new BigComplexHomework(this.realPart.subtract(complex.realPart), this.imaginaryPart.subtract(complex.imaginaryPart));
    }

    // multiplication
    public BigComplexHomework multiply(BigComplexHomework complex) {
        BigDecimal real = this.realPart.multiply(complex.realPart).subtract(this.imaginaryPart.multiply(complex.imaginaryPart));
        BigDecimal imaginary = this.realPart.multiply(complex.imaginaryPart).add(this.imaginaryPart.multiply(complex.realPart));
        return new BigComplexHomework(real, imaginary);
    }

    // division
    public BigComplexHomework divide(BigComplexHomework complex) {
        BigDecimal denominator = complex.realPart.pow(2).add(complex.imaginaryPart.pow(2));
        BigDecimal real = this.realPart.multiply(complex.realPart).add(this.imaginaryPart.multiply(complex.imaginaryPart)).divide(denominator, MathContext.DECIMAL128);
        BigDecimal imaginary = this.imaginaryPart.multiply(complex.realPart).subtract(this.realPart.multiply(complex.imaginaryPart)).divide(denominator, MathContext.DECIMAL128);
        return new BigComplexHomework(real, imaginary);
    }

    @Override
    public String toString() {
        return String.format("%si + %sj", realPart.toPlainString(), imaginaryPart.toPlainString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input for the first complex number
        System.out.print("Enter the first complex number (format: real imaginary): ");
        BigDecimal realPart1 = scanner.nextBigDecimal();
        BigDecimal imaginaryPart1 = scanner.nextBigDecimal();

        // input fot the second complex number
        System.out.print("Enter the second complex number (format: real imaginary): ");
        BigDecimal realPart2 = scanner.nextBigDecimal();
        BigDecimal imaginaryPart2 = scanner.nextBigDecimal();

        // create complex number objects
        BigComplexHomework first = new BigComplexHomework(realPart1, imaginaryPart1);
        BigComplexHomework second = new BigComplexHomework(realPart2, imaginaryPart2);
        BigComplexHomework bigComplex1 = new BigComplexHomework(new BigDecimal(3), new BigDecimal(4));
        BigComplexHomework bigComplex2 = new BigComplexHomework(new BigDecimal(5), new BigDecimal(6));

        // perform operations and display results
        System.out.println("The results from input: ");
        System.out.println("Addition: " + first.add(second));
        System.out.println("Subtraction: " + first.subtract(second));
        System.out.println("Multiplication: " + first.multiply(second));
        System.out.println("Division: " + first.divide(second));

        System.out.println("The results from already defined complex numbers: ");
        System.out.println("Addition: " + bigComplex1.add(bigComplex2));
        System.out.println("Subtraction: " + bigComplex1.subtract(bigComplex2));
        System.out.println("Multiplication: " + bigComplex1.multiply(bigComplex2));
        System.out.println("Division: " + bigComplex1.divide(bigComplex2));
    }
}
