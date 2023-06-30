package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int res = dividend / divider;
        int ans = res * divider;

        if (ans == dividend) {
            System.out.println("can be divided completely");
        } else if (ans < dividend || ans > dividend) {
            System.out.println("cannot be divided completely");
        } else if (divider == 0) {
            System.out.println("division by zero");
        }
    }
}
