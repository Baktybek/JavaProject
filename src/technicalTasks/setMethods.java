package technicalTasks;

import com.sun.tools.classfile.Opcode;

import java.util.HashSet;
import java.util.Set;

public class setMethods {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<Integer>();
        set1.add(0);
        set1.add(5);
        set1.add(3);
        set1.add(4);

        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println("This is the union: "+union);

        Set<Integer> intersection = new HashSet<Integer>();
        System.out.println("This is the intersection: "+set1.retainAll(set2));
        //System.out.println("This is the intersection: "+intersection);


        Set<Integer> difference = new HashSet<Integer>(set1);
        difference.removeAll(set2);
        System.out.println("This is the difference: "+difference);



    }
}
