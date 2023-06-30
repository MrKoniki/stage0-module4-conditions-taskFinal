package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String answer;
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            answer = "Winter";
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            answer = "Spring";
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            answer = "Summer";
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            answer = "Autumn";
        } else {
            answer = "Wrong month number";
        }
        System.out.println(answer);
    }
}
