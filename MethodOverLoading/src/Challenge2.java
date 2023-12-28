public class Challenge2 {
    public static void main(String[] args) {
        System.out.println(getDurationString(1200, 3601));
    }
    public static String getDurationString (int seconds) {
        int minutes;
        String formattedseconds = String.format("%02d", seconds);
        // return formattedseconds;
        if (seconds < 60) {
            return "00HH 00MM " + formattedseconds + "SS";
        } 
        minutes = seconds / 60 ;
        seconds %= 60;
        return getDurationString(minutes, seconds);
        }
    
    public static String getDurationString (int minutes, int seconds) {
        if (minutes < 60 && seconds < 60) {
            String formattedseconds = String.format("%02d", seconds);
            String formattedminutes = String.format("%02d", minutes);
            return "00H "+ formattedminutes + "M " + formattedseconds + "S";
        }
        if (minutes < 60 && seconds >= 60) {
            minutes = minutes + (int) (seconds / 60);
            seconds %= 60;
            return getDurationString(minutes, seconds);
        } 
        if (minutes >= 60 && seconds < 60) {
            int hours = minutes / 60;
            minutes %= 60;
            String formattedseconds = String.format("%02d", seconds);
            String formattedminutes = String.format("%02d", minutes);
            String formattedhours = String.format("%02d", hours);
            return formattedhours + "H "+ formattedminutes + "M " + formattedseconds + "S";
        }
        if (minutes >= 60 && seconds >= 60) {
            minutes += (int) (seconds / 60);
            seconds %= 60;
            return getDurationString(minutes, seconds);
        }
        return "";
    }
}
