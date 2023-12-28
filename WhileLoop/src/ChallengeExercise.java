public class ChallengeExercise {
    public static void main(String[] args) {
        int number = 5;
        while (number <= 20) {
            if (isEvenNumber(number)) {
                System.out.println(number);
            }
            number ++;
        }
    }
    public static boolean isEvenNumber (int number) {
        if (number == 0) {
            return false;
        } else if (number % 2 == 0) {
            return true;
        } else return false;
    }
}
