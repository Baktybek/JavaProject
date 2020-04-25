/**
 * This code will find the first palindrome from given string if that exists and prints it out;
 * Author: Bek Uson
 */

public class palindromePrint {

    public static void main(String[] args) {
        String res = "";
        boolean flag = false;
        String str = "myakymtruck";
        //Outer for loop will check from beginning towards the end of string
        for (int i = 0; i < str.length(); i++) {
            //Inner loop will start checking from the last char of the string
            for (int j = str.length() - 1; j >= 0; j--) {
                /*This condition is to make sure that 'i' is less thn 'j'
                so that we check only until j = i + 1;
                 */
                if (i < j) {
                    //if the characters are equal then we need to substring that part of string
                    if (str.charAt(i) == str.charAt(j)) {

                        String sub = str.substring(i, j + 1);
                        //this loop will reverse the string that was cut from the original string
                        for (int a = sub.length() - 1; a >= 0; a--) {
                            res = res + sub.charAt(a);
                        }
                        //if we find that it's palindrome substring then we print
                        if (sub.equalsIgnoreCase(res)) {
                            System.out.println(res);
                            flag = true;
                        }
                        //if the substring string is not palindrome then reset 'res' to empty value
                        else{
                            res = "";
                        }
                    }
                }
            }
            //once only one palindrome is found break the loop
            if(flag == true){
                break;
            }
        }
        if(flag == false){
            System.out.println("There is no palindrome in the given string.");
        }
    }
}
