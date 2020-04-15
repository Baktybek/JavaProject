package technicalTasks;

import java.util.Scanner;

public class findSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7};

        int num = scanner.nextInt();
        int count = 1;

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(num == arr[i] + arr[j]){

                    System.out.println(count + ") " + arr[i] +" + " + arr[j]);
                    count++;
                }
            }
        }

    }
}
