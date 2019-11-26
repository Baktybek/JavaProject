import java.util.Scanner;

public class anagramStringCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = input.nextLine();
        String newEmpty = "";

        if(s1.equalsIgnoreCase(s2)){
            System.out.println("It is an anagram.");
        }

        if (s1.length() == s2.length()) {
            for (int i = 0; i <= s1.length() - 1; i++) {
                for (int x = 0; x <= s2.length() - 1; x++) {
                    if (s1.charAt(i) == s2.charAt(x)){
                        newEmpty += s2.charAt(x);
                    }
                }
            }
            if(newEmpty.equalsIgnoreCase(s1)){
                System.out.println("It is an anagram.");
            }
        }
        else{
            System.out.println("Not an anagram.");
        }
    }
}