public class occurenceOfChar {
    public static void main(String[] args) {
        String s = "heLLo world";

        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.contains("l") || s.contains("L")){
                System.out.println("Yes it contains the character");
            }
            else{
                System.out.println("No it doesn't.");
                break;
            }
            if(s.charAt(i) == 'l' || s.charAt(i) == 'L'){
                count++;
            }
        }
        System.out.println("Character occured: " + count + " times.");
    }
}
