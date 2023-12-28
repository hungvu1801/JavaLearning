public class Challenge1 {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6, 0));
    }

    public static double convertToCentimeters (int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters (int heightInFeet, int heightInInches) {
        int toInches = heightInFeet * 12 + heightInInches;
        return convertToCentimeters(toInches);
    }
}
