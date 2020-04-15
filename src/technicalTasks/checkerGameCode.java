package technicalTasks;

import java.util.Arrays;
import java.util.Scanner;

public class checkerGameCode {

    public static void main(String[] args) {

        String[] checker = new String[6];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < checker.length; i++){
            checker[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(checker));
    }
}
/* Here is a comment **** */
/* This is also a comment /* More comments */
/* This is also a comment // More comments */
// /* This is a // // comment */
