//our main class

package usingmethod;
import java.util.Scanner;
public class UsingMethod {

    public static void main(String[] args) {
      //we are creating new object from class baha  
        baha bahaObj = new baha();
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
      //calling method from baha class with created object
        bahaObj.method(x); 
    }
 }
===============================================
//baha class

package usingmethod;

public class baha {
    public void method(String s){
        System.out.println(s.length());
        aipo aipoObj = new aipo();
        aipoObj.method2(3);
    }
}
================================================
//aipo class

package usingmethod;

public class aipo {
    public void method2(int w){
        for (int i = 0; i<w; i++){
            System.out.println("I am from \'aipo\' class \'method2\' printout. ");
        }
    }
}
