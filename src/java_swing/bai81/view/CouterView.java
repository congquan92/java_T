package java_swing.bai81.view;

import java_swing.bai81.controller.CounterLis;
import java_swing.bai81.model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CouterView extends JFrame {
    private CounterModel ct;
    private JButton j_tren;
    private JButton j_duoi;
    private JLabel j_label;

    public CouterView() {
        ct = new CounterModel();
        this.init();
        this.setVisible(true);
    }
    private void init() {
        this.setTitle("Counter");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ls = new CounterLis(this);

        j_tren = new JButton("Up");
        j_tren.addActionListener(ls);

        j_duoi = new JButton("Down");
        j_duoi.addActionListener(ls);

        j_label = new JLabel(this.ct.getValue()+"",JLabel.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel.add(j_tren,BorderLayout.NORTH);
        panel.add(j_duoi,BorderLayout.SOUTH);
        panel.add(j_label,BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(panel,BorderLayout.CENTER);

    }
    public void increment() {
        this.ct.increment();
        this.j_label.setText(this.ct.getValue()+"");
    }
    public void decrement() {
        this.ct.decrement();
        this.j_label.setText(this.ct.getValue()+"");
    }


}
