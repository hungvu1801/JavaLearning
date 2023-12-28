public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(-1);
    }
    public static void printFactors (int number){
        String result = "";
        if (number < 1) {
            System.out.println("Invalid Value " + number);
            return;
        }
        for (int i = 1; i <= number / 2; i++){
            if (number % i == 0) {
                result += (i + " ");
            }
        }
        result += number;
        System.out.println(result);
    }
}
