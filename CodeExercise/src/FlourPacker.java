public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
    }
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (goal < 0) return false;
        if (bigCount < 0 || smallCount < 0) return false;
  
        if (bigCount * 5 + smallCount == goal) {
            return true;
        } else if (bigCount * 5 + smallCount < goal) {
            return false;
        } else {
            if (bigCount == 0) return true;
            int numOfBig = goal / 5;
            int remainedSmallCount = goal % 5;
            if (numOfBig <= bigCount) {
                if (remainedSmallCount == 0) {
                    return true;
                } else if (remainedSmallCount > smallCount) {
                    return false;
                } else return true;
            } else return true;
        }
    }
}
