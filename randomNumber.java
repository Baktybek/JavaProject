
package javaapplication1;
import java.util.Scanner;
import java.util.Random;
public class randomNumber {
    public static void main(String[] args){
      //Random creates random numbers
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        
        
        
        for(int i = 0; i < n; i++){
          //Each time when random number within 100 is being created 
          //it will be assigned to the according index of an array
            array[i] = rand.nextInt(100);
            System.out.print(i);
            System.out.print("-"+array[i]+" ");
            System.out.println("");
        }
      
    }
    
}
