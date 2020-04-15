package technicalTasks;

public class kinfrontofF {
    public static void main(String[] args) {

        String text = "fluffy";
        String text1 = text;
        String result = "";
        for (int i = 0; i < text1.length(); i++){
            if(text1.charAt(i)=='f' || text1.charAt(i) == 'F'){
                result += 'K';
            }
            result += text1.charAt(i);
        }
        System.out.println(result);
    }
}
