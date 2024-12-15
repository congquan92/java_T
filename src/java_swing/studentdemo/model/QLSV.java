package java_swing.studentdemo.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class QLSV {
    private ArrayList<ThiSinh> dsThiSinh;
    public QLSV(){
        dsThiSinh = new ArrayList<ThiSinh>();
    }
    public QLSV(ArrayList<ThiSinh> dsThiSinh) {
        dsThiSinh = new ArrayList<ThiSinh>();
    }

    public ArrayList<ThiSinh> getDsThiSinh() {
        return dsThiSinh;
    }

    public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }
    public void insert(ThiSinh thiSinh){
        dsThiSinh.add(thiSinh);
    }
    public void delete(ThiSinh thiSinh){
        dsThiSinh.remove(thiSinh);
    }
    public void update(ThiSinh thiSinh){
        dsThiSinh.remove(thiSinh);
        dsThiSinh.add(thiSinh);
    }
}
