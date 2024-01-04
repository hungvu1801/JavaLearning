// USER INPUT
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
        // System.out.println(Math.round(11d/3d));
    }
    public static void inputThenPrintSumAndAverage() {
        int numSum = 0;
        double avg = 0;
        int loopTimes = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                numSum += Integer.parseInt(scanner.nextLine());
                loopTimes ++;
            } catch (NumberFormatException badUserNum) {
                break;
            }
        }
        scanner.close();
        if (loopTimes > 0) {
            avg = Math.round((double)numSum / loopTimes);
        }
        System.out.println("SUM = " + numSum + " AVG = " + (int) avg); 
    }
}
