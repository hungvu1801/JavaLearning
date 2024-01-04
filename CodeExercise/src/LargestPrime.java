public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(-1));
    }
    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;
        for (int i = 2; i <= number; i++) {
            if (i == number) return i;
            if (number % i == 0) {
                return getLargestPrime(number / i);
            }
        }
        return number;
    }
}
