public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(2023));
    }
    public static int sumDigits(int number) {
        if (number < 0) return -1;
        int result = 0;
        boolean isNext = false;
        do {
            if (number / 10 >= 1) {
                isNext = true;
            } else isNext = false;
            result += number % 10;
            number = number / 10;
        } while (isNext);
        return result;
    }
}
