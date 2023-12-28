public class LastDigitChecker {
    public static void main(String[] args) throws Exception {
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        if (
            (!isValid(num1)) || 
            (!isValid(num2)) || 
            (!isValid(num3))
            ) {
            return false;
        }
        int right1 = num1 % 10;
        int right2 = num2 % 10;
        int right3 = num3 % 10;
        if (right1 == right2 || right1 == right3 || right2 == right3) {
            return true;
        }
        return false;
    }
    public static boolean isValid (int num) {
        if (num < 10 || num > 1000) return false;
        return true;
    }
}
