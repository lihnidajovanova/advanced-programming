package auditory_exercise_3;

public class Date {
    private static final int first_year = 1800;
    private static final int last_year = 2500;
    private static final int days_in_year = 365;

    private static final int[] days_of_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] days_till_first_of_month;
    private static final int[] days_till_januray_1;

    static {
        days_till_first_of_month = new int[12];
        for (int i = 1; i < 12; i++)
            days_till_first_of_month[i] += days_till_first_of_month[i - 1] + days_of_month[i - 1];

        int total_years = last_year - first_year + 1;
        days_till_januray_1 = new int[total_years];
        int current_year = first_year;
        for (int i = 1; i < total_years; i++) {
            if (is_leap_year(current_year))
                days_till_januray_1[i] = days_till_januray_1[i - 1] + days_in_year + 1;
            else
                days_till_januray_1[i] = days_till_januray_1[i - 1] + days_in_year;
            current_year++;
        }
    }

    private static boolean is_leap_year(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    private final int days;

    public Date(int days) {
        this.days = days;
    }

    public Date(int date, int month, int year) {
        int days = 0;
        if (year < first_year || year > last_year)
            throw new RuntimeException();

        days += days_till_januray_1[year - first_year];
        days += days_till_first_of_month[month - 1];
        if (month > 2 && is_leap_year(year))
            days++;

        days += date;
        this.days = days;
    }

    public int subtract(Date date) {
        return this.days - date.days;
    }

    public Date increment(int days) {
        return new Date(this.days + days);
    }

    @Override
    public boolean equals(Object other) {
        Date date = (Date) other;
        return this.days == date.days;
    }

    public int compareTo(Date date) {
        return this.days - date.days;
    }

    @Override
    public String toString() {
        int d = days;
        int i;
        for (i = 0; i < days_till_januray_1.length; i++)
            if (days_till_januray_1[i] >= days)
                break;

        d -= days_till_januray_1[i - 1];
        int year = first_year + i - 1;
        if (is_leap_year(year))
            d--;

        for (i = 0; i < days_till_first_of_month.length; i++)
            if (days_till_first_of_month[i] >= d)
                break;

        int month = i;
        d -= days_till_first_of_month[i - 1];
        return String.format("%02d.%02d.%4d", d, month, year);
    }

    public static void main(String[] args) {
        Date sample = new Date(1, 10, 2012);
        System.out.println(sample.subtract(new Date(1, 1, 2000)));
        System.out.println(sample);
        sample = new Date(1, 1, 1800);
        System.out.println(sample);
        sample = new Date(31, 12, 2500);
        System.out.println(days_till_januray_1[days_till_januray_1.length - 1]);
        System.out.println(sample.days);
        System.out.println(sample);
        sample = new Date(30, 11, 2012);
        System.out.println(sample);
        sample = sample.increment(100);
        System.out.println(sample);
    }
}