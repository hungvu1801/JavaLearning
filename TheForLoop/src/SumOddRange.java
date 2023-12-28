public class SumOddRange {
    // write code here
    public static boolean isOdd (int number){
        if (number <= 0) return false;
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
    public static int sumOdd(int start, int end) {
        if (end < start) return -1;
        if (end * start == 0) return -1;
        if (end < 0 || start < 0) return -1;
        int result = 0;
        for (int i = start; i <= end; i++){
            if (isOdd(i)) {
                result += i;
            }
        }
        return result;
    }
}