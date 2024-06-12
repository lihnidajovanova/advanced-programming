package auditory_exercise_1;

/**
 * Homework 1.2 number printer
 */
public class NumberPrinter {

    /**
     * Print numbers from 1 to howMany in following format [1][2]...[howMany]
     *
     * @param howMany    how many numbers to print
     * @param lineLength the length of the lin
     */
    public static void formatNumbers(int howMany, int lineLength) {
        // your solution here
        StringBuilder currentLine = new StringBuilder();

        for (int i = 0; i <= howMany; i++) {
            String number = "[" + i + "]";

            // check if the current number fits in the remaining space of the current line
            if (currentLine.length() + number.length() > lineLength) {
                // print the current line and start a new one
                System.out.println(currentLine.toString());
                currentLine = new StringBuilder();
            }

            // add the current number to the current line
            currentLine.append(number);
        }

        // print the last line if it has any content
        if (currentLine.length() > 0) {
            System.out.println(currentLine.toString());
        }
    }

    public static void main(String[] args) {
        formatNumbers(250, 60);
    }
}