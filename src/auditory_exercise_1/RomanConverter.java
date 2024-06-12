package auditory_exercise_1;

/**
 * Homework 1.1 Roman converter
 */
public class RomanConverter {
    /**
     * Roman to decimal converter
     *
     * @param n number in decimal format
     * @return string representation of the number in Roman numeral
     */
    public static String toRoman(int n) {
        // your solution here
        // mapping of Roman numerals to corresponding decimal values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                roman.append(symbols[i]);
                n -= values[i];
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(RomanConverter.toRoman(1989)); // MCMLXXXIX
    }
}