public class DividedByThreeAndFive {
    public static void main(String[] args) {
        int num = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (counter == 5) break;
            if ((i % 3 == 0) && (i % 5 == 0)) {
                num = num + i;
                counter = counter + 1;
                System.out.println(i);

            }
        }
        System.out.println("Sum of num = " + num);
    }
   
}
