package auditory_exercise_1;

public class Ex1 {
    public static void main(String[] args) {
        for (int a = 0; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                if ((a * b != 0) && (a * a + b * b + 1) % (a * b) == 0) {
                    System.out.println(String.format("%d %d", a, b));
                }
            }
        }
    }
}