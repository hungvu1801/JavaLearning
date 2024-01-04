public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10, 15));
    }
    public static int getGreatestCommonDivisor (int first, int second) {
        if (first < 10 || second < 10) return -1; 
        else {
            if (first == second) return first;
            else {
                int greaterVal = Math.max(first, second);
                int lesserVal = Math.min(first, second);
                for (int i = greaterVal / 2; i >= 1; i--) {
                    if ((greaterVal % i == 0) && (lesserVal % i == 0)) {
                        return i;
                    }
                }
            }
            return 1;
        }
        
    }
}
