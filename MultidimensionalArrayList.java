import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Mutlidimensional arraylist with input from the user.
 * Author @Bek Uson
 */


public class MultiDArrayList {

    public static void main(String[] args) {
        System.out.println("Enter the size for your array: ");
        Scanner sc = new Scanner(System.in);
        ArrayList[] aL = new ArrayList[sc.nextInt()];
        for (int i = 0; i < aL.length; i++) {
            System.out.println("Enter the size for your " + (i + 1) + " list: ");
            int n = sc.nextInt();
            aL[i] = new ArrayList<String>();
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the " + (j + 1) + "th element: ");
                aL[i].add(sc.next());
            }
        }
        System.out.println(Arrays.toString(aL));
    }
}
