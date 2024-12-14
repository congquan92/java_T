package java_swing.bai81.controller;
import java_swing.bai81.view.CouterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterLis implements ActionListener {
    private CouterView ct;
    public CounterLis(CouterView ct) {
        this.ct = ct;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("llll");
        String cmd = e.getActionCommand();
        if(cmd.equals("Up")){
            this.ct.increment();
        }else if(cmd.equals("Down")){
            this.ct.decrement();
        }
    }

}
