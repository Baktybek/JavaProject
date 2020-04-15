package technicalTasks;

import java.util.Arrays;
import java.util.Scanner;

public class reverseInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int num = sc.nextInt();
        int result = 0;
        while (num > 0){
            result = result * 10 + Math.abs(num % 10);
            num = num / 10;
        }

        System.out.println(result);

         /*
        String str = Integer.toString(num);
        char[] arr = new char[str.length()];
        int count = 0;
        for(int i = str.length()-1; i>=0; i--){
            arr[count] = str.charAt(i);
            count++;
        }

        System.out.println(Arrays.toString(arr));

          */
    }
}
