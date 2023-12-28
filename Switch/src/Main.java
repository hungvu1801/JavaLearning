public class Main {

    public static void main(String[] args) throws Exception {
        int switchValue = 3;
        // // Traditional switch statement
        // switch (switchValue) {
        //     case 1:
        //         System.out.println("Value was one");
        //         break;
        //     case 2:
        //         System.out.println("Value was two");
        //         break;
        //     case 3: case 4: case 5:
        //         System.out.println("Was a 3, or 4, or 5");
        //         break;
        //     default:
        //         System.out.println("Was not one or two");
        //         break;
        // }
        // Enhance switch statement
        switch (switchValue) {
            case 1 -> System.out.println("Value was one");
            case 2 -> System.out.println("Value was two");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, or 4, or 5");
            }               
            default -> System.out.println("Was not one or two");
        }
        String month = "Yo";
        System.out.println("The month " + month + " is in quarter " + getQuater(month));
    }
    public static String getQuater(String month) {
        return switch (month) {
            case "Jan", "Feb", "Mar" -> "1st";
            case "Apr", "May", "Jun" -> "2nd";
            case "Jul", "Aug", "Sep" -> "3rd" ;
            case "Oct", "Nov", "Dec" -> "4th";
            default -> {
                String badResponse = month + " is bad.";
                yield badResponse;
            }
        };
    }
}
