package java_swing.bai79;

import javax.swing.*;
import java.awt.*;

public class view1 extends JFrame {
    public view1(){
        this.setTitle("Login");
        this.setSize(800, 300);
        //can giua
        this.setLocationRelativeTo(null);

        //layout
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout1 = new GridLayout(4,5);
        GridLayout gridLayout2 = new GridLayout(2,1,10,10);


        this.setLayout(gridLayout1);


//        JButton button = new JButton("Dang Nhap");
//        JButton button1 = new JButton("Dang Ky");
//        this.add(button);
//        this.add(button1);
        for(int i = 0; i<20; i++){
            JButton button = new JButton(i+"");
            this.add(button);
        }


        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        view1 view = new view1();
    }
}

