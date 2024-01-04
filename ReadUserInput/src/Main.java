import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;
        try {
            // System.out.println(getInputFromConsole(currentYear));
            System.out.println(getInputFromScanner(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }
    public static String getInputFromConsole (int currentYear) {
        String name = System.console().readLine("Hi, what is your name? ");
        System.out.println("Hi " + name + ", have a wonderful day.");
        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "You're " + age + " years old.";
    }
    public static String getInputFromScanner (int currentYear) {
        Scanner scanner = new Scanner(System.in);
        // String name = System.console().readLine("Hi, what is your name? ");
        System.out.println("Hi, what is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", have a wonderful day.");
        // String dateOfBirth = System.console().readLine("What year were you born? ");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("What year were you born? Enter year of birth >= " + 
                (currentYear - 125) + " and <= " + currentYear);
            ;
            String dateOfBirth = scanner.nextLine();
            try {
                age = checkData(2024, dateOfBirth);
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println(badUserData);
                validDOB = false;
            }
        } while (!validDOB);
        scanner.close(); // close the resource
        return name + ", You're " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if ((dob < minimumYear) || (dob > currentYear)) return -1;

        return currentYear - dob;
    }
}
