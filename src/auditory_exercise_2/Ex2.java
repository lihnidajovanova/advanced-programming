package auditory_exercise_2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex2 {
    // tag::prefix[]
    public static boolean isPrefix(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    // end::prefix[]

    // tag::prefix_stream[]
    public static boolean isPrefixStream(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return false;
        }
        return IntStream.range(0, str1.length())
                .allMatch(i -> str1.charAt(i) == str2.charAt(i));
    }
    // end::prefix_stream[]

    // tag::sum[]
    public static double sum(double[][] a) {
        double s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                s += a[i][j];
            }
        }
        return s;
    }
    // end::sum[]

    // tag::sum_stream[]
    public static double sumStream(double[][] a) {
        return Arrays.stream(a)
                .mapToDouble(row -> Arrays.stream(row).sum())
                .sum();
    }
    // end::sum_stream[]

    // tag::average[]
    public static double average(double[][] a) {
        double s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                s += a[i][j];
            }
        }
        return s / (a.length * a[0].length);
    }
    // end::average[]

    public static void main(String[] args) {
        System.out.println(isPrefixStream("mak", "makedonija"));
        System.out.println(isPrefix("napredno programiranje", "np"));
        System.out.println(isPrefix("start", "start stop"));
    }
}
