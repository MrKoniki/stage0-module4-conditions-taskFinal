package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean remainder;
        String answer;

        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else {
            remainder = ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0)));

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                answer = "31";
            } else if (month == 2) {
                if (remainder) {
                    answer = "29";
                } else {
                    answer = "28";
                }
            } else {
                answer = "30";
            }
            System.out.println(answer);
        }
    }
}
