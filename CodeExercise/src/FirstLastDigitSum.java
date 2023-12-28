public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(101));
    }
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) return -1;
        if (number / 10 < 1) {
            return number * 2; 
        } else {
            int firstNum, lastNum;
            boolean isNext = false;
            lastNum = number % 10;
            number /= 10;
            do {
                firstNum = number % 10;
                if (number / 10 < 1) {
                    isNext = false;
                } else {
                    isNext = true;
                    number /= 10;
                }
            } while (isNext);
            return firstNum + lastNum;
        }
    }

}
