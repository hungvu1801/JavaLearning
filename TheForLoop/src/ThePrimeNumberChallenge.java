public class ThePrimeNumberChallenge {
    public static void main(String[] args) {

        for (int a = 1; a <= 100000; a ++){
            System.out.println(a + " is " + (isPrime(a) ? "" : "NOT ") + "a prime number.");
        }
    }
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 0) return false;
        if (wholeNumber <= 3) return true;
        for (int i = wholeNumber / 2; i >= 1; i--) {
            if (i == 1) return true;
            if (wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}