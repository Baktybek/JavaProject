import java.util.Scanner;
import java.util.*;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many digits it will be: ");
        String number = scanner.nextLine().trim();//we are taking the input as a string
        int[] arr = new int[number.length()];//creating an array to store the elements from user input
        int armstrong = 0;
        for(int i = 0; i < number.length(); i++){
            //we are converting each char from user input into an integer and storing each value in
            //array by taking it's n'th power
            arr[i] = (int) Math.pow(Integer.parseInt(String.valueOf(number.charAt(i))), number.length());
            armstrong = armstrong + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        int number1 = Integer.parseInt(number);
        if(number1 == armstrong){
            System.out.println("It is Armstrong number.");
        }
        else{
            System.out.println("Not an Armstrong number.");
        }
    }
}
