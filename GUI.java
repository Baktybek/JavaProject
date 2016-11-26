
package gui;
import javax.swing.*;
import java.awt.*;

public class GUI {
    
    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel lab;
  //This is how we create Constructors  
    public GUI(){
  //Within constructor we create Methods
        method();
    }
  //This is our method
    public void method(){
        f = new JFrame("GUI Practice");
        f.setVisible(true);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p = new JPanel();
        p.setBackground(Color.ORANGE);
        
        b1 = new JButton("TEST");
        lab = new JLabel("This is Label");
        
        p.add(b1);
        p.add(lab);
        
        f.add(p);
    }
    
    public static void main(String[] args) {
        
        new GUI();
    }
    
}
