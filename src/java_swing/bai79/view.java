package java_swing.bai79;

import javax.swing.*;
import java.awt.*;

public class view extends JFrame {
    public view() {
        this.setTitle("Login");
        this.setSize(800, 300);
        //can giua
        this.setLocationRelativeTo(null);

        //layout
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout1 = new FlowLayout(FlowLayout.CENTER);
        FlowLayout flowLayout2 = new FlowLayout(FlowLayout.LEFT);
        FlowLayout flowLayout3 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout flowLayout4 = new FlowLayout(FlowLayout.LEADING);
        FlowLayout flowLayout5 = new FlowLayout(FlowLayout.TRAILING);


        this.setLayout(flowLayout5);


        JButton button = new JButton("Dang Nhap");
        JButton button1 = new JButton("Dang Ky");
        this.add(button);
        this.add(button1);



        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
//        view1 view = new view();
    }
}
