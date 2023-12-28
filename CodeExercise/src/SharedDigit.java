public class SharedDigit {
    public static void main(String[] args) {
        System.err.println(hasSharedDigit(15, 52));
    }
    public static boolean hasSharedDigit (int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }
        int hundSt, unitSt, hundNd, unitNd;
    
        unitSt = num1 % 10;
        unitNd = num2 % 10;
        hundNd = (num2 / 10) % 10 ;
        if (unitSt == unitNd || unitSt == hundNd) return true;

        hundSt = (num1 / 10) % 10 ;
        if (hundSt == unitNd || hundSt == hundNd) return true;

        return false;
    }

}
