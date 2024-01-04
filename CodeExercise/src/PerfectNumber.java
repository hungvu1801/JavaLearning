public class PerfectNumber {
    public static void main(String[] args) throws Exception {
        System.out.println(isPerfectNumber(2));
    }
    public static boolean isPerfectNumber(int number){
        if (number < 1) return false;
        int sumOfDivisor = 0;
        for (int i = number / 2; i >= 1; i--) {
            if (number % i == 0) {
                sumOfDivisor += i;
            }
        }
        if (sumOfDivisor == number) return true;
        else return false;
    }
    
}
