package auditory_exercise_3;

import java.util.Objects;

public class Date2021 implements Comparable<Date2021> {

    private static final int FIRST_YEAR = 1800;
    private static final int LAST_YEAR = 2500;
    private static final int DAYS_IN_YEAR = 365;

    private static final int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] daysTillFirstOfMonth;
    private static final int[] daysTillFirstOfYear;

    private int days2021;

    /**
     * A static block is used to initialize static properties and is executed when the class is
     * loaded in memory. In this case, since we need a more complex logic to initialize the daysTillFirstOfMonth
     * and daysTillFirstOfYear arrays we use this block.
     */
    static {
        daysTillFirstOfMonth = new int[12];
        for (int i = 1; i < 12; i++)
            daysTillFirstOfMonth[i] = daysTillFirstOfMonth[i - 1] + daysOfMonth[i - 1];

        int totalYears = LAST_YEAR - FIRST_YEAR + 1;
        daysTillFirstOfYear = new int[totalYears];
        int currentYear = FIRST_YEAR;

        for (int i = 1; i < totalYears; i++) {
            daysTillFirstOfYear[i] = daysTillFirstOfYear[i - 1] + DAYS_IN_YEAR;
            if (isLeapYear(currentYear))
                daysTillFirstOfYear[i]++;
            currentYear++;
        }
    }

    public Date2021(int days2021) {
        this.days2021 = days2021;
    }

    public Date2021(int day, int month, int year) {
        if (isDateInvalid(year))
            throw new RuntimeException();
        int days = 0;

        days += daysTillFirstOfYear[year - FIRST_YEAR];
        days += daysTillFirstOfMonth[month - 1];

        if (isLeapYear(year) && month >= 2)
            days++;
        days += day;
        this.days2021 = days;
    }

    private boolean isDateInvalid(int year) {
        return year < FIRST_YEAR || year > LAST_YEAR;
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public Date2021 increment(int days) {
        return new Date2021(this.days2021 + days);
    }

    public int subtract(Date2021 date) {
        return Math.abs(this.days2021 - date.days2021);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date2021 date = (Date2021) o;
        return days2021 == date.days2021;
    }

    @Override
    public int hashCode() {
        return Objects.hash(days2021);
    }

    @Override
    public int compareTo(Date2021 date) {
        return Integer.compare(this.days2021, date.days2021);
    }

    @Override
    public String toString() {
        int allDays = days2021;
        int i;
        for (i = 0; i < daysTillFirstOfYear.length; i++) {
            if (daysTillFirstOfYear[i] >= allDays) break;
        }

        allDays -= daysTillFirstOfYear[i - 1];
        int year = i - 1 + FIRST_YEAR;
        if (isLeapYear(year))
            allDays--;

        for (i = 0; i < daysTillFirstOfMonth.length; i++) {
            if (daysTillFirstOfMonth[i] >= allDays) break;
        }

        int month = i;
        allDays -= daysTillFirstOfMonth[i - 1];

        return String.format("%02d.%02d.%4d", allDays, month, year);
    }

    public static void main(String[] args) {
        Date2021 date = new Date2021(1, 10, 2020);
        System.out.println(date.subtract(new Date2021(1, 1, 2000)));
        System.out.println(date);

        date = new Date2021(1, 1, 1800);
        System.out.println(date);

        date = new Date2021(31, 12, 2500);
        System.out.println(date);
        System.out.println(date.days2021);
        System.out.println(daysTillFirstOfYear[daysTillFirstOfYear.length - 1]);

        date = new Date2021(1, 12, 2020);
        System.out.println(date);
        date = date.increment(100);
        System.out.println(date);
    }
}
