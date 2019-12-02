import java.util.*;

public class anagramStringCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = input.nextLine();

        if(s1.length() != s2.length()){
            System.out.println("Not an anagram.");
        }

        if (s1.length() == s2.length()) {
            for (int i = 0; i <= s1.length() - 1; i++) {
                for (int x = 0; x <= s2.length() - 1; x++) {
                    if (s1.charAt(i) == s2.charAt(x)){
                        s2 = s2.substring(0, x) + s2.substring(x+1);//concatenate both parts of s2 after removing the matching character
                        break;
                    }
                }
            }
            //below here i will check if the s2 is empty after removing found(matched) characters
            if(s2.isEmpty()){
                //if it is empty that means all characters exist in both s1 & s2
                System.out.println("It is an anagram.");
            }
            else{
                System.out.println("Not an anagram.");
            }
        }
    }
}
