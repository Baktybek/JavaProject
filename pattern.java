
package javaapplication1;
import java.awt.*;
import java.util.Scanner;


public class pattern {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter decimal for patterns: ");
        int n = scan.nextInt();
        for(int i = 0; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
