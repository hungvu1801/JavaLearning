public class Main {
    public static void main(String[] args) throws Exception {
        // int i = 1;
        // for (int a = 1; a <= 5; a++) {
        //     System.out.println(a);
        // }
        
        // while (i <= 5) {
        //     System.out.println(i);
        //     i++ ;
        // }

        // boolean isReady = false;
        // int j = 1;
        // do {
        //     if (j > 5) break;
        //     System.out.println(j);
        //     j++ ;
        // } while (isReady);
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) continue;
            System.out.print(number + "_");
        }
    }
}
