package java_swing.bai81.lamlai;

import javax.swing.*;

public class MAin {
    public static void main(String[] args) {
      try{
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
       }catch(Exception e){
           e.printStackTrace();
       }
        view v = new view();
    }
}
