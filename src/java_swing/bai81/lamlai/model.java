package java_swing.bai81.lamlai;

public class model {
    public int value;
    public model() {
        this.value = 0;
    }
    public void add() {
        value++;
    }
    public void sub() {
        value--;
    }
    public void reset() {
        value = 0;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

}
