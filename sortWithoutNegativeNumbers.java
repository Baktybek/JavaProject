package Sprint4;

import com.sun.tools.corba.se.idl.constExpr.Negative;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class sortWithoutNegativeNumbers {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the size for your array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            int positiveCount = 0;
            for (int b = 0; b < arr.length; b++) {
                System.out.println("Enter a number for element: " + b);
                arr[b] = scanner.nextInt();
                if (arr[b] >= 0) {
                    positiveCount++;
                }
            }

            System.out.println("The given array: " + Arrays.toString(arr));

            int[] arr1 = new int[positiveCount];
            int countForPOsitives = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) {
                    arr1[countForPOsitives] = arr[i];
                    countForPOsitives++;
                }
            }

            Arrays.sort(arr1);
            System.out.println("Only 0's and positives: " + Arrays.toString(arr1));


            int[] arrResult = new int[arr.length];
            int countZ = 0;
            for (int x = 0; x < arrResult.length; x++) {
                if (arr[x] >= 0) {
                    arrResult[x] = arr1[countZ];
                    countZ++;
                } else {
                    arrResult[x] = arr[x];
                }
            }
            System.out.println("After sorting: " + Arrays.toString(arrResult));

        } catch (Exception Negative){
            System.out.println("Only integers can be input. Try again.");
        }

    }
}
