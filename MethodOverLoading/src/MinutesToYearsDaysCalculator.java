public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        
    }
    
    public static void printYearsAndDays (long minutes) {
        long years = 0, days = 0;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else if (minutes < 1440) {
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } else if (minutes >= 1440 && minutes < 525600) {
            days = minutes / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } else if (minutes >= 525600) {
            years = minutes / 525600;
            long recalMinutes = minutes % 525600;
            days = recalMinutes / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
