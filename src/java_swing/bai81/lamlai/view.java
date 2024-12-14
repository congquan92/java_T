package java_swing.bai81.lamlai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class view extends JFrame{
    public model value;
    public JLabel j_value;
    public view(){
        value = new model();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        setTitle("HEHE");
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ls = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();
                if(cmd.equals("UP")){
                    value.add();
                }else if(cmd.equals("DOWN")){
                    value.sub();
                }else if(cmd.equals("Reset")){
                    value.reset();
                }
                j_value.setText(value.getValue() + "");
            }
        };

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel tile  = new JLabel("BO DEM",JLabel.CENTER);
        tile.setFont(new Font("Arial",Font.BOLD,20));
        JButton j_up = new JButton("UP");
        j_up.addActionListener(ls);
        JButton j_down = new JButton("DOWN");
        j_down.addActionListener(ls);
        j_value = new JLabel(value.getValue()+"",JLabel.CENTER);
        JButton j_reset = new JButton("Reset");
        j_reset.addActionListener(ls);


        panel.add(j_reset,BorderLayout.SOUTH);
        panel.add(tile,BorderLayout.NORTH);
        panel.add(j_up,BorderLayout.EAST);
        panel.add(j_down,BorderLayout.WEST);
        panel.add(j_value,BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(panel,BorderLayout.CENTER);

    }

}

