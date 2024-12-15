package java_swing.studentdemo.model;

import java.util.Date;
import java.util.Objects;

public class ThiSinh {
    private String maThiSinh;
    private String tenThiSinh;
    private Tinh queQuan;
    private Date ngaySinh;
    private Boolean gioiTinh;
    private float diem1,diem2,diem3;
    public ThiSinh(){}
    public ThiSinh(String maThiSinh, String tenThiSinh, Tinh queQuan, Date ngaySinh, Boolean gioiTinh, float diem1, float diem2, float diem3) {
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getMaThiSinh() {
        return maThiSinh;
    }

    public void setMaThiSinh(String maThiSinh) {
        this.maThiSinh = maThiSinh;
    }

    public String getTenThiSinh() {
        return tenThiSinh;
    }

    public void setTenThiSinh(String tenThiSinh) {
        this.tenThiSinh = tenThiSinh;
    }

    public Tinh getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(Tinh queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "maThiSinh='" + maThiSinh + '\'' +
                ", tenThiSinh='" + tenThiSinh + '\'' +
                ", queQuan=" + queQuan +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh=" + gioiTinh +
                ", diem1=" + diem1 +
                ", diem2=" + diem2 +
                ", diem3=" + diem3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ThiSinh thiSinh = (ThiSinh) o;
        return Float.compare(diem1, thiSinh.diem1) == 0 && Float.compare(diem2, thiSinh.diem2) == 0 && Float.compare(diem3, thiSinh.diem3) == 0 && Objects.equals(maThiSinh, thiSinh.maThiSinh) && Objects.equals(tenThiSinh, thiSinh.tenThiSinh) && Objects.equals(queQuan, thiSinh.queQuan) && Objects.equals(ngaySinh, thiSinh.ngaySinh) && Objects.equals(gioiTinh, thiSinh.gioiTinh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maThiSinh, tenThiSinh, queQuan, ngaySinh, gioiTinh, diem1, diem2, diem3);
    }
}
