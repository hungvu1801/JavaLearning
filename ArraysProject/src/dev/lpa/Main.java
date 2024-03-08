package dev.lpa;

public class Main {
    public static void main(String[] args) {
        
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(myIntArray[i]);
        // }

        int[] firstFive = {1, 2, 3, 4, 5};
        // String[] names = {"Andy", "Bob"};
        System.out.println("first " + firstFive[4]);
        firstFive[4] = 6;
        int arrayLength = firstFive.length;
        System.out.println(firstFive[4]);
        System.out.println(arrayLength);

        int[] newArray;
        // newArray = new int[] {5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        // Enhanced for loop (for each)

    }
}
 