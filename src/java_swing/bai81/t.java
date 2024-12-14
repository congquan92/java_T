package java_swing.bai81;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class t extends JFrame {
    public t() {
        this.setTitle("Test");
        this.setSize(800, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton j_tren = new JButton("Tren");
        JButton j_duoi = new JButton("Duoi");
        JButton j_trai = new JButton("Trai");
        JButton j_phai = new JButton("Phai");
        JButton j_center = new JButton("Center");

        j_tren.setSize(new Dimension(100, 100));
        j_duoi.setSize(new Dimension(200, 200));
        j_duoi.setFont(new Font("Arial", Font.BOLD, 20));


        j_tren.addActionListener(e -> {
            //lay ra ten su kien
            String text = e.getActionCommand();
            //hop thoai thong bao
            JOptionPane.showMessageDialog(null, "May vua bam nut " + text);

        });


        panel.add(j_tren, BorderLayout.NORTH);
        panel.add(j_duoi, BorderLayout.SOUTH);
        panel.add(j_trai, BorderLayout.WEST);
        panel.add(j_phai, BorderLayout.EAST);
        panel.add(j_center, BorderLayout.CENTER);

        this.add(panel);


        this.setVisible(true);
    }
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        t t = new t();
    }
}
