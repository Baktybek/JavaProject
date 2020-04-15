package technicalTasks;

import java.util.Scanner;

public class stringReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = scanner.nextLine();
        String result = "";
        for(int i = str.length()-1; i > -1; i--){
            result = result + str.charAt(i);
        }

        System.out.println(result);
    }
}
