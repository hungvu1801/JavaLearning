import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        printSumOfUserInput(2);
    }
    public static void printSumOfUserInput (int timesOfInput) {
        boolean isNext = true;
        int numCount = 1, sumOfInput = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter number " + numCount + "# : ");
                String userInputNum = scanner.nextLine();
                sumOfInput += Integer.parseInt(userInputNum);
                numCount ++;
                isNext = numCount <= timesOfInput ? true : false;
            } catch (NumberFormatException badNumber) {
                System.out.println("Invalid Number.");
            }
        } while (isNext)
        ;
        scanner.close();
        System.out.println("Sum of your inputs is " + sumOfInput + " . ");
    }
}
