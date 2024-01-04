import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        printUserMinMaxNumber();
    }
    
    public static void printUserMinMaxNumber(){
        double min = 0.0, max = 0.0;
        boolean isValid = true;
        int userNumber, loopNum = 0;
        boolean isFirstTime = true;
        Scanner scanner = new Scanner(System.in);

        while (isValid) {
            try {
                System.out.println("Enter your number : ");
                userNumber = Integer.parseInt(scanner.nextLine());
                if (isFirstTime) {
                    min = max = userNumber;
                    isFirstTime = false;
                } else {
                    min = Math.min(min, userNumber);
                    max = Math.max(max, userNumber);
                }
                loopNum ++;
            } catch (NumberFormatException badNumber) {
                isValid = false;
                break;
            }
        }
        if (loopNum > 0) {
            System.out.println("Min = " + min + " ; Max = " + max + " .");
        } else {
            System.out.println("No valid number.");
        }
        scanner.close();
    }
}
