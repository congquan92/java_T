package java_swing.bai78.view;

import javax.swing.*;

//thuc te
public class MyWindow extends JFrame {
    public MyWindow() {
    }
    public void showWindow() {
        setVisible(true);
    }
    public void show(String title) {
        setTitle(title);
        this.setVisible(true);
    }
    public void show( String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        this.setVisible(true);
    }
    public void close() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow();
        myWindow.show("Test", 800, 400);
        myWindow.close();

        MyWindow myWindow2 = new MyWindow();
        myWindow2.show("Test2",300,300);
        myWindow2.close();
    }
}
