
package javaapplication1;
import java.util.Scanner;
import java.util.Random;
public class randomNumber {
    public static void main(String[] args){
      //Random creates random numbers
        Random rand = new Random();
        System.out.println("Please enter any decimal number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        int count = 0;
        
        
        for(int i = 0; i < n; i++){
          //Each time when random number within 100 is being created 
          //it will be assigned to the according index of an array
            array[i] = rand.nextInt(100);
            System.out.print(i+1);
            System.out.print("-"+array[i]+" ");
            System.out.println("");
          //"count" will keep adding each randomly generated number and add it to the one before
            count = count + array[i];
        }
        //This will print out the average of randomly created elements of an array
        System.out.println(count/n);
      
    }
    
}
