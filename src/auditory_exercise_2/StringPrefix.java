package auditory_exercise_2;

public class StringPrefix {
    /**
     * @param first  - the first string
     * @param second - the second string
     * @return true if the first string is a prefix of the second one
     * Java has a method for this functionality: startsWith()
     */

    public static boolean isPrefix(String first, String second) {
        if (first.length() > second.length())
            return false;

        for (int i = 0; i < first.length(); i++)
            if (first.charAt(i) != second.charAt(i))
                return false;

        return true;
    }

    /*
    // with Java 8 Streams
    public static boolean isPrefix(String first, String second) {
        if (first.length() > second.length())
            return false;

        return IntStream.range(0, first.length()).allMatch(i -> first.charAt(i) == second.charAt(i));
    }
    */

    /*
    public static boolean isPrefix(String first, String second) {
        // return second.startsWith(first);

        if (first.equals(second))
            return true;

        if (first.length() > second.length())
            return false;
        else {
            for (int i = 0; i < first.length(); i++)
                if (first.charAt(i) != second.charAt(i)) // first[i]
                    return false;
            return true;
        }
    }
    */

    public static void main(String[] args) {
        System.out.println(StringPrefix.isPrefix("test", "testing"));
        System.out.println(isPrefix("test", "apple"));
        System.out.println(isPrefix("test", "tesla"));
        System.out.println(isPrefix("testing", "test"));
        String first = "Napr";
        String second = "Napredno programiranje";

        System.out.println(second.startsWith(first));
    }
}
