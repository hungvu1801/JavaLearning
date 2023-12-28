public class NumberInWord {
    // write code here
    public static void main(String[] args) {
        printNumberInWord(1);
    }
    public static void printNumberInWord (int num) {
        String result;
        switch (num) {
            case 0 -> result = "ZERO";
            case 1 -> result = "ONE";
            case 2 -> result = "TWO";
            case 3 -> result = "THREE";
            case 4 -> result = "FOUR";
            case 5 -> result = "FIVE";
            case 6 -> result = "SIX";
            case 7 -> result = "SEVEN";
            case 8 -> result = "EIGHT";
            case 9 -> result = "NINE";
            default -> result = "OTHER";
        }
        System.out.println(result);
    }
}