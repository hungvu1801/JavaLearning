public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(-1);
        // System.out.println(getDigitCount(-7273));
    }
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reversNum = reverse(number);
            int countDigitNumber = getDigitCount(number);
            int countDigitReverseNumber = getDigitCount(reversNum);
            int remainder;
            String result;
            if (countDigitNumber == countDigitReverseNumber) {
                while (true) {
                    if (reversNum >= 1) {
                        remainder = reversNum % 10;
                        reversNum /= 10;
                        switch (remainder) {
                            case 1 -> result = "One";
                            case 2 -> result = "Two";
                            case 3 -> result = "Three";
                            case 4 -> result = "Four";
                            case 5 -> result = "Five";
                            case 6 -> result = "Six";
                            case 7 -> result = "Seven";
                            case 8 -> result = "Eight";
                            case 9 -> result = "Nine";
                            default -> result = "Zero";
                        }
                        System.out.print(result + " ");
                    } else break;
                }
            } else {
                while (true) {
                    if (number % 10 == 0) {
                        number /= 10;
                    } else break;
                }
                numberToWords(number);
                for (int i = 1; i <= countDigitNumber - countDigitReverseNumber; i++) {
                    System.out.print("Zero ");
                }
            }
        }

    }
    public static int reverse (int number) {
        boolean isNext = false;
        int reversNum = 0;
        int isPos = 1;
        if (number < 0) {
            isPos = -1;
        }
        number *= isPos;
        do {
            reversNum = reversNum * 10 + (number % 10);
            number /= 10;
            if (number >= 1) {
                isNext = true;
            } else isNext = false;
        } while (isNext);
        return reversNum *= isPos;
    }
    public static int getDigitCount(int number) {
        boolean isNext = false;
        int count = 0;
        if (number < 0) {
            return -1;
        };
        do {
            count += 1;
            number /= 10;
            if (number >= 1) {
                isNext = true;
            } else isNext = false;
        } while (isNext);
        return count;
    }
}
