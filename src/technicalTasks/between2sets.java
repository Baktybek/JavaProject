package technicalTasks;

import java.util.ArrayList;
import java.util.List;

public class between2sets {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);

        List<Integer> b = new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);

        List<Integer> l = new ArrayList<>();
        List<Integer> lR = new ArrayList<>();


        for(int i = a.get(a.size()-1); i <= b.get(0); i++){
            int c = 1;
            for(int aL = 0; aL < a.size(); aL++){
                if(i % a.get(aL) == 0){

                    if(c == a.size()){
                        l.add(i);
                    }
                    c++;
                }
            }
        }

        System.out.println(l);

        for(int j = 0; j < l.size(); j++){
            int count = 0;
            for(int x = 0; x < b.size(); x++){
                if((b.get(x)) % (l.get(j)) == 0){

                    count++;

                }
            }
            if(count == b.size()){
                lR.add(l.get(j));
            }
        }
        System.out.println(lR.size());
    }
}
