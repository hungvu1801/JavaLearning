public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2013));
    }
    public static int getEvenDigitSum (int number) {
        if (number < 0) return -1;
        boolean isNext = true;
        int sumEvenDigit = 0;
        int nextDigit = number % 10;
        if (nextDigit % 2 == 0) {
            sumEvenDigit += nextDigit;
        }
        if (number / 10 < 1) {
            isNext = false;
        }
        number /= 10;
        while (isNext) {
            nextDigit = number % 10;
            if (nextDigit % 2 == 0) {
                sumEvenDigit += nextDigit;
            }
            if (number / 10 < 1) {
                isNext = false;
            }
            number /= 10;
        }
        return sumEvenDigit;
    }
}
