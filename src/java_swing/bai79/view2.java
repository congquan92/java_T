package java_swing.bai79;

import javax.swing.*;
import java.awt.*;

public class view2 extends JFrame {
    public view2() {
        this.setTitle("Login");
        this.setSize(800, 300);
        //can giua
        this.setLocationRelativeTo(null);

        //layout
       BorderLayout borderLayout = new BorderLayout();
       BorderLayout borderLayout1 = new BorderLayout(10,10);

        this.setLayout(borderLayout1);


        JButton button = new JButton("1");
        JButton button1 = new JButton("2");
        this.add(BorderLayout.NORTH,button);
        this.add(BorderLayout.SOUTH,button1);



        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        view2 view = new view2();
    }
}
