import java.util.*;
import java.util.Arrays;

public class anagram {
    static void Anagram(String string1, String string2) {

        boolean check = true;
        //in this if statement we will check if the length
        //of the words are equal or not
        if(string1.length() == string2.length()) {

            char[] arrayString1 = string1.toLowerCase().toCharArray();
            char[] arrayString2 = string2.toLowerCase().toCharArray();

            Arrays.sort(arrayString1);
            Arrays.sort(arrayString2);

            if(Arrays.equals(arrayString1, arrayString2)){
                check = true;
            }else{
                check = false;
            }
        }
        //if they are not equal, automatically they are not anagrams
        //and we set status false
        else{
            check = false;
        }
        if (check) {
            System.out.println(string1.toUpperCase() + " and " + string2.toUpperCase() + " are anagrams");
        } else {
            System.out.println(string1.toUpperCase() + " and " + string2.toUpperCase() + " are not anagrams");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean userRepeat = true;
        //here we want the program to execute at least one time
        //before we can ask the user to repeat the process again
        //that's why i used do/while loop
        do {
            System.out.println("Enter the first word: ");

            String userInput1 = scan.nextLine();
            System.out.println("Enter the second word: ");
            String userInput2 = scan.nextLine();

            Anagram(userInput1, userInput2);
            System.out.println("Do you want to enter more words? YES or NO");
            String yesOrNo = scan.nextLine();

            if(yesOrNo.equalsIgnoreCase("yes")){
                userRepeat = true;
            }else if(yesOrNo.equalsIgnoreCase("no")){
                System.out.println("GOODBYE! Have a great day!");
                userRepeat = false;
            }

        }while (userRepeat);
    }
}
