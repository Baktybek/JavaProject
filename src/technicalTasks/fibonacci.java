package technicalTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many FIBONACCI number sequence you want to print out: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        int fib = 0;
        int current = 1;
        int previous = 1;

        for(int i = 0; i < n; i++){

            fib = current + previous;
            previous = current;
            current = fib;
            list.add(fib);
        }

        System.out.println(list);
    }
}
