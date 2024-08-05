// 2022
package auditory_exercise_1;

public class RefactoringExample {
    /**
     * @param start
     * @param end
     * @return the count of all numbers between 'start' and 'end' that are divisible with the sum of their digits
     */

    public static int countAllNumbersDivisibleWithDigitSum(int start, int end) {
        int count = 0;

        for (int i = start; i < end; i++) {
            if (i % getDigitSum(i) == 0)
                ++count;
        }
        return count;
    }

    private static int getDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countAllNumbersDivisibleWithDigitSum(10, 50));
    }
}