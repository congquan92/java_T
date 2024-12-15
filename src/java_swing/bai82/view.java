package java_swing.bai82;

import javax.swing.*;
import java.awt.*;

public class view extends JFrame {
    public model value;
    public view() {
        value = new model();
        this.init();
        setVisible(true);
    }
    public void init(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setTitle("HHEHEH");
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel,BorderLayout.CENTER);

        JLabel title = new JLabel("NASA",JLabel.CENTER);
        title.setFont(new Font("Arial",Font.BOLD,20));
        panel.add(title,BorderLayout.NORTH);

        JLabel title1 = new JLabel("GIA TRI : "+value.getValue(),JLabel.CENTER);
        title.setFont(new Font("Arial",Font.BOLD,20));
        panel.add(title,BorderLayout.NORTH);


    }
}
