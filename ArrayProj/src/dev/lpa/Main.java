package dev.lpa;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] myIntArray = new int[10];

        myIntArray[5] = 50;

        double [] myDoubleArray = new double[10];

        myDoubleArray[3] = 3.5;
        System.out.println(myDoubleArray[3]);

        String[] names = {"1", "2", "3", "4"};
        System.out.println(names[0]);
        int arrayLength = myIntArray.length;

        // Different way to create an array
        int[] newArray;
        newArray = new int[] {1, 2, 3};
        // for each : enhance for loop
        for (int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArray));

        // Assign an array to an Object Variable

        Object objectVarible = newArray;
        if (objectVarible instanceof int[]) {
            System.out.print("objectVarible is really an int array.");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;
        System.out.println(Arrays.toString(objectArray));
    }
}