package Chapter2;

public class Case_1_ShowCurrentTime {
    public static void main(String[] args){
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        long totalDays = totalHours / 24;
        long currentDays = totalDays % 365;
        long totalYears = totalDays / 365;

        System.out.println("The current time is "+
        (1970 + totalYears) + " year " + currentDays + " days "
        + currentHours + ":" + currentMinutes + ":"
        + currentSeconds + " GMT ");
    }
}
