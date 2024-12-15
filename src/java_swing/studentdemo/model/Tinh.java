package java_swing.studentdemo.model;

import java.util.Objects;

public class Tinh {
    public String tenTinh;
    public int maTinh;

    public Tinh(String tenTinh, int maTinh) {
        this.tenTinh = tenTinh;
        this.maTinh = maTinh;
    }
    public Tinh(){}

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

    public int getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(int maTinh) {
        this.maTinh = maTinh;
    }

    @Override
    public String toString() {
        return "Tinh{" +
                "tenTinh='" + tenTinh + '\'' +
                ", maTinh=" + maTinh +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tinh tinh = (Tinh) o;
        return maTinh == tinh.maTinh && Objects.equals(tenTinh, tinh.tenTinh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenTinh, maTinh);
    }
}
