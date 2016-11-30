import java.Scanner;
package javaapplication1;

/**
 *
 * @Baktybek Tazhibaev
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
        System.out.println("Hello World1");
    }
        for(int j=0; j<5; j++){
            
            System.out.println("Please enter anything:");
            String s = sc.next();
            System.out.println(s);
    }
}
