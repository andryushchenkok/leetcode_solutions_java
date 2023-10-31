package easy;

// 1154. Day of the Year
public class DayOfTheYear {
    public int dayOfYear(String date) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = Integer.parseInt(date.substring(0, 4)),
                month = Integer.parseInt(date.substring(5, 7)),
                day = Integer.parseInt(date.substring(8));

        if (isLeapYear(year) && month > 2) day += 1;
        while (--month > 0) {
            day += daysInMonth[month - 1];
        }
        return day;
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
