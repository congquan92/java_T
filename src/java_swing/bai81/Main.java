package java_swing.bai81;

import java_swing.bai81.view.CouterView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        CouterView c = new CouterView();
    }
}
